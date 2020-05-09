package fr.zom.zapi.utils;

import com.mojang.datafixers.types.Type;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import java.util.function.Supplier;

public class TileEntityUtils
{

	public static <T> TileEntityType<?> createType(String name, Supplier<TileEntity> tileEntitySupplier, Type<T> type)
	{
		return TileEntityType.Builder.create(tileEntitySupplier).build(type).setRegistryName(name);
	}

	public static TileEntityType<?> createType(String name, Supplier<TileEntity> tileEntitySupplier)
	{
		return TileEntityType.Builder.create(tileEntitySupplier).build(null).setRegistryName(name);
	}

}
