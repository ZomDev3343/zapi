package fr.zom.zapi.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class BasePickaxeItem extends PickaxeItem
{
	public BasePickaxeItem(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
		setRegistryName(name);
	}

	public BasePickaxeItem(String name, IItemTier tier, float attackSpeedIn, Properties builder)
	{
		this(name, tier, 0, attackSpeedIn, builder);
	}

	public BasePickaxeItem(String name, IItemTier tier, Properties builder)
	{
		this(name, tier, 0, -2.8f, builder);
	}

	public BasePickaxeItem(String name, IItemTier tier)
	{
		this(name, tier, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BasePickaxeItem(String name, IItemTier tier, int attackDamage, float attackSpeed)
	{
		this(name, tier, attackDamage, attackSpeed, new Item.Properties().group(ItemGroup.TOOLS));
	}

	public BasePickaxeItem(String name, IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		this(name, tier, attackDamage, attackSpeed, new Item.Properties().group(group));
	}
}
