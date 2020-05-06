package fr.zom.zapi.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegister
{

	public DeferredRegister<TileEntityType<?>> REGISTRY;

	public TileEntityRegister(String modid)
	{
		this.REGISTRY = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, modid);
	}
}
