package fr.zom.zapi.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseItem extends Item
{
	public BaseItem(Properties properties)
	{
		super(properties);
	}

	public BaseItem(ItemGroup group)
	{
		super(new Item.Properties().group(group));
	}

	public BaseItem(ItemGroup group, int stackSize)
	{
		super(new Item.Properties().group(group).maxStackSize(stackSize));
	}

	public BaseItem()
	{
		this(new Item.Properties());
	}
}
