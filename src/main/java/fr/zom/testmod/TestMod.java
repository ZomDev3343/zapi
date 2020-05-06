package fr.zom.testmod;

import fr.zom.testmod.init.BlockInit;
import fr.zom.testmod.init.ItemInit;
import fr.zom.testmod.init.TileEntityInit;
import fr.zom.zapi.ZapiBaseMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod(TestMod.MODID)
public class TestMod extends ZapiBaseMod
{

	public static final String MODID = "testmod";

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
		ItemInit.INSTANCE.REGISTRY.register(bus);
		BlockInit.INSTANCE.REGISTRY.register(bus);
		TileEntityInit.INSTANCE.REGISTRY.register(bus);
	}
}
