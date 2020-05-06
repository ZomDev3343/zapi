package fr.zom.zapi.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseArmorItem extends ArmorItem
{
	public BaseArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	public BaseArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot)
	{
		super(materialIn, slot, new Item.Properties().group(ItemGroup.COMBAT));
	}

	public BaseArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, ItemGroup group)
	{
		super(materialIn, slot, new Item.Properties().group(group));
	}
}
