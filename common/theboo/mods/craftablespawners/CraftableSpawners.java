package theboo.mods.craftablespawners;

import net.minecraftforge.common.Configuration;
import theboo.mods.craftablespawners.common.Config;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "craftablespawners", name = "Craftable Spawners", version = "2.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CraftableSpawners
{
    
    public static Configuration config;

    @Instance("craftablespawners")
    public static CraftableSpawners instance;
    
    public static Config configInstance = new Config();
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent fml)
	{
		config = new Configuration(fml.getSuggestedConfigurationFile());
		configInstance.readConfig(config);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent fml)
	{
		configInstance.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent fml)
	{
		configInstance.name();
		configInstance.addRecipes();
	}
	
   
}
