package com.sopa89.letsmodreboot.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.sopa89.letsmodreboot.handler.ConfigurationHandler;
import com.sopa89.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig
{

	public ModGuiConfig(GuiScreen guiScreen)
	{
		super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}
