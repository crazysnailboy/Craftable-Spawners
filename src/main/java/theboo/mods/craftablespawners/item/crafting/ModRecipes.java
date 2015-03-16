package theboo.mods.craftablespawners.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import theboo.mods.craftablespawners.CraftableSpawners;
import theboo.mods.craftablespawners.init.ModItems;

public class ModRecipes {

	
	public static void addCraftingRecipes()
	{
		
		boolean oldRecipes = CraftableSpawners.configInstance.oldRecipes;
		
    	if(oldRecipes) {
    		addV1CraftingRecipes();
    	} else {
    		addV2CraftingRecipes();
    	}

    	
     	GameRegistry.addRecipe(new ItemStack(ModItems.spawnerCore), new Object[] { 
    		"ILI", "LBL", "ILI", 'L', Items.lead, 'B', new ItemStack(Blocks.stonebrick, 1, 3), 'I', Items.iron_ingot
    	});    	
     	
     	GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner), new Object[] { 
    		"WWW", "WCW", "WWW", 'W', Blocks.iron_bars, 'C', ModItems.spawnerCore
    	});

	}
	
	public static void addSmeltingRecipes()
	{	
	}

	
	private static void addV1CraftingRecipes()
	{
		
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerBat), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerChicken), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.chicken});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerCow), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.beef});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerMooshroom), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Blocks.red_mushroom_block});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerPig), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.porkchop});       
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerOcelot), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSheep), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Blocks.wool});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSquid), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), new ItemStack(Items.dye,1,0)});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerWolf), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.bone});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerIronGolem), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSnowGolem), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.snowball});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerVillager), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.wooden_hoe});

		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerCaveSpider), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.string});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerCreeper), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.gunpowder});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerEnderman), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.ender_pearl});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSilverfish), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.fish});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSkeleton), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.arrow});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSlime), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerSpider), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.spider_eye});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerWitch), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.glass_bottle});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerZombie), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.rotten_flesh});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerBlaze), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerGhast), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.ghast_tear});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerMagmaCube), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.magma_cream});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerZombiePigman), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'), Items.gold_nugget});

		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerWither), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.nether_star});
		GameRegistry.addRecipe(new ItemStack(ModItems.spawnerEnderDragon), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('X'),  Items.diamond});

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner), new Object[] { "MIM", "I I", "MIM", Character.valueOf('M'), Blocks.mossy_cobblestone, Character.valueOf('I'), Items.iron_ingot});
	}

	private static void addV2CraftingRecipes()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerBat), new Object[] {Blocks.mob_spawner, Blocks.stone});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerChicken), new Object[] {Blocks.mob_spawner, Items.chicken});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerCow), new Object[] {Blocks.mob_spawner, Items.beef});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerHorse), new Object[] {Blocks.mob_spawner, Items.saddle});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerMooshroom), new Object[] {Blocks.mob_spawner, Blocks.red_mushroom_block});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerOcelot), new Object[] {Blocks.mob_spawner, Items.milk_bucket});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerPig), new Object[] {Blocks.mob_spawner, Items.porkchop});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSheep), new Object[] {Blocks.mob_spawner, Blocks.wool});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSquid), new Object[] {Blocks.mob_spawner, new ItemStack(Items.dye,1,0)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerWolf), new Object[] {Blocks.mob_spawner, Items.bone});
	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerIronGolem), new Object[] {Blocks.mob_spawner, Blocks.iron_block});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSnowGolem), new Object[] {Blocks.mob_spawner, Items.snowball});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerVillager), new Object[] {Blocks.mob_spawner, Items.wooden_hoe});

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerCaveSpider), new Object[] {Blocks.mob_spawner, Items.string});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerCreeper), new Object[] {Blocks.mob_spawner, Items.gunpowder});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerEnderman), new Object[] {Blocks.mob_spawner, Items.ender_pearl});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSilverfish), new Object[] {Blocks.mob_spawner, Items.fish});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSkeleton), new Object[] {Blocks.mob_spawner, Items.arrow});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSlime), new Object[] {Blocks.mob_spawner, Items.slime_ball});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerSpider), new Object[] {Blocks.mob_spawner, Items.spider_eye});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerWitch), new Object[] {Blocks.mob_spawner, Items.potionitem});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerZombie), new Object[] {Blocks.mob_spawner, Items.rotten_flesh});

    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerBlaze), new Object[] {Blocks.mob_spawner, Items.blaze_rod});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerGhast), new Object[] {Blocks.mob_spawner, Items.ghast_tear});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerMagmaCube), new Object[] {Blocks.mob_spawner, Items.magma_cream});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerZombiePigman), new Object[] {Blocks.mob_spawner, Items.gold_nugget});
    	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerWither), new Object[] {Blocks.mob_spawner, Items.nether_star});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spawnerEnderDragon), new Object[] {Blocks.mob_spawner, Items.diamond});
	}
	
	
	
}
