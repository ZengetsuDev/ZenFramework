package com.zenframework;

/*
 * ZenFramework v0.05.
 * 
 * This Framework is developed by a Zengetsu_.
 * 
 * All class of is developed for this Framework.
 * If you don't use this Framework, you cannot use the classes.
 * 
 * Date: 31/01/2016 11:30 (Paris)
 * 
 * ©2016 Civiz. All rights reserved.
 */

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import com.zenframework.events.ZenPlayerJoinEvent;
import com.zenframework.events.ZenPlayerQuitEvent;

public class ZenEvents {
	//Variable
	//Constructor
	public ZenEvents(ZenFramework ZenFramework) {
		PluginManager PluginManager = Bukkit.getServer().getPluginManager();
		PluginManager.registerEvents(new ZenPlayerJoinEvent(ZenFramework), ZenFramework);
		PluginManager.registerEvents(new ZenPlayerQuitEvent(ZenFramework), ZenFramework);
	}
}
