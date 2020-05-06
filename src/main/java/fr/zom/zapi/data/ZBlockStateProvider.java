package fr.zom.zapi.data;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.IGeneratedBlockstate;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class ZBlockStateProvider extends BlockStateProvider
{

	private final ZBlockModelProvider blockModelProvider;
	private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
	private final DataGenerator gen;

	public ZBlockStateProvider(DataGenerator gen, ZBlockModelProvider blockModelProvider, ExistingFileHelper exFileHelper, String modid)
	{
		super(gen, modid, exFileHelper);
		this.gen = gen;
		this.blockModelProvider = blockModelProvider;
	}

	ZBlockModelProvider customModels()
	{
		return this.blockModelProvider;
	}

	@Override
	public void act(DirectoryCache cache) throws IOException
	{
		customModels().clear();
		registeredBlocks.clear();
		registerStatesAndModels();
		customModels().generateAll(cache);
		for ( Map.Entry<Block, IGeneratedBlockstate> entry : registeredBlocks.entrySet() )
		{
			saveBlockState(cache, entry.getValue().toJson(), entry.getKey());
		}
	}

	private void saveBlockState(DirectoryCache cache, JsonObject stateJson, Block owner)
	{
		ResourceLocation blockName = Preconditions.checkNotNull(owner.getRegistryName());
		Path mainOutput = gen.getOutputFolder();
		String pathSuffix = "assets/" + blockName.getNamespace() + "/blockstates/" + blockName.getPath() + ".json";
		Path outputPath = mainOutput.resolve(pathSuffix);
		try
		{
			IDataProvider.save(GSON, cache, stateJson, outputPath);
		} catch ( IOException e )
		{
			System.out.println(String.format("Couldn't save blockstate to {}", outputPath, e));
		}
	}

	@Override
	protected void registerStatesAndModels()
	{
	}

}
