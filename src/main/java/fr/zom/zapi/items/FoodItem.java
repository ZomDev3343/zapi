package fr.zom.zapi.items;

import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;

public class FoodItem extends BaseItem
{
	public FoodItem(String name, Properties properties)
	{
		super(name, properties);
	}

	public FoodItem(String name, ItemGroup group, Food food)
	{
		this(name, new Properties().food(food).group(group));
	}

	public FoodItem(String name, ItemGroup group, Food food, int stackSize)
	{
		this(name, new Properties().group(group).food(food).maxStackSize(stackSize));
	}

	public FoodItem(String name, Food food)
	{
		this(name, new Properties().food(food));
	}
}
