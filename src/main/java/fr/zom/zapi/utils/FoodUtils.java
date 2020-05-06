package fr.zom.zapi.utils;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class FoodUtils
{

	public static Food createFood(boolean isMeat, boolean isFastToEat, int hunger, float saturation, @Nullable Supplier<EffectInstance> effect, float probability)
	{

		Food.Builder builder = new Food.Builder();

		if( isMeat )
		{
			builder.meat();
		}
		if( isFastToEat )
		{
			builder.fastToEat();
		}

		if( effect != null )
		{
			builder.effect(effect, probability);
		}
		builder.hunger(hunger).saturation(saturation);

		return builder.build();
	}

	public static Food createFood(boolean isMeat, boolean isFastToEat, int hunger, float saturation)
	{
		return createFood(isMeat, isFastToEat, hunger, saturation, null, 0);
	}

	public static Food createFood(boolean isMeat, int hunger, float saturation)
	{
		return createFood(isMeat, false, hunger, saturation, null, 0);
	}

	public static Food createFood(int hunger, float saturation)
	{
		return createFood(true, false, hunger, saturation, null, 0);
	}
}
