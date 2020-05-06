package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.zapi.init.ContainerRegister;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;

public class ContainerInit extends ContainerRegister
{

	public static final ContainerInit INSTANCE = new ContainerInit();

	public static final RegistryObject<ContainerType<?>> APPLE_CRATE = null;

	public ContainerInit()
	{
		super(TestMod.MODID);
	}
}
