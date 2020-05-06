package fr.zom.zapi.init;

import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister
{

	public DeferredRegister<Item> REGISTRY;

	public ItemRegister(String modid)
	{
		this.REGISTRY = new DeferredRegister<>(ForgeRegistries.ITEMS, modid);
	}
}
