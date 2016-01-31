package com.zenframework;

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
