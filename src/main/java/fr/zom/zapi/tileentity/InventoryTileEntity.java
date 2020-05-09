package fr.zom.zapi.tileentity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nonnull;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public abstract class InventoryTileEntity extends LockableTileEntity
{

	private int inventorySize;
	private String nameKey;

	public NonNullList<ItemStack> inventory;

	public InventoryTileEntity(TileEntityType<?> tileEntityTypeIn, Supplier<Callable<Void>> tickFunction)
	{
		this(tileEntityTypeIn, 9, "");
	}

	public InventoryTileEntity(TileEntityType<?> tileEntityTypeIn, int inventorySize, String nameKey)
	{
		super(tileEntityTypeIn);
		this.inventorySize = inventorySize;
		this.nameKey = nameKey;
		this.inventory = NonNullList.withSize(inventorySize, ItemStack.EMPTY);
	}

	@Override
	public void read(CompoundNBT compound)
	{
		super.read(compound);
		this.inventory = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, inventory);

	}

	@Override
	public CompoundNBT write(CompoundNBT compound)
	{
		super.write(compound);

		ItemStackHelper.saveAllItems(compound, inventory, true);

		return compound;
	}

	@Override
	public int getSizeInventory()
	{
		return inventorySize;
	}

	@Override
	public boolean isEmpty()
	{
		return inventory.isEmpty();
	}

	@Nonnull
	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return inventory.get(slot);
	}

	@Override
	public ItemStack decrStackSize(int index, int count)
	{

		ItemStack stack = inventory.get(index).copy();
		stack.setCount(stack.getCount() - count);

		inventory.set(index, stack);

		stack.setCount(count);

		return stack;
	}

	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		return inventory.remove(index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack)
	{
		inventory.set(index, stack);
		markDirty();
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player)
	{
		return player.getDistanceSq(getPos().getX(), getPos().getY(), getPos().getZ()) <= 2.5;
	}


	@Override
	public void clear()
	{
		markDirty();
	}

	@Override
	public ITextComponent getDisplayName()
	{
		return new TranslationTextComponent(nameKey);
	}

	@Override
	protected ITextComponent getDefaultName()
	{
		return new TranslationTextComponent(nameKey);
	}


	@Override
	protected Container createMenu(int id, PlayerInventory player)
	{
		return null;
	}
}
