package me.rushmead.saber.client;

import me.rushmead.saber.client.renders.ItemRender;
import me.rushmead.saber.common.CommonProxy;
import me.rushmead.saber.common.SaberItems;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy{
   @Override
   @SideOnly(Side.CLIENT)
   public void registerRenderThings()
   {
	   MinecraftForgeClient.registerItemRenderer(SaberItems.saber1.itemID, new ItemRender());
   }
	
	
	
}
