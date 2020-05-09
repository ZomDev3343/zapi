package fr.zom.zapi.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public abstract class BaseTileEntityBlock extends BaseBlock
{

	protected Supplier<? extends TileEntity> tileEntity;

	public BaseTileEntityBlock(String name, Supplier<? extends TileEntity> tileEntity, Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool, SoundType soundType)
	{
		super(name, material, hardness, resistance, harvestLevel, harvestTool, soundType);
		this.tileEntity = tileEntity;
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world)
	{
		return tileEntity.get();
	}

	@Override
	public boolean hasTileEntity(BlockState state)
	{
		return true;
	}

}
