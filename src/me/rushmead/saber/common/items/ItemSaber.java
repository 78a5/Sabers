package me.rushmead.saber.common.items;

import me.rushmead.saber.common.ModSaberMod;
import me.rushmead.saber.common.SaberItems;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSaber extends ItemSword{

	public ItemSaber(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	this.setCreativeTab(ModSaberMod.saberMod);
	}
	@Override
	public void updateIcons(IconRegister par1) {
		this.iconIndex = par1.registerIcon("sabermod:saber1");
		
	}
}
