package fr.zom.zapi.data;

import fr.zom.zapi.data.block.ZBlockModelBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelProvider;

public class ZBlockModelProvider extends ModelProvider<BlockModelBuilder>
{

	private final String modid;

	public ZBlockModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, String modid)
	{
		super(generator, modid, "block", ZBlockModelBuilder::new, existingFileHelper);
		this.modid = modid;
	}

	@Override
	protected void registerModels()
	{
		//cubeAll(BlockInit.tailor_table.getRegistryName().getPath(), modLoc("tailor_table"));
	}

	@Override
	public void clear()
	{
		super.clear();
	}

	@Override
	public void generateAll(DirectoryCache cache)
	{
		super.generateAll(cache);
	}

	@Override
	public String getName()
	{
		return modid + "block_models_generator";
	}
}
