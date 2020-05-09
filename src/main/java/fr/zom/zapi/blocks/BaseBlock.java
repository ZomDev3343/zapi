package fr.zom.zapi.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BaseBlock extends Block
{
	public BaseBlock(String name, Properties properties)
	{
		super(properties);
		setRegistryName(name);
	}

	public BaseBlock(String name, Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool, SoundType soundType)
	{
		this(name, Block.Properties.create(material).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel).harvestTool(harvestTool).sound(soundType));
	}

	public BaseBlock(String name, Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool)
	{
		this(name, material, hardness, resistance, harvestLevel, harvestTool, SoundType.STONE);
	}

	public BaseBlock(String name, Material material, float hardness, float resistance)
	{
		this(name, material, hardness, resistance, 0, ToolType.PICKAXE, SoundType.STONE);
	}

}
