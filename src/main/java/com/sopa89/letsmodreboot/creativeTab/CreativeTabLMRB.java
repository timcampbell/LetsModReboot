package com.sopa89.letsmodreboot.creativeTab;

import com.sopa89.letsmodreboot.init.ModItems;
import com.sopa89.letsmodreboot.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
	public static final CreativeTabs LMRB_TAB=new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem() 
		{
			return ModItems.mapleLeaf;
		}
	};
}
