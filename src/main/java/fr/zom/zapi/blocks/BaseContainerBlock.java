package fr.zom.zapi.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class BaseContainerBlock extends ContainerBlock
{

	private final Supplier<? extends TileEntity> tileEntity;

	public BaseContainerBlock(Supplier<? extends TileEntity> tileEntity, Properties builder)
	{
		super(builder);
		this.tileEntity = tileEntity;
	}

	@Override
	public boolean hasTileEntity(BlockState state)
	{
		return true;
	}

	@Nullable
	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn)
	{
		return tileEntity.get();
	}

}
