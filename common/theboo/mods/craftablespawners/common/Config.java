package theboo.mods.craftablespawners.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import theboo.mods.craftablespawners.item.ItemCraftableSpawners;
import theboo.mods.craftablespawners.item.ItemSpawnerBuilder;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Config
{
    public static CreativeTabs spawners = new CreativeTabSpawners(CreativeTabs.getNextID(), "Mob Spawners");
    
	public static int spawnerPigID,
	spawnerCowID;
	public static int spawnerChickenID;
	public static int spawnerSkeletonID;
	public static int spawnerSpiderID;
	public static int spawnerCreeperID;
	public static int spawnerZombieID;
	public static int spawnerSquidID;
	public static int spawnerGhastID;
	public static int spawnerPigZombieID;
	public static int spawnerSheepID;
	public static int spawnerSlimeID;
	public static int spawnerWolfID;
	public static int spawnerCaveSpiderID;
	public static int spawnerEndermanID;
	public static int spawnerSilverfishID;
	public static int spawnerBlazeID;
	public static int spawnerEDragonID;
	public static int spawnerLavaslimeID;
	public static int spawnerMooShroomID;
	public static int spawnerSnowmanID;
	public static int spawnerVillagerID;
	public static int spawnerOzelotID;
	public static int spawnerIronmanID;
	public static int spawnerWitchID;
	public static int spawnerBatID;
	public static int spawnerWitherID;
	public static int spawnerHorseID;
	
	public static int spawnerCoreID;
	
	public static boolean display;
    
    
    public static Item spawnerPig;
    public static Item spawnerCow;
    public static Item spawnerChicken;
    public static Item spawnerSkeleton;
    public static Item spawnerSpider;
    public static Item spawnerCreeper;
    public static Item spawnerZombie;
    public static Item spawnerSquid;

    public static Item spawnerGhast;
    public static Item spawnerPigZombie;
    public static Item spawnerSheep;
    public static Item spawnerSlime;
    public static Item spawnerWolf;

    public static Item spawnerCaveSpider;
    public static Item spawnerEnderman;
    public static Item spawnerSilverfish;

    public static Item spawnerBlaze;

    public static Item spawnerDragon;
    public static Item spawnerLavaSlime;
    public static Item spawnerMooShroom;
    public static Item spawnerSnowman;
    public static Item spawnerVillager;
    public static Item spawnerOzelot;
    public static Item spawnerIronman;

    public static Item spawnerWitch;
    public static Item spawnerBat;
    public static Item spawnerWither;
    
    public static Item spawnerHorse;

    public static ItemCraftableSpawners spawnerCore;

	private boolean oldRecipes;

    
    
    public void readConfig(Configuration c) {    	
    	c.load();
    	spawnerPigID = c.getItem("Pig Spawner.Id", 17560).getInt();
    	spawnerCowID = c.getItem("Cow Spawner.Id", 17561).getInt();
    	spawnerChickenID = c.getItem("Chicken Spawner.Id", 17562).getInt();
    	spawnerSkeletonID = c.getItem("Skeleton Spawner.Id", 17563).getInt();
    	spawnerSpiderID = c.getItem("Spider Spawner.Id", 17564).getInt();
    	spawnerCreeperID = c.getItem("Creeper Spawner.Id", 17565).getInt();
    	spawnerZombieID = c.getItem("Zombie Spawner.Id", 17566).getInt();
    	spawnerSquidID = c.getItem("Squid Spawner.Id", 17567).getInt();
    	spawnerGhastID = c.getItem("Ghast Spawner.Id", 17568).getInt();
    	spawnerPigZombieID = c.getItem("Zombie Pig Spawner.Id", 17569).getInt();
    	spawnerSheepID = c.getItem("Sheep Spawner.Id", 17570).getInt();
    	spawnerSlimeID = c.getItem("Slime Spawner.Id", 17571).getInt();
    	spawnerWolfID = c.getItem("Wolf Spawner.Id", 17572).getInt();
    	spawnerCaveSpiderID = c.getItem("Cave Spider Spawner.Id", 17573).getInt();
    	spawnerEndermanID = c.getItem("Enderman Spawner.Id", 17574).getInt();
    	spawnerSilverfishID = c.getItem("Silverfish Spawner.Id", 17575).getInt();
    	spawnerBlazeID = c.getItem("Blaze Spawner.Id", 17576).getInt();
    	spawnerEDragonID = c.getItem("Ender Dragon Spawner.Id", 17577).getInt();
    	spawnerLavaslimeID = c.getItem("Magma Cube Spawner.Id", 17578).getInt();
    	spawnerMooShroomID = c.getItem("Mooshroom Spawner.Id", 17579).getInt();
    	spawnerSnowmanID = c.getItem("Snowman Spawner.Id", 17587).getInt();
    	spawnerVillagerID = c.getItem("Villager Spawner.Id", 17580).getInt();
    	spawnerOzelotID = c.getItem("Ozelot Spawner.Id", 17581).getInt();
    	spawnerIronmanID = c.getItem("Iron Golem Spawner.Id", 17582).getInt();
    	spawnerWitchID = c.getItem("Witch Spawner.Id", 17583).getInt();
    	spawnerBatID = c.getItem("Bat Spawner.Id", 17584).getInt();
    	spawnerWitherID = c.getItem("Wither Spawner.Id", 17585).getInt();
    	spawnerHorseID = c.getItem("Horse Spawner.Id", 17586).getInt();

    	spawnerCoreID = c.getItem("Spawner Core.Id", 17600).getInt();
    	oldRecipes = c.get(c.CATEGORY_GENERAL, "Old Recipes", false, "Wether to use the old recipes (version 2.0 or lower) or the new recipes.").getBoolean(false);
    	c.save();
    }
    
    public void init() {
    	spawnerPig = new ItemSpawnerBuilder(spawnerPigID, "Pig", "spawnerPig").setUnlocalizedName("spawnerPig");
    	spawnerCow = new ItemSpawnerBuilder(spawnerCowID, "Cow", "spawnerCow").setUnlocalizedName("spawnerCow");
    	spawnerChicken = new ItemSpawnerBuilder(spawnerChickenID, "Chicken", "spawnerChicken").setUnlocalizedName("spawnerChicken");
    	spawnerSkeleton = new ItemSpawnerBuilder(spawnerSkeletonID, "Skeleton", "spawnerSkeleton").setUnlocalizedName("spawnerSkeleton");
    	spawnerSpider = new ItemSpawnerBuilder(spawnerSpiderID, "Spider", "spawnerSpider").setUnlocalizedName("spawnerSpider");
    	spawnerCreeper = new ItemSpawnerBuilder(spawnerCreeperID, "Creeper", "spawnerCreeper").setUnlocalizedName("spawnerCreeper");
    	spawnerZombie = new ItemSpawnerBuilder(spawnerZombieID, "Zombie", "spawnerZombie").setUnlocalizedName("spawnerZombie");
    	spawnerSquid = new ItemSpawnerBuilder(spawnerSquidID, "Squid", "spawnerSquid").setUnlocalizedName("spawnerSquid");
    	
    	spawnerGhast = new ItemSpawnerBuilder(spawnerGhastID, "Ghast", "spawnerGhast").setUnlocalizedName("spawnerGhast");
    	spawnerPigZombie = new ItemSpawnerBuilder(spawnerPigZombieID, "PigZombie", "spawnerPigZombie").setUnlocalizedName("spawnerPigZombie");
    	spawnerSheep = new ItemSpawnerBuilder(spawnerSheepID, "Sheep", "spawnerSheep").setUnlocalizedName("spawnerSheep");
    	spawnerSlime = new ItemSpawnerBuilder(spawnerSlimeID, "Slime", "spawnerSlime").setUnlocalizedName("spawnerSlime");
    	spawnerWolf = new ItemSpawnerBuilder(spawnerWolfID, "Wolf", "spawnerWolf").setUnlocalizedName("spawnerWolf");
    	
    	spawnerCaveSpider = new ItemSpawnerBuilder(spawnerCaveSpiderID, "CaveSpider", "spawnerCaveSpider").setUnlocalizedName("spawnerCaveSpider");
    	spawnerEnderman = new ItemSpawnerBuilder(spawnerEndermanID, "Enderman", "spawnerEnderman").setUnlocalizedName("spawnerEnderman");
        spawnerSilverfish = new ItemSpawnerBuilder(spawnerSilverfishID, "Silverfish", "spawnerSilverfish").setUnlocalizedName("spawnerSilverfish");

        spawnerBlaze = new ItemSpawnerBuilder(spawnerBlazeID, "Blaze", "spawnerBlaze").setUnlocalizedName("spawnerBlaze");
        
        spawnerDragon = new ItemSpawnerBuilder(spawnerEDragonID, "EnderDragon", "spawnerDragon").setUnlocalizedName("spawnerDragon");
        spawnerLavaSlime = new ItemSpawnerBuilder(spawnerLavaslimeID, "LavaSlime", "spawnerLavaSlime").setUnlocalizedName("spawnerLavaSlime");
        spawnerMooShroom = new ItemSpawnerBuilder(spawnerMooShroomID, "MushroomCow", "spawnerRedCow").setUnlocalizedName("spawnerRedCow");
        spawnerSnowman = new ItemSpawnerBuilder(spawnerSnowmanID, "SnowMan", "spawnerSnowman").setUnlocalizedName("spawnerSnowman");
        spawnerVillager = new ItemSpawnerBuilder(spawnerVillagerID, "Villager", "spawnerVillager").setUnlocalizedName("spawnerVillager");
        spawnerOzelot = new ItemSpawnerBuilder(spawnerOzelotID, "Ozelot", "spawnerOzelot").setUnlocalizedName("spawnerOzelot");
        spawnerIronman = new ItemSpawnerBuilder(spawnerIronmanID, "VillagerGolem", "spawnerIronman").setUnlocalizedName("spawnerIronman");
        
        spawnerWitch = new ItemSpawnerBuilder(spawnerWitchID, "Witch", "spawnerWitch").setUnlocalizedName("spawnerWitch");
        spawnerBat = new ItemSpawnerBuilder(spawnerBatID, "Bat", "spawnerBat").setUnlocalizedName("spawnerBat");
        spawnerWither = new ItemSpawnerBuilder(spawnerWitherID, "WitherBoss", "spawnerWither").setUnlocalizedName("spawnerWither");
    
        spawnerHorse = new ItemSpawnerBuilder(spawnerHorseID, "EntityHorse", "spawnerHorse").setUnlocalizedName("spawnerHorse");

        spawnerCore = (ItemCraftableSpawners) new ItemCraftableSpawners(spawnerCoreID, "spawnerCore").setUnlocalizedName("spawnerCore");

    }    
    
    public void name()   {
    	LanguageRegistry.addName(spawnerPig, "Pig Spawner");
    	LanguageRegistry.addName(spawnerCow, "Cow Spawner");
    	LanguageRegistry.addName(spawnerChicken, "Chicken Spawner");
    	LanguageRegistry.addName(spawnerSkeleton, "Skeleton Spawner");
    	LanguageRegistry.addName(spawnerSpider, "Spider Spawner");
    	LanguageRegistry.addName(spawnerCreeper, "Creeper Spawner");
		LanguageRegistry.addName(spawnerZombie, "Zombie Spawner");
		LanguageRegistry.addName(spawnerGhast, "Ghast Spawner");
		LanguageRegistry.addName(spawnerPigZombie, "Zombie Pigman Spawner");
		LanguageRegistry.addName(spawnerSheep, "Sheep Spawner");
		LanguageRegistry.addName(spawnerSlime, "Slime Spawner");
		LanguageRegistry.addName(spawnerWolf, "Wolf Spawner");
		LanguageRegistry.addName(spawnerSquid, "Squid Spawner");

		LanguageRegistry.addName(spawnerCaveSpider, "Cave Spider Spawner");
		LanguageRegistry.addName(spawnerEnderman, "Enderman Spawner");
		LanguageRegistry.addName(spawnerSilverfish, "Silverfish Spawner");

		LanguageRegistry.addName(spawnerBlaze, "Blaze Spawner");
		LanguageRegistry.addName(spawnerDragon, "Ender Dragon Spawner");
		LanguageRegistry.addName(spawnerLavaSlime, "Magma Cube Spawner");
		LanguageRegistry.addName(spawnerMooShroom, "Mooshroom Spawner");
		LanguageRegistry.addName(spawnerSnowman, "Snowman Spawner");
		LanguageRegistry.addName(spawnerVillager, "Villager Spawner");
		LanguageRegistry.addName(spawnerOzelot, "Ocelot Spawner");
		LanguageRegistry.addName(spawnerIronman, "Iron Golem Spawner");
		LanguageRegistry.addName(spawnerWitch, "Witch Spawner");
		LanguageRegistry.addName(spawnerBat, "Bat Spawner");
		LanguageRegistry.addName(spawnerWither, "Wither Spawner");
		
		LanguageRegistry.addName(spawnerHorse, "Horse Spawner");
		
		LanguageRegistry.addName(spawnerCore, "Spawner Core");
    }
    
    public void addRecipes()
    {
    	if(oldRecipes) {    		
    		GameRegistry.addRecipe(new ItemStack(spawnerPig), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.porkRaw});       
    		GameRegistry.addRecipe(new ItemStack(spawnerChicken), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.chickenRaw});
    		GameRegistry.addRecipe(new ItemStack(spawnerCow), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.beefRaw});
    		GameRegistry.addRecipe(new ItemStack(spawnerSkeleton), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.arrow});
    		GameRegistry.addRecipe(new ItemStack(spawnerSpider), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.spiderEye});
    		GameRegistry.addRecipe(new ItemStack(spawnerCreeper), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.gunpowder});
			GameRegistry.addRecipe(new ItemStack(spawnerZombie), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.rottenFlesh});
			GameRegistry.addRecipe(new ItemStack(spawnerSquid), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), new ItemStack(Item.dyePowder,1,0)});

			GameRegistry.addRecipe(new ItemStack(spawnerGhast), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.ghastTear});
			GameRegistry.addRecipe(new ItemStack(spawnerPigZombie), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.goldNugget});
			GameRegistry.addRecipe(new ItemStack(spawnerSheep), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Block.cloth});
			GameRegistry.addRecipe(new ItemStack(spawnerSlime), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.slimeBall});
			GameRegistry.addRecipe(new ItemStack(spawnerWolf), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.bone});

			GameRegistry.addRecipe(new ItemStack(spawnerCaveSpider), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Item.silk});

			GameRegistry.addRecipe(new ItemStack(spawnerEnderman), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.enderPearl});

			GameRegistry.addRecipe(new ItemStack(spawnerSilverfish), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.fishRaw});

			GameRegistry.addRecipe(new ItemStack(spawnerBlaze), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.blazeRod});
			GameRegistry.addRecipe(new ItemStack(spawnerDragon), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.diamond});
			GameRegistry.addRecipe(new ItemStack(spawnerLavaSlime), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.magmaCream});
			GameRegistry.addRecipe(new ItemStack(spawnerMooShroom), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Block.mushroomRed});
			GameRegistry.addRecipe(new ItemStack(spawnerSnowman), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.snowball});
			GameRegistry.addRecipe(new ItemStack(spawnerVillager), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.hoeWood});



			GameRegistry.addRecipe(new ItemStack(spawnerVillager), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.hoeWood});


			GameRegistry.addRecipe(new ItemStack(spawnerOzelot), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.bucketMilk});
			GameRegistry.addRecipe(new ItemStack(spawnerIronman), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Block.blockIron});
        
			GameRegistry.addRecipe(new ItemStack(spawnerWitch), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.glassBottle});
			GameRegistry.addRecipe(new ItemStack(spawnerBat), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Block.stone});
			GameRegistry.addRecipe(new ItemStack(spawnerWither), new Object[] { "MIM", "IXI", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'),  Item.netherStar});



			//GameRegistry.addRecipe(new ItemStack(Block.mobSpawner), new Object[] { "MIM", "I I", "MIM", Character.valueOf('M'), Block.cobblestoneMossy, Character.valueOf('I'), Item.ingotIron});
    	} else { //===================================================================================================================
    		GameRegistry.addShapelessRecipe(new ItemStack(spawnerPig), new Object[] {Block.mobSpawner, Item.porkRaw});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerChicken), new Object[] {Block.mobSpawner, Item.chickenRaw});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerCow), new Object[] {Block.mobSpawner, Item.beefRaw});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerSkeleton), new Object[] {Block.mobSpawner, Item.arrow});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerSpider), new Object[] {Block.mobSpawner, Item.spiderEye});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerCreeper), new Object[] {Block.mobSpawner, Item.gunpowder});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerZombie), new Object[] {Block.mobSpawner, Item.rottenFlesh});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerSquid), new Object[] {Block.mobSpawner, new ItemStack(Item.dyePowder,1,0)});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerGhast), new Object[] {Block.mobSpawner, Item.ghastTear});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerPigZombie), new Object[] {Block.mobSpawner, Item.goldNugget});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerSheep), new Object[] {Block.mobSpawner, Block.cloth});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerSlime), new Object[] {Block.mobSpawner, Item.slimeBall});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerWolf), new Object[] {Block.mobSpawner, Item.bone});

        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerCaveSpider), new Object[] {Block.mobSpawner, Item.silk});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerEnderman), new Object[] {Block.mobSpawner, Item.enderPearl});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerSilverfish), new Object[] {Block.mobSpawner, Item.fishRaw});

        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerBlaze), new Object[] {Block.mobSpawner, Item.blazeRod});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerDragon), new Object[] {Block.mobSpawner, Item.diamond});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerLavaSlime), new Object[] {Block.mobSpawner, Item.magmaCream});
        	GameRegistry.addShapelessRecipe(new ItemStack(spawnerMooShroom), new Object[] {Block.mobSpawner, Block.mushroomRed});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerSnowman), new Object[] {Block.mobSpawner, Item.snowball});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerVillager), new Object[] {Block.mobSpawner, Item.hoeWood});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerOzelot), new Object[] {Block.mobSpawner, Item.bucketMilk});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerIronman), new Object[] {Block.mobSpawner, Block.blockIron});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerWitch), new Object[] {Block.mobSpawner, Item.potion});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerBat), new Object[] {Block.mobSpawner, Block.stone});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerWither), new Object[] {Block.mobSpawner, Item.netherStar});
			GameRegistry.addShapelessRecipe(new ItemStack(spawnerHorse), new Object[] {Block.mobSpawner, Item.saddle});
    	}
    	

     	GameRegistry.addRecipe(new ItemStack(spawnerCore), new Object[] { 
    		"ILI", "LBL", "ILI", 'L', Item.field_111214_ch, 'B', new ItemStack(Block.stoneBrick, 1, 3), 'I', Item.ingotIron
    	});    	
     	
     	GameRegistry.addRecipe(new ItemStack(Block.mobSpawner), new Object[] { 
    		"WWW", "WCW", "WWW", 'W', Block.fenceIron, 'C', spawnerCore
    	});
    }
    
}