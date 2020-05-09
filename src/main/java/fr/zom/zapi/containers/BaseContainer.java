package fr.zom.zapi.containers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public abstract class BaseContainer extends Container
{

	private final int rows;
	private final int slotsPerRow;

	protected BaseContainer(@Nullable ContainerType<?> type, int id, int rows, int slotsPerRow)
	{
		super(type, id);
		this.rows = rows;
		this.slotsPerRow = slotsPerRow;
	}

	protected BaseContainer(@Nullable ContainerType<?> type, int id, int slots)
	{
		this(type, id, 1, slots);
	}


	@Override
	public boolean canInteractWith(PlayerEntity playerIn)
	{
		return true;
	}

	@Override
	public ItemStack transferStackInSlot(final PlayerEntity player, final int index)
	{
		final Slot slot = inventorySlots.get(index);

		if( slot != null && !slot.getStack().isEmpty() )
		{
			final ItemStack stack = slot.getStack();
			final ItemStack originalStack = stack.copy();

			if( index < rows * slotsPerRow )
			{
				if( !mergeItemStack(stack, rows * slotsPerRow, inventorySlots.size(), true) )
				{
					return ItemStack.EMPTY;
				}
			}
			else if( !mergeItemStack(stack, 0, rows * slotsPerRow, false) )
			{
				return ItemStack.EMPTY;
			}

			if( stack.isEmpty() )
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();
			}

			return originalStack;
		}

		return ItemStack.EMPTY;
	}

	protected int getRows()
	{
		return rows;
	}

	protected int getSlotsPerRow()
	{
		return slotsPerRow;
	}

}
