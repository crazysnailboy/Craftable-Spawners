package theboo.mods.craftablespawners.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import theboo.mods.craftablespawners.CraftableSpawners;
import theboo.mods.craftablespawners.item.ItemCraftableSpawners;
import theboo.mods.craftablespawners.item.ItemSpawnerBuilder;
import theboo.mods.craftablespawners.item.crafting.ModRecipes;

public class ModItems {

    public static Item spawnerBat;
	public static Item spawnerChicken;	
	public static Item spawnerCow;
	public static Item spawnerHorse;
	public static Item spawnerMooshroom;
	public static Item spawnerOcelot;
	public static Item spawnerPig;	
	public static Item spawnerRabbit;
	public static Item spawnerSheep;
	public static Item spawnerSquid;
    public static Item spawnerWolf;

    public static Item spawnerIronGolem;
    public static Item spawnerSnowGolem;
    public static Item spawnerVillager;

	public static Item spawnerCaveSpider;
	public static Item spawnerCreeper;
	public static Item spawnerElderGuardian;
	public static Item spawnerEnderman; 
	public static Item spawnerEndermite;
	public static Item spawnerGuardian;
	public static Item spawnerKillerRabbit;
	public static Item spawnerSilverfish;
	public static Item spawnerSkeleton;
	public static Item spawnerSlime;
	public static Item spawnerSpider;
	public static Item spawnerWitch;
	public static Item spawnerZombie;	

	public static Item spawnerBlaze;
    public static Item spawnerGhast;
    public static Item spawnerMagmaCube;
    public static Item spawnerWitherSkeleton;
    public static Item spawnerZombiePigman;
    
	public static Item spawnerWither;
    public static Item spawnerEnderDragon;
    
    public static Item spawnerCore;
	
	
	public static void init()
	{	
		initializeItems();
	}
	
	public static void register()
	{
		registerItems();
		ModRecipes.addCraftingRecipes();
	}
	
	public static void registerRenders()
	{
		registerInventoryModels();
	}
	
	


	private static void initializeItems()
	{
        spawnerCore = new ItemCraftableSpawners().setUnlocalizedName("spawnerCore");

        spawnerBat = new ItemSpawnerBuilder("Bat").setUnlocalizedName("spawnerBat");
    	spawnerChicken = new ItemSpawnerBuilder("Chicken").setUnlocalizedName("spawnerChicken");
    	spawnerCow = new ItemSpawnerBuilder("Cow").setUnlocalizedName("spawnerCow");
        spawnerHorse = new ItemSpawnerBuilder("EntityHorse").setUnlocalizedName("spawnerHorse");
        spawnerMooshroom = new ItemSpawnerBuilder("MushroomCow").setUnlocalizedName("spawnerMooshroom");
        spawnerOcelot = new ItemSpawnerBuilder("Ozelot").setUnlocalizedName("spawnerOcelot");
    	spawnerPig = new ItemSpawnerBuilder("Pig").setUnlocalizedName("spawnerPig");
    	spawnerRabbit = new ItemSpawnerBuilder("Rabbit").setUnlocalizedName("spawnerRabbit");
    	spawnerSheep = new ItemSpawnerBuilder("Sheep").setUnlocalizedName("spawnerSheep");
    	spawnerSquid = new ItemSpawnerBuilder("Squid").setUnlocalizedName("spawnerSquid");
    	spawnerWolf = new ItemSpawnerBuilder("Wolf").setUnlocalizedName("spawnerWolf");
    	
        spawnerIronGolem = new ItemSpawnerBuilder("VillagerGolem").setUnlocalizedName("spawnerIronGolem");
        spawnerSnowGolem = new ItemSpawnerBuilder("SnowMan").setUnlocalizedName("spawnerSnowGolem");
        spawnerVillager = new ItemSpawnerBuilder("Villager").setUnlocalizedName("spawnerVillager");
    	
    	spawnerCaveSpider = new ItemSpawnerBuilder("CaveSpider").setUnlocalizedName("spawnerCaveSpider");
    	spawnerCreeper = new ItemSpawnerBuilder("Creeper").setUnlocalizedName("spawnerCreeper");
		spawnerElderGuardian = new ItemSpawnerBuilder("Guardian").setSpawnDataByte("Elder", (byte)1).setUnlocalizedName("spawnerElderGuardian");
    	spawnerEnderman = new ItemSpawnerBuilder("Enderman").setUnlocalizedName("spawnerEnderman");
    	spawnerEndermite = new ItemSpawnerBuilder("Endermite").setUnlocalizedName("spawnerEndermite");
    	spawnerGuardian = new ItemSpawnerBuilder("Guardian").setUnlocalizedName("spawnerGuardian");
		spawnerKillerRabbit = new ItemSpawnerBuilder("Rabbit").setSpawnDataByte("RabbitType", (byte)1).setUnlocalizedName("spawnerKillerRabbit");
        spawnerSilverfish = new ItemSpawnerBuilder("Silverfish").setUnlocalizedName("spawnerSilverfish");
        spawnerSkeleton = new ItemSpawnerBuilder("Skeleton").setUnlocalizedName("spawnerSkeleton");
    	spawnerSlime = new ItemSpawnerBuilder("Slime").setUnlocalizedName("spawnerSlime");
    	spawnerSpider = new ItemSpawnerBuilder("Spider").setUnlocalizedName("spawnerSpider");
        spawnerWitch = new ItemSpawnerBuilder("Witch").setUnlocalizedName("spawnerWitch");
    	spawnerZombie = new ItemSpawnerBuilder("Zombie").setUnlocalizedName("spawnerZombie");
    	
        spawnerBlaze = new ItemSpawnerBuilder("Blaze").setUnlocalizedName("spawnerBlaze");
    	spawnerGhast = new ItemSpawnerBuilder("Ghast").setUnlocalizedName("spawnerGhast");
    	spawnerZombiePigman = new ItemSpawnerBuilder("PigZombie").setUnlocalizedName("spawnerZombiePigman");
		spawnerWitherSkeleton = new ItemSpawnerBuilder("Skeleton").setSpawnDataByte("SkeletonType", (byte)1).setUnlocalizedName("spawnerWitherSkeleton");
        spawnerMagmaCube = new ItemSpawnerBuilder("LavaSlime").setUnlocalizedName("spawnerMagmaCube");
    	
        spawnerWither = new ItemSpawnerBuilder("WitherBoss").setUnlocalizedName("spawnerWither");
        spawnerEnderDragon = new ItemSpawnerBuilder("EnderDragon").setUnlocalizedName("spawnerEnderDragon");
    
	}
	
