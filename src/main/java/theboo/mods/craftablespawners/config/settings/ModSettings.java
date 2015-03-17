package theboo.mods.craftablespawners.config.settings;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ModSettings
{
	
	public static int recipeVersion;

	
	public static void loadConfigurationFromFile(File file)
	{
		System.out.println("loadConfigurationFromFile");
		
		
		Configuration config = new Configuration(file);
		config.load();
		
    	recipeVersion = config.getInt("recipeVersion", config.CATEGORY_GENERAL, 3, 1, 3, "Use the recipe set from this mod version");
		System.out.println("recipeVersion: " + recipeVersion);
    	
    	config.save();
	}
		
}