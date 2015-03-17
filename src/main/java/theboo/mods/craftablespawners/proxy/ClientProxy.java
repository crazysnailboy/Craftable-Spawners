package theboo.mods.craftablespawners.proxy;

import theboo.mods.craftablespawners.init.ModItems;


public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
	}

}
