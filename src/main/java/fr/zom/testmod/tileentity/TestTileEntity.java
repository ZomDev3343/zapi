package fr.zom.testmod.tileentity;

import fr.zom.testmod.init.TileEntityInit;
import fr.zom.zapi.tileentity.InventoryTileEntity;

public class TestTileEntity extends InventoryTileEntity
{
	public TestTileEntity()
	{
		super(TileEntityInit.apple_crate.get(), 18);
	}
}
