package theboo.mods.craftablespawners.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;
import theboo.mods.craftablespawners.item.ItemCraftableSpawners;
import theboo.mods.craftablespawners.item.ItemSpawnerBuilder;

public class Config
{
    
	public static boolean display;
	
	public boolean oldRecipes;

    
    
    public void readConfig(Configuration c) {    	
    	c.load();
    	oldRecipes = c.get(c.CATEGORY_GENERAL, "Old Recipes", false, "Whether to use the old recipes (version 2.0 or lower) or the new recipes.").getBoolean(false);
    	c.save();
    }
    
    
    public void addRecipes()
    {
    	

    }
    
}