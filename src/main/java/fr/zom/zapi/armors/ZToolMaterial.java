package fr.zom.zapi.armors;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.Nullable;

public class ZToolMaterial implements IItemTier
{

	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int harvestLevel;
	private final int enchantability;
	private final Ingredient repairMaterial;

	protected ZToolMaterial(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, @Nullable Ingredient repairMaterial)
	{
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	public static IItemTier createTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, @Nullable Ingredient repairMaterial)
	{
		return new ZToolMaterial(maxUses, efficiency, attackDamage, harvestLevel, enchantability, repairMaterial);
	}

	@Override
	public int getMaxUses()
	{
		return maxUses;
	}

	@Override
	public float getEfficiency()
	{
		return efficiency;
	}

	@Override
	public float getAttackDamage()
	{
		return attackDamage;
	}

	@Override
	public int getHarvestLevel()
	{
		return harvestLevel;
	}

	@Override
	public int getEnchantability()
	{
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return repairMaterial;
	}
}
