package fr.zom.zapi.armors;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import javax.annotation.Nullable;

public class ZArmorMaterial implements IArmorMaterial
{

	private final String name;
	private final int durability;
	private final int[] damageReductions;
	private final int enchantability;
	private final SoundEvent sound;
	private final Ingredient repairMaterial;
	private final float toughness;

	protected ZArmorMaterial(String name, int durability, int[] damageReductions, int enchantability, SoundEvent sound, @Nullable Ingredient repairMaterial, float toughness)
	{
		this.name = name;
		this.durability = durability;
		this.damageReductions = damageReductions;
		this.enchantability = enchantability;
		this.sound = sound;
		this.repairMaterial = repairMaterial;
		this.toughness = toughness;

	}

	public static IArmorMaterial createArmor(String name, int durability, int[] damageReductions, int enchantability, SoundEvent sound, @Nullable Ingredient repairMaterial, float toughness)
	{
		return new ZArmorMaterial(name, durability, damageReductions, enchantability, sound, repairMaterial, toughness);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn)
	{
		return durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn)
	{
		return damageReductions[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability()
	{
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return sound;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return repairMaterial == null ? Ingredient.EMPTY : repairMaterial;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public float getToughness()
	{
		return toughness;
	}
}
