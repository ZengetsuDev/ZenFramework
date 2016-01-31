package com.zenframework.events;

/*
 * This Framework was developed by Zenegtsu_.
 * 
 * Zengetsu_ was a young French Developer.
 * He had 14 years old.
 * 
 * Last Update: 31/01/2016 00:39 (Paris).
 * Version: 0.05
 */

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.zenframework.ZenFramework;

public class ZenPlayerJoinEvent implements Listener{
	//Variables
	private ZenFramework ZenFramework;
	
	//Constructor
	public ZenPlayerJoinEvent(ZenFramework ZenFramework) {
		this.ZenFramework = ZenFramework;
	}
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent Event) {
		Player Player = Event.getPlayer();
		ZenFramework.PlayerList.add(Player);
		
		Event(Event, Player);
	}
	
	private void Event(PlayerJoinEvent Event, Player Player) {
	}
}
