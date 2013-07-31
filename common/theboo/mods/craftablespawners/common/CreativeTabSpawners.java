package theboo.mods.craftablespawners.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabSpawners extends CreativeTabs
{
    public CreativeTabSpawners(int id, String name)
    {
        super(id, name);
    }

    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Mob Spawners";
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Block.mobSpawner.blockID;
    }
}
