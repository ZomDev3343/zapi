package fr.zom.zapi.init;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerRegister
{


	public DeferredRegister<ContainerType<?>> REGISTRY;

	public ContainerRegister(String modid)
	{
		this.REGISTRY = new DeferredRegister<>(ForgeRegistries.CONTAINERS, modid);
	}

}
