package fr.zom.zapi.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class BasePickaxeItem extends PickaxeItem
{
	public BasePickaxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public BasePickaxeItem(IItemTier tier, float attackSpeedIn, Properties builder)
	{
		super(tier, 0, attackSpeedIn, builder);
	}

	public BasePickaxeItem(IItemTier tier, Properties builder)
	{
		super(tier, 0, -2.8f, builder);
	}

	public BasePickaxeItem(IItemTier tier)
	{
		this(tier, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BasePickaxeItem(IItemTier tier, int attackDamage, float attackSpeed)
	{
		super(tier, attackDamage, attackSpeed, new Item.Properties().group(ItemGroup.TOOLS));
	}

	public BasePickaxeItem(IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		super(tier, attackDamage, attackSpeed, new Item.Properties().group(group));
	}
}
