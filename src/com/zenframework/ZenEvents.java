package com.zenframework;

/*
 * This Framework was developed by Zenegtsu_.
 * 
 * Zengetsu_ was a young French Developer.
 * He had 14 years old.
 * 
 * Last Update: 31/01/2016 00:39 (Paris).
 * Version: 0.05
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
