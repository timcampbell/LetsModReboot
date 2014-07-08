package com.sopa89.letsmodreboot.init;

import com.sopa89.letsmodreboot.block.BlockFlag;
import com.sopa89.letsmodreboot.block.BlockLMRB;
import com.sopa89.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockLMRB flag=new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
}
