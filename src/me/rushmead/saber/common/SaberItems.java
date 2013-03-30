package me.rushmead.saber.common;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import me.rushmead.saber.common.items.ItemSaber;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

public class SaberItems {

	
	
	public static Item saber1;
	public static int saber1ID;
	
	public static Configuration config;
	public static void loadConfig(Configuration config) {
        int baseID = 4012;
       saber1ID = getItemConfig(config, "saber1", baseID++);
    }
	private static int getItemConfig(Configuration config, String key, int defaultID) {
        return config.getItem(Configuration.CATEGORY_ITEM, key, defaultID).getInt(defaultID);
    }
	public static void registerItems(){
		saber1 = new ItemSaber(saber1ID, EnumToolMaterial.EMERALD);
		GameRegistry.registerItem(saber1, "saber1");
		LanguageRegistry.addName(saber1, "Mighty Saber");
	}
}
