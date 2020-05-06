package fr.zom.zapi.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class BaseAxeItem extends AxeItem
{
	public BaseAxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public BaseAxeItem(IItemTier tier, float attackSpeedIn, Properties builder)
	{
		super(tier, 0, attackSpeedIn, builder);
	}

	public BaseAxeItem(IItemTier tier, Properties builder)
	{
		super(tier, 0, -2.8f, builder);
	}

	public BaseAxeItem(IItemTier tier)
	{
		this(tier, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseAxeItem(IItemTier tier, int attackDamage, float attackSpeed)
	{
		super(tier, attackDamage, attackSpeed, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseAxeItem(IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		super(tier, attackDamage, attackSpeed, new Properties().group(group));
	}
}
