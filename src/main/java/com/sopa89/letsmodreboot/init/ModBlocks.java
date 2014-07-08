package com.sopa89.letsmodreboot.init;

import com.sopa89.letsmodreboot.block.BlockFlag;
import com.sopa89.letsmodreboot.block.BlockLMRB;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static final BlockLMRB flag=new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
}
