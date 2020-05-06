package fr.zom.zapi.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class BaseHoeItem extends HoeItem
{


	public BaseHoeItem(IItemTier tier, float attackSpeedIn, Properties builder)
	{
		super(tier, attackSpeedIn, builder);
	}

	public BaseHoeItem(IItemTier tier, Properties builder)
	{
		super(tier, 0f, builder);
	}

	public BaseHoeItem(IItemTier tier)
	{
		this(tier, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseHoeItem(IItemTier tier, float attackSpeed, ItemGroup group)
	{
		super(tier, attackSpeed, new Properties().group(group));
	}
}
