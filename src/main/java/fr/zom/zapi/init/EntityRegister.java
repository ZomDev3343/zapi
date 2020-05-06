package fr.zom.zapi.init;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegister
{

	public DeferredRegister<EntityType<?>> REGISTRY;

	public EntityRegister(String modid)
	{
		this.REGISTRY = new DeferredRegister<>(ForgeRegistries.ENTITIES, modid);
	}
}
