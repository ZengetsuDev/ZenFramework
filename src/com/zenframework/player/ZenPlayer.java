package com.zenframework.player;

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

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.zenframework.ZenFramework;

public class ZenPlayer {
	private Player Player;
	
	public ZenPlayer(ZenFramework ZenFramework, Player Player) {
		this.Player = Player;
	}
	
	public int getPing() {
		return ((CraftPlayer) Player).getHandle().ping;
	}
	
	public Location getZenPlayerLocation() {
		return Player.getLocation();
	}
	
	public Player getPlayer() {
		return Player;
	}
}
