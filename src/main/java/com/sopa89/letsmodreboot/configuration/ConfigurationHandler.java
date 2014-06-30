package com.sopa89.letsmodreboot.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static void init(File configFile)
	{
		//Create the configuration object from the given configuration file
		Configuration configuration=new Configuration(configFile);
		boolean configValue=false;
		
		try
		{
			//Load the configuration file
			configuration.load();
			
			//Read in properties from configuration file
			configValue=configuration.get("Forgecraft", "configValue", true, "This is an example config value").getBoolean(true);
		}
		catch(Exception e)
		{
			//Log the exceptions
			
		}
		finally
		{
			//Save the configuration file
			configuration.save();
		}
		
		System.out.println("Configuration Test: "+configValue);
	}
}
