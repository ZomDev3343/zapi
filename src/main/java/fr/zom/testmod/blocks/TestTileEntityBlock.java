package fr.zom.testmod.blocks;

import fr.zom.testmod.tileentity.TestTileEntity;
import fr.zom.zapi.blocks.BaseTileEntityBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class TestTileEntityBlock extends BaseTileEntityBlock
{
	public TestTileEntityBlock(String name, Material material, float hardness, float resistance, int harvestLevel, ToolType harvestTool, SoundType soundType)
	{
		super(name, TestTileEntity::new, material, hardness, resistance, harvestLevel, harvestTool, soundType);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
	{

		if( !worldIn.isRemote )
		{
			player.sendMessage(new StringTextComponent("salut"));
			return ActionResultType.SUCCESS;
		}

		return ActionResultType.CONSUME;
	}
}
