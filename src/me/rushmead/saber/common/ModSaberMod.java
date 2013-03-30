package me.rushmead.saber.common;

import me.rushmead.saber.client.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(  
		clientSideRequired = true,
		serverSideRequired = true
		
		
		)



@Mod(modid = "saber", name = "Saber", version = "1")

public class ModSaberMod {

	@Instance()
	public static ModSaberMod instance;
	@SidedProxy(serverSide = "me.rushmead.saber.common.CommonProxy", clientSide = "me.rushmead.saber.client.ClientProxy")
	 public static CommonProxy server;
	 public static ClientProxy proxy;
	 private Configuration config;
	 ItemStack diamond = new ItemStack(Item.diamond);
	   ItemStack gold = new ItemStack(Item.ingotGold);
	 public static CreativeTabs saberMod = new CreativeTabs("saberMod") {
		   
		};
	 @PreInit
	 public void preInit(FMLPreInitializationEvent event){
		 proxy = new ClientProxy();
		 proxy.registerRenderThings();
		 LanguageRegistry.instance().addStringLocalization("itemGroup.saberMod", "en_US", "Saber Mod Tab");
		 SaberItems.registerItems();
		 GameRegistry.addRecipe(new ItemStack(SaberItems.saber1), " y ", " x ", " x ",
	                'x', gold, 'y', diamond);
		 loadConfig(event);
	 }
	 private void loadConfig(FMLPreInitializationEvent event) {
		    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		    SaberItems.loadConfig(config);
		    config.save();
		    this.config = config;
		}
}
