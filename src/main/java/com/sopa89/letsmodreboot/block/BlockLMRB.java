package com.sopa89.letsmodreboot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.sopa89.letsmodreboot.creativeTab.CreativeTabLMRB;
import com.sopa89.letsmodreboot.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLMRB extends Block
{
	public BlockLMRB(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
	}
	
	public BlockLMRB()
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
