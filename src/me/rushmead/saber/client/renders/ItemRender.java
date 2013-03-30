package me.rushmead.saber.client.renders;

import me.rushmead.saber.client.models.Saber1Model;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRender implements IItemRenderer
{
 private static Saber1Model staffModel = new Saber1Model();

 public boolean handleRenderType(ItemStack item, ItemRenderType type) 
 {
  if (type == ItemRenderType.EQUIPPED) { return true; }
  return false;
 }

 public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
 {
  return false;
 }

 public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
 {
  switch (type)
  {
  case ENTITY: renderTool(-0.5F, 0.5F, -0.5F); break;
  case EQUIPPED: renderTool(0F, 0.4F, 0F); break;
  case INVENTORY: renderTool(1F, 0.65F, 1F); break;
  default: break;
  }
 }

 private void renderTool(float x, float y, float z) 
 {
  Tessellator tesselator = Tessellator.instance;
  GL11.glPushMatrix(); //start
  GL11.glTranslatef(x, y, z); //size
  float var10 = 0.0625F;
  staffModel.render((Entity)null, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, var10);
  GL11.glPopMatrix(); //end
 }

}
