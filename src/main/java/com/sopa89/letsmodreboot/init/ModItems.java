package com.sopa89.letsmodreboot.init;

import com.sopa89.letsmodreboot.item.ItemLMRB;
import com.sopa89.letsmodreboot.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemLMRB mapleLeaf=new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
