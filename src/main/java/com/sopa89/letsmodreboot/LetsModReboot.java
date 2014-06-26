package com.sopa89.letsmodreboot;

import com.sopa89.letsmodreboot.proxy.IProxy;
import com.sopa89.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class LetsModReboot 
{
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide="com.sopa89.letsmodreboot.proxy.ClientProxy", serverSide="com.sopa89.letsmodreboot.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler()
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler()
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler()
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
