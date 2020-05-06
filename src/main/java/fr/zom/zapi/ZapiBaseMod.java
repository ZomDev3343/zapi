package fr.zom.zapi;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public abstract class ZapiBaseMod implements IMod
{

	public ZapiBaseMod()
	{

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverStarting);

		MinecraftForge.EVENT_BUS.register(this);

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		addRegistries(bus);

	}

	@Override
	public void setup(FMLCommonSetupEvent e)
	{

	}

	@Override
	public void clientSetup(FMLClientSetupEvent e)
	{

	}

	@Override
	public void serverStarting(FMLServerStartingEvent e)
	{

	}

	@Override
	public void addRegistries(IEventBus bus)
	{

	}

}
