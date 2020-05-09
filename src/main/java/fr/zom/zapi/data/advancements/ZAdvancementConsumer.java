package fr.zom.zapi.data.advancements;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ZAdvancementConsumer implements Consumer<Consumer<Advancement>>
{
	private String modid;

	public ZAdvancementConsumer(String modid)
	{
		this.modid = modid;
	}

	@Override
	public void accept(Consumer<Advancement> advancementConsumer)
	{

	}

	public String getID(String name)
	{
		return modid + ":" + name;
	}

	public ResourceLocation getLocation(String name)
	{
		return new ResourceLocation(modid, name);
	}
}
