package fr.zom.zapi.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IWorldPosCallable;

import javax.annotation.Nullable;

public class BaseContainer extends Container
{
	protected int numRows;

	public BaseContainer(@Nullable ContainerType<?> type, int id, int numRows)
	{
		super(type, id);
		this.numRows = numRows;
	}

	public BaseContainer(ContainerType<?> type, int id, PlayerInventory playerInventoryIn, IInventory p_i50092_4_, int rows)
	{
		this(type, id, rows);
		assertInventorySize(p_i50092_4_, rows * 9);
		p_i50092_4_.openInventory(playerInventoryIn.player);
		int i = (this.numRows - 4) * 18;

		for ( int j = 0; j < this.numRows; ++j )
		{
			for ( int k = 0; k < 9; ++k )
			{
				this.addSlot(new Slot(p_i50092_4_, k + j * 9, 8 + k * 18, 18 + j * 18));
			}
		}

		for ( int l = 0; l < 3; ++l )
		{
			for ( int j1 = 0; j1 < 9; ++j1 )
			{
				this.addSlot(new Slot(playerInventoryIn, j1 + l * 9 + 9, 8 + j1 * 18, 103 + l * 18 + i));
			}
		}

		for ( int i1 = 0; i1 < 9; ++i1 )
		{
			this.addSlot(new Slot(playerInventoryIn, i1, 8 + i1 * 18, 161 + i));
		}

	}

	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
	{
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);
		if( slot != null && slot.getHasStack() )
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if( index < this.numRows * 9 )
			{
				if( !this.mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true) )
				{
					return ItemStack.EMPTY;
				}
			}
			else if( !this.mergeItemStack(itemstack1, 0, this.numRows * 9, false) )
			{
				return ItemStack.EMPTY;
			}

			if( itemstack1.isEmpty() )
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn)
	{
		return isWithinUsableDistance((IWorldPosCallable) playerIn.world, playerIn, null);
	}
}
