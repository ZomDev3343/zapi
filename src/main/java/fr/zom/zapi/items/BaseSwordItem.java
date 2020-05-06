package fr.zom.zapi.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class BaseSwordItem extends SwordItem
{
	public BaseSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public BaseSwordItem(IItemTier tier, float attackSpeedIn, Properties builder)
	{
		super(tier, 0, attackSpeedIn, builder);
	}

	public BaseSwordItem(IItemTier tier, Properties builder)
	{
		super(tier, 0, -2.4f, builder);
	}

	public BaseSwordItem(IItemTier tier)
	{
		this(tier, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseSwordItem(IItemTier tier, int attackDamage, float attackSpeed)
	{
		super(tier, attackDamage, attackSpeed, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseSwordItem(IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		super(tier, attackDamage, attackSpeed, new Item.Properties().group(group));
	}
}
