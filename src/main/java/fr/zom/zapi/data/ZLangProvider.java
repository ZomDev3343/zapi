package fr.zom.zapi.data;

import net.minecraft.data.DataGenerator;

public class ZLangProvider extends ZLanguageProvider
{
	private final String LOCALE;

	public ZLangProvider(DataGenerator gen, String locale, String modid)
	{
		super(gen, modid, locale);
		LOCALE = locale;
	}

	@Override
	protected void addTranslations()
	{
		switch ( LOCALE )
		{
			case "en_us":

				break;

			case "fr_fr":


				break;

			default:
				break;
		}
	}
}
