package com.sopa89.letsmodreboot.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
	}
}
