package fr.zom.zapi.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class BaseSwordItem extends SwordItem
{
	public BaseSwordItem(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
		setRegistryName(name);
	}

	public BaseSwordItem(String name, IItemTier tier, float attackSpeedIn, Properties builder)
	{
		this(name, tier, 0, attackSpeedIn, builder);
	}

	public BaseSwordItem(String name, IItemTier tier, Properties builder)
	{
		this(name, tier, 0, -2.4f, builder);
	}

	public BaseSwordItem(String name, IItemTier tier)
	{
		this(name, tier, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseSwordItem(String name, IItemTier tier, int attackDamage, float attackSpeed)
	{
		this(name, tier, attackDamage, attackSpeed, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseSwordItem(String name, IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		this(name, tier, attackDamage, attackSpeed, new Item.Properties().group(group));
	}
}
