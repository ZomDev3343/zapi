package fr.zom.zapi.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BaseBlock extends Block
{
	public BaseBlock(Properties properties)
	{
		super(properties);
	}

	public BaseBlock(Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool, SoundType soundType)
	{
		super(Block.Properties.create(material).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel).harvestTool(harvestTool).sound(soundType));
	}

	public BaseBlock(Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool)
	{
		this(material, hardness, resistance, harvestLevel, harvestTool, SoundType.STONE);
	}

	public BaseBlock(Material material, float hardness, float resistance)
	{
		this(material, hardness, resistance, 0, ToolType.PICKAXE, SoundType.STONE);
	}

}
