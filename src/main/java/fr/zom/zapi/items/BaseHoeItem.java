package fr.zom.zapi.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class BaseHoeItem extends HoeItem
{


	public BaseHoeItem(String name, IItemTier tier, float attackSpeedIn, Properties builder)
	{
		super(tier, attackSpeedIn, builder);
		setRegistryName(name);
	}

	public BaseHoeItem(String name, IItemTier tier, Properties builder)
	{
		this(name, tier, 0f, builder);
	}

	public BaseHoeItem(String name, IItemTier tier)
	{
		this(name, tier, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseHoeItem(String name, IItemTier tier, float attackSpeed, ItemGroup group)
	{
		this(name, tier, attackSpeed, new Properties().group(group));
	}
}
