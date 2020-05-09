package fr.zom.zapi.tileentity;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import javax.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public abstract class BaseTileEntity extends TileEntity implements ITickable
{

	@Nullable
	protected final Supplier<Callable<Void>> tickFunction;

	public BaseTileEntity(TileEntityType<?> tileEntityTypeIn, @Nullable Supplier<Callable<Void>> tickFunction)
	{
		super(tileEntityTypeIn);
		this.tickFunction = tickFunction;
	}

	@Override
	public void read(CompoundNBT compound)
	{
		super.read(compound);
	}

	@Override
	public CompoundNBT write(CompoundNBT compound)
	{
		return super.write(compound);
	}

	@Override
	public void tick()
	{
		if( tickFunction == null )
		{
			return;
		}
		try
		{
			tickFunction.get().call();
		} catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
