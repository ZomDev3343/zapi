package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.testmod.tileentity.TestTileEntity;
import fr.zom.zapi.init.TileEntityRegister;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class TileEntityInit extends TileEntityRegister
{

	public static final TileEntityInit INSTANCE = new TileEntityInit();

	public static final RegistryObject<TileEntityType<?>> apple_crate = INSTANCE.REGISTRY.register("apple_crate", () -> TileEntityType.Builder.create(TestTileEntity::new, BlockInit.apple_crate.get()).build(null));

	public TileEntityInit()
	{
		super(TestMod.MODID);
	}

}
