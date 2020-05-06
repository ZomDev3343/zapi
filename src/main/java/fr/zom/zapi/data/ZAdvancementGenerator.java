package fr.zom.zapi.data;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.zom.zapi.data.advancements.ZAdvancementConsumer;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.AdvancementProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ZAdvancementGenerator extends AdvancementProvider
{
	private final List<Consumer<Consumer<Advancement>>> advancements;
	private final DataGenerator generator;
	private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();

	public ZAdvancementGenerator(DataGenerator generatorIn, String modid)
	{
		super(generatorIn);
		generator = generatorIn;
		advancements = ImmutableList.of(new ZAdvancementConsumer(modid));
	}

	@Override
	public void act(DirectoryCache cache) throws IOException
	{
		Path path = this.generator.getOutputFolder();
		Set<ResourceLocation> set = Sets.newHashSet();
		Consumer<Advancement> consumer = (p_204017_3_) -> {
			if( !set.add(p_204017_3_.getId()) )
			{
				throw new IllegalStateException("Duplicate advancement " + p_204017_3_.getId());
			}
			else
			{
				Path path1 = getPath(path, p_204017_3_);

				try
				{
					IDataProvider.save(GSON, cache, p_204017_3_.copy().serialize(), path1);
				} catch ( IOException ioexception )
				{
					System.out.println(String.format("Couldn't save advancement {}", path1, ioexception));
				}

			}
		};

		for ( Consumer<Consumer<Advancement>> consumer1 : this.advancements )
		{
			consumer1.accept(consumer);
		}
	}

	private static Path getPath(Path pathIn, Advancement advancementIn)
	{
		return pathIn.resolve("data/" + advancementIn.getId().getNamespace() + "/advancements/" + advancementIn.getId().getPath() + ".json");
	}
}
