package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.testmod.tileentity.TestTileEntity;
import fr.zom.zapi.utils.TileEntityUtils;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTileEntity
{

	@ObjectHolder(TestMod.MODID + ":test_tile_entity")
	public static final TileEntityType<?> test_tile_entity = TileEntityUtils.createType("test_tile_entity", TestTileEntity::new);

	@SubscribeEvent
	public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> e)
	{
		e.getRegistry().register(test_tile_entity);
	}

}