	private static void registerItems()
	{
		GameRegistry.registerItem(spawnerCore, spawnerCore.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(spawnerBat, spawnerBat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerChicken, spawnerChicken.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerCow, spawnerCow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerHorse, spawnerHorse.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerMooshroom, spawnerMooshroom.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerPig, spawnerPig.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerOcelot, spawnerOcelot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerRabbit, spawnerRabbit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerSheep, spawnerSheep.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerSquid, spawnerSquid.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerWolf, spawnerWolf.getUnlocalizedName().substring(5));

	    GameRegistry.registerItem(spawnerIronGolem, spawnerIronGolem.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerSnowGolem, spawnerSnowGolem.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerVillager, spawnerVillager.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(spawnerCaveSpider, spawnerCaveSpider.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerCreeper, spawnerCreeper.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerElderGuardian, spawnerElderGuardian.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerEnderman, spawnerEnderman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerEndermite, spawnerEndermite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerGuardian, spawnerGuardian.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerKillerRabbit, spawnerKillerRabbit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerSilverfish, spawnerSilverfish.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerSkeleton, spawnerSkeleton.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerSlime, spawnerSlime.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerSpider, spawnerSpider.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerWitch, spawnerWitch.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spawnerZombie, spawnerZombie.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(spawnerBlaze, spawnerBlaze.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerGhast, spawnerGhast.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerMagmaCube, spawnerMagmaCube.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerWitherSkeleton, spawnerWitherSkeleton.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerZombiePigman, spawnerZombiePigman.getUnlocalizedName().substring(5));
	    
		GameRegistry.registerItem(spawnerWither, spawnerWither.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(spawnerEnderDragon, spawnerEnderDragon.getUnlocalizedName().substring(5));
	}
	
	
	
	private static void registerInventoryModels()
	{
		registerInventoryModel(spawnerCore);
		
		
		registerInventoryModel(spawnerBat);
		registerInventoryModel(spawnerChicken);
		registerInventoryModel(spawnerCow);
		registerInventoryModel(spawnerHorse);
		registerInventoryModel(spawnerMooshroom);
		registerInventoryModel(spawnerPig);
		registerInventoryModel(spawnerOcelot);
		registerInventoryModel(spawnerRabbit);
		registerInventoryModel(spawnerSheep);
		registerInventoryModel(spawnerSquid);
		registerInventoryModel(spawnerWolf);

		registerInventoryModel(spawnerIronGolem);
		registerInventoryModel(spawnerSnowGolem);
		registerInventoryModel(spawnerVillager);
		
		registerInventoryModel(spawnerCaveSpider);
		registerInventoryModel(spawnerCreeper);
		registerInventoryModel(spawnerElderGuardian);
		registerInventoryModel(spawnerEnderman);
		registerInventoryModel(spawnerEndermite);
		registerInventoryModel(spawnerGuardian);
		registerInventoryModel(spawnerKillerRabbit);
		registerInventoryModel(spawnerSilverfish);
		registerInventoryModel(spawnerSkeleton);
		registerInventoryModel(spawnerSlime);
		registerInventoryModel(spawnerSpider);
		registerInventoryModel(spawnerWitch);
		registerInventoryModel(spawnerZombie);

		registerInventoryModel(spawnerBlaze);
		registerInventoryModel(spawnerGhast);
		registerInventoryModel(spawnerMagmaCube);
		registerInventoryModel(spawnerWitherSkeleton);
		registerInventoryModel(spawnerZombiePigman);
		
		registerInventoryModel(spawnerWither);
		registerInventoryModel(spawnerEnderDragon);
	}
	
	private static void registerInventoryModel(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CraftableSpawners.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
