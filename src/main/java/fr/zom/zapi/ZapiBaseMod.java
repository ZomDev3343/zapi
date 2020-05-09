package fr.zom.zapi;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public abstract class ZapiBaseMod implements IMod
{
	public ZapiBaseMod()
	{

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverStarting);

		MinecraftForge.EVENT_BUS.register(this);

		registerEvents();
		registerGuis();

	}

}
