package fr.zom.zapi.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockRegister
{

	private final ItemRegister itemRegistry;
	public DeferredRegister<Block> REGISTRY;

	public BlockRegister(String modid, ItemRegister itemRegistry)
	{
		this.REGISTRY = new DeferredRegister<>(ForgeRegistries.BLOCKS, modid);
		this.itemRegistry = itemRegistry;
	}

	protected RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
	{
		RegistryObject<Block> block = REGISTRY.register(name, supplier);
		itemRegistry.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
