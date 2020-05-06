package fr.zom.zapi.items;

import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;

public class FoodItem extends BaseItem
{
	public FoodItem(Properties properties)
	{
		super(properties);
	}

	public FoodItem(ItemGroup group, Food food)
	{
		super(new Properties().food(food).group(group));
	}

	public FoodItem(ItemGroup group, Food food, int stackSize)
	{
		super(new Properties().group(group).food(food).maxStackSize(stackSize));
	}

	public FoodItem(Food food)
	{
		this(new Properties().food(food));
	}
}
