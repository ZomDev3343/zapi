package fr.zom.zapi.data;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import fr.zom.zapi.data.loot.ZBlockLootTables;
import fr.zom.zapi.data.loot.ZEntityLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ZLootTableProvider extends LootTableProvider
{
	public ZLootTableProvider(DataGenerator dataGeneratorIn)
	{
		super(dataGeneratorIn);
	}


	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker)
	{
		map.forEach((p_218436_2_, p_218436_3_) -> {
			LootTableManager.func_227508_a_(validationtracker, p_218436_2_, p_218436_3_);
		});
	}

	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables()
	{
		return Lists.newArrayList(Pair.of(ZBlockLootTables::new, LootParameterSets.BLOCK), Pair.of(ZEntityLootTables::new, LootParameterSets.ENTITY));
	}


}
