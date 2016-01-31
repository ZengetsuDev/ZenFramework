package com.zenframework;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.zenframework.methods.ZenMessage;
import com.zenframework.math.Calculator;

public class ZenFramework extends JavaPlugin {
	//Variables
	public String PlgName = "ZenFramework";
	public String PFX = "<"+PlgName+">";
	
	public ArrayList<Player> PlayerList = new ArrayList<Player>();
	
	//Instance
	public Calculator Calculator = new Calculator(this);
	
	//Base
	public void onEnable() {
		new ZenEvents(this);
	}
	public void onDisable() {
		Bukkit.broadcastMessage("a");
	}
	
	//Shortcut
	public String Message(String msg) {
		return new ZenMessage(this, msg).get();
	}
}