package com.zenframework.player;

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
