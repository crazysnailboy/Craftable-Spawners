package theboo.mods.craftablespawners;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import theboo.mods.craftablespawners.common.Config;
import theboo.mods.craftablespawners.common.CreativeTabSpawners;
import theboo.mods.craftablespawners.init.ModItems;
import theboo.mods.craftablespawners.proxy.CommonProxy;

@Mod(modid = CraftableSpawners.MOD_ID, name = CraftableSpawners.MOD_NAME, version = CraftableSpawners.VERSION)
public class CraftableSpawners
{
	public static final String MOD_ID = "craftablespawners";
	public static final String MOD_NAME = "MightyPork's Craftable Spawners Mod";
	public static final String VERSION = "3.0-pre1";

	private static final String CLIENT_PROXY_CLASS = "theboo.mods.craftablespawners.proxy.ClientProxy";
	private static final String SERVER_PROXY_CLASS = "theboo.mods.craftablespawners.proxy.CommonProxy";
	
	
    public static Configuration config;
    
    @Instance(MOD_ID)
    public static CraftableSpawners instance;
    
    public static Config configInstance = new Config();

    
    public static CreativeTabs spawners = new CreativeTabSpawners("tapSpawners");
    
	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		configInstance.readConfig(config);
		
		ModItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModItems.register();
		proxy.registerRenders();
	}
	   
}
