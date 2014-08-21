package com.sopa89.letsmodreboot.client.handler;

import com.sopa89.letsmodreboot.client.settings.KeyBindings;
import com.sopa89.letsmodreboot.reference.Key;
import com.sopa89.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyEventHandler
{
	private static Key getPressedKeyBinding()
	{
		if(KeyBindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		else if(KeyBindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		else
		{
			return Key.UNKNOWN;
		}
			
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		LogHelper.info(getPressedKeyBinding());
	}
	
}
