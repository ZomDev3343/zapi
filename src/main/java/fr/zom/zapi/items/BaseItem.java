package fr.zom.zapi.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseItem extends Item
{
	public BaseItem(String name, Properties properties)
	{
		super(properties);
		setRegistryName(name);
	}

	public BaseItem(String name, ItemGroup group)
	{
		this(name, new Item.Properties().group(group));
	}

	public BaseItem(String name, ItemGroup group, int stackSize)
	{
		this(name, new Item.Properties().group(group).maxStackSize(stackSize));
	}

	public BaseItem(String name)
	{
		this(name, new Item.Properties());
	}
}
