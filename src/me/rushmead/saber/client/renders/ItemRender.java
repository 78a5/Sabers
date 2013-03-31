package me.rushmead.saber.client.renders;

import org.lwjgl.opengl.GL11;

import me.rushmead.saber.client.models.Saber1Model;
import me.rushmead.saber.common.items.ItemSaber;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.MapData;
import net.minecraftforge.client.IItemRenderer;


public class ItemRender extends Render implements IItemRenderer {
	public Saber1Model model = new Saber1Model();

	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type){
		case EQUIPPED: return true;
		default: return false;
		
		
		}
	}

	
	@Override
	public void renderItem(ItemRenderType type, ItemStack itemStack, Object... data) {
              switch(type){
              case EQUIPPED:
              {
            	  GL11.glPushMatrix();
            	  Minecraft.getMinecraft().renderEngine.bindTexture("/mods/sabermod/textures/items/saber1.png");
            	  
            	GL11.glTranslatef(0F, 1F, 0F);
            	  
            	  model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            	  
            	  
            	  
            	  
            	  
            	  GL11.glPopMatrix();
            	  
            	  
              }
              
              
              }
	}

	/**
	 * Whether or not to use the RenderHelper for this item. Helper can be:
	 * 
	 * ENTITY_ROTATION - Isometric rotation, for block items
	 * 
	 * ENTITY_BOBBING - Up-and-down bobbing effect for EntityItem
	 * 
	 * EQUIPPED_BLOCK - Determines if the currently equipped item should be rendered as a 3D block or as a 2D texture.
	 * 
	 * BLOCK_3D - Determines if the item should equate to a block that has RenderBlocks.renderItemIn3d return true
	 * 
	 * INVENTORY_BLOCK - Determines if the item should be rendered in GUI inventory slots as a 3D block or as a 2D texture.
	 */
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return type == ItemRenderType.ENTITY;
	}

	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {

	}

}