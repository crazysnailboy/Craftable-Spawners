package theboo.mods.craftablespawners;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import theboo.mods.craftablespawners.config.settings.ModSettings;
import theboo.mods.craftablespawners.init.ModBootstrap;
import theboo.mods.craftablespawners.init.ModItems;
import theboo.mods.craftablespawners.item.crafting.ModRecipes;
import theboo.mods.craftablespawners.proxy.CommonProxy;

@Mod(modid = ModBootstrap.MOD_ID, name = ModBootstrap.MOD_NAME, version = ModBootstrap.VERSION)
public class CraftableSpawners
{

	private static final String CLIENT_PROXY_CLASS = "theboo.mods.craftablespawners.proxy.ClientProxy";
	private static final String SERVER_PROXY_CLASS = "theboo.mods.craftablespawners.proxy.CommonProxy";

    
	public static CreativeTabs spawners = new CreativeTabs("tabSpawners")
	{
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(Blocks.mob_spawner);
		}
	};

	
	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("CraftableSpawners.preInit");
		
		ModSettings.loadConfigurationFromFile(event.getSuggestedConfigurationFile());
		
		ModItems.initializeItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("CraftableSpawners.init");
		
		ModItems.registerItems();
		ModRecipes.addCraftingRecipes();
		
		proxy.registerRenders();
	}
	   
}
