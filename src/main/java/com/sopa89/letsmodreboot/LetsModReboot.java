package com.sopa89.letsmodreboot;

import com.sopa89.letsmodreboot.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModReboot", name="Lets Mod Reboot", version="1.7.2-1.0")
public class LetsModReboot 
{
	@Mod.Instance("LetsModReboot")
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
