package fr.zom.zapi.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;

public class BaseShoveltem extends AxeItem
{
	public BaseShoveltem(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
		setRegistryName(name);
	}

	public BaseShoveltem(String name, IItemTier tier, float attackSpeedIn, Properties builder)
	{
		this(name, tier, 0, attackSpeedIn, builder);
	}

	public BaseShoveltem(String name, IItemTier tier, Properties builder)
	{
		this(name, tier, 0, -2.8f, builder);
	}

	public BaseShoveltem(String name, IItemTier tier)
	{
		this(name, tier, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseShoveltem(String name, IItemTier tier, int attackDamage, float attackSpeed)
	{
		this(name, tier, attackDamage, attackSpeed, new Properties().group(ItemGroup.TOOLS));
	}

	public BaseShoveltem(String name, IItemTier tier, int attackDamage, float attackSpeed, ItemGroup group)
	{
		this(name, tier, attackDamage, attackSpeed, new Properties().group(group));
	}
}
