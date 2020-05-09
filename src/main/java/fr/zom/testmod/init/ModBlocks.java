package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.testmod.blocks.TestTileEntityBlock;
import fr.zom.zapi.blocks.BaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{

	@ObjectHolder(TestMod.MODID + ":test_block")
	public static final Block test_block = new BaseBlock("test_block", Material.ROCK, 5f, 20f);

	@ObjectHolder(TestMod.MODID + ":test_tile_entity")
	public static final Block test_tile_entity = new TestTileEntityBlock("test_tile_entity", Material.ROCK, 5f, 20f, 1, ToolType.PICKAXE, SoundType.STONE);

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> e)
	{
		e.getRegistry().registerAll(test_block, test_tile_entity);
	}

}
