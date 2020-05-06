package fr.zom.zapi.data.block;

import com.google.common.base.Preconditions;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class ZBlockModelBuilder extends BlockModelBuilder
{
	public ZBlockModelBuilder(ResourceLocation outputLocation, ExistingFileHelper existingFileHelper)
	{
		super(outputLocation, existingFileHelper);
	}

	@Override
	public BlockModelBuilder texture(String key, ResourceLocation texture)
	{
		Preconditions.checkNotNull(key, "Key must not be null");
		Preconditions.checkNotNull(texture, "Texture must not be null");
		this.textures.put(key, texture.toString());
		return this;
	}
}
