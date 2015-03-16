package theboo.mods.craftablespawners.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabSpawners extends CreativeTabs
{
    public CreativeTabSpawners(String label)
    {
        super(label);
    }

	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(Blocks.mob_spawner);
	}

}
