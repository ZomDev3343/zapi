package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.zapi.init.ItemRegister;
import fr.zom.zapi.items.FoodItem;
import fr.zom.zapi.utils.FoodUtils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemInit extends ItemRegister
{

	public static final ItemInit INSTANCE = new ItemInit();

	public static RegistryObject<Item> BLUE_APPLE = INSTANCE.REGISTRY.register("blue_apple", () -> new FoodItem(FoodUtils.createFood(5, 0.2f)));

	public ItemInit()
	{
		super(TestMod.MODID);
	}
}
