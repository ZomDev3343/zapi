package fr.zom.zapi.data;

import fr.zom.zapi.data.item.ZItemBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;

public class ZItemModelProvider extends ModelProvider<ItemModelBuilder>
{

	private final String modid;

	public ZItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper, String modid)
	{
		super(generator, modid, "item", ZItemBuilder::new, existingFileHelper);
		this.modid = modid;
	}

	@Override
	protected void registerModels()
	{

	}

	@Override
	public String getName()
	{
		return modid + ".item_models_generator";
	}

	private void layer0(final Item item)
	{
		singleTexture(item.getRegistryName().getPath(), mcLoc("generated"), "layer0", modLoc("item/" + item.getRegistryName().getPath()));
	}

	private void tool(final Item item)
	{
		singleTexture(item.getRegistryName().getPath(), mcLoc("handheld"), "layer0", modLoc("item/" + item.getRegistryName().getPath()));
	}
}
