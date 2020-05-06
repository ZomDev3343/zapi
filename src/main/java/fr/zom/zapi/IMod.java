package fr.zom.zapi;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

public interface IMod
{

	void setup(final FMLCommonSetupEvent e);

	void clientSetup(final FMLClientSetupEvent e);

	void serverStarting(final FMLServerStartingEvent e);

	void addRegistries(final IEventBus bus);

}
