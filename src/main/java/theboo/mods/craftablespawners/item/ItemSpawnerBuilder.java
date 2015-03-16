package theboo.mods.craftablespawners.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import theboo.mods.craftablespawners.CraftableSpawners;


public class ItemSpawnerBuilder extends Item
{
	private String entityName;
	private NBTTagCompound spawnData;

	
	public ItemSpawnerBuilder(String entityName) {
		this.entityName = entityName;
		this.setCreativeTab(CraftableSpawners.spawners);
	}
	
	public ItemSpawnerBuilder(String entityName, NBTTagCompound spawnData) {
		this(entityName);
		this.spawnData = spawnData;
	}
	
	
	
	public ItemSpawnerBuilder setSpawnDataByte(String key, byte value) {
		if (this.spawnData == null)
		{
			this.spawnData = new NBTTagCompound();
			this.spawnData.setByte(key, value);
		}
		return this;
	}
	
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		//System.out.println("onItemUse");
		
		switch(side)
		{
			case DOWN: pos = pos.down(); break;
			case UP: pos = pos.up(); break;
			case NORTH: pos = pos.north(); break;
			case SOUTH: pos = pos.south(); break;
			case WEST: pos = pos.west(); break;
			case EAST: pos = pos.east(); break;
		}
		
		Block block = Blocks.mob_spawner;
		if (!block.canPlaceBlockAt(world, pos))
		{
			return false;
		}
		else
		{
			int blockId = Block.getIdFromBlock(world.getBlockState(pos).getBlock());
			if (blockId == 0) // air
			{
				world.playSoundEffect((float)pos.getX() + 0.5F, (float)pos.getY() + 0.5F, (float)pos.getZ() + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getFrequency() * 0.8F);
				
				//set tile entity
				world.setBlockState(pos, block.getDefaultState());

				TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getTileEntity(pos);
				if (tileentitymobspawner != null)
				{
					tileentitymobspawner.getSpawnerBaseLogic().setEntityName(entityName);
					
					if (this.spawnData != null)
					{
						NBTTagCompound nbt  = new NBTTagCompound();
						nbt.setString("EntityId", entityName);
						nbt.setTag("SpawnData", spawnData);
						tileentitymobspawner.getSpawnerBaseLogic().readFromNBT(nbt);
					}
					
				}
				stack.stackSize--;
			}

			stack.damageItem(1, player);
			return true;
		}
		
		
		

	}

}
