package theboo.mods.craftablespawners.item;

import theboo.mods.craftablespawners.common.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCraftableSpawners extends Item {

	private String texture;
	
	public ItemCraftableSpawners(int par1, String texture) {
		super(par1);
		this.texture = texture;
		this.setCreativeTab(Config.spawners);
	}

	public void registerIcons(IconRegister iconRegister) {
		String bip = "craftablespawners:" + texture;
		itemIcon = iconRegister.registerIcon(bip);
	}
}
