package de.agowa338.StackItAll;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameData;

@Mod(modid = StackItAll.MODID, version = StackItAll.VERSION)
public class StackItAll
{
    public static final String MODID = "StackItAll";
    public static final String VERSION = "1.0";
    
    private static final int MaxSackSize = 64;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void init(FMLInitializationEvent event) {}
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	Object[] Items = GameData.getItemRegistry().getKeys().toArray();
		for (int i = 0; i < (Items.length -1); ++i)
		{
			Item.getItemById(GameData.getItemRegistry().getId(Items[i].toString())).setMaxStackSize(StackItAll.MaxSackSize);
		}
    }
}
