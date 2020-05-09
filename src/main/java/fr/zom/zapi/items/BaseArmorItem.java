package fr.zom.zapi.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseArmorItem extends ArmorItem
{
	public BaseArmorItem(String name, IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		setRegistryName(name);
	}

	public BaseArmorItem(String name, IArmorMaterial materialIn, EquipmentSlotType slot)
	{
		this(name, materialIn, slot, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseArmorItem(String name, IArmorMaterial materialIn, EquipmentSlotType slot, ItemGroup group)
	{
		this(name, materialIn, slot, new Item.Properties().group(group));
	}
}
