package com.zenframework.events;

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
