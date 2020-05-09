package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.zapi.items.BaseItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{

	@ObjectHolder(TestMod.MODID + ":test_item")
	public static final Item test_item = new BaseItem("test_item");

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> e)
	{
		e.getRegistry().register(test_item);
	}

}
