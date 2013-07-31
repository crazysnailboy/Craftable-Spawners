// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package theboo.mods.craftablespawners.item;

import theboo.mods.craftablespawners.CraftableSpawners;
import theboo.mods.craftablespawners.common.Config;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;


// Referenced classes of package net.minecraft.src:
//            Item, Block, World, ItemStack, 
//            StepSound, EntityPlayer

public class ItemSpawnerBuilder extends Item
{
	public String texture;
	
	public ItemSpawnerBuilder(int i, String mob, String texture) {
        super(i);
        this.mob=mob;
        this.setCreativeTab(Config.spawners);
        this.texture = texture;
        
    }

    
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int par7, float par8, float par9, float par10)
    {
        Block block = Block.mobSpawner;
        if (par7 == 0)
        {
            --j;
        }

        if (par7 == 1)
        {
            ++j;
        }

        if (par7 == 2)
        {
            --k;
        }

        if (par7 == 3)
        {
            ++k;
        }

        if (par7 == 4)
        {
            --i;
        }

        if (par7 == 5)
        {
            ++i;
        }

        if (!block.canPlaceBlockAt(world, i, j, k))
        {
            return false;
        }
        else
        {
            int var11 = world.getBlockId(i, j, k);

            if (var11 == 0)
            {
            	
                world.playSoundEffect((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
                
                //set tile entity
                world.setBlock(i, j, k, Block.mobSpawner.blockID);
                
                TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getBlockTileEntity(i, j, k);
                if (tileentitymobspawner != null)
                {
                	tileentitymobspawner.getSpawnerLogic().setMobID(mob);

                }
                itemstack.stackSize--;
            }

            itemstack.damageItem(1, entityplayer);
            return true;
        }
    }
       
    private String mob;
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
    	String bip = "craftablespawners:" + texture;
    	itemIcon = iconRegister.registerIcon(bip);
    }
}
