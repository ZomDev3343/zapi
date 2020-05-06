package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.testmod.tileentity.TestTileEntity;
import fr.zom.zapi.blocks.BaseTileEntityBlock;
import fr.zom.zapi.init.BlockRegister;
import net.minecraft.block.Block;
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
import net.minecraftforge.fml.RegistryObject;

public class BlockInit extends BlockRegister
{

	public static final BlockInit INSTANCE = new BlockInit();

	public static final RegistryObject<Block> apple_crate = INSTANCE.createBlock("apple_crate", () -> new BaseTileEntityBlock(TestTileEntity::new, Material.WOOD, 5.0f, 20.f, 1, ToolType.AXE, SoundType.WOOD)
	{

		@Override
		public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
		{

			if( !worldIn.isRemote )
			{
				if( worldIn.getTileEntity(pos) instanceof TestTileEntity )
				{
					TestTileEntity tileEntity = ((TestTileEntity) worldIn.getTileEntity(pos));

					String stackName = tileEntity.getStackInSlot(0).getItem().getName().getFormattedText();

					player.sendMessage(new StringTextComponent(stackName));
				}

			}

			return ActionResultType.FAIL;
		}
	});

	public BlockInit()
	{
		super(TestMod.MODID, ItemInit.INSTANCE);
	}
}
