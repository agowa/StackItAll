package agowa338.StackItAll;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid="StackItAll", name="StackItAll", version="1.0.0")
public class StackItAll
{
	@EventHandler
	public void load(FMLPostInitializationEvent event)
	{
		for (int i = 0; i < 32000; ++i)
		{
			if (Item.itemsList[i] == null)
				continue;
			Item.itemsList[i].setMaxStackSize(64);
		}
	}
}