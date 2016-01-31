package com.zenframework.events;

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
