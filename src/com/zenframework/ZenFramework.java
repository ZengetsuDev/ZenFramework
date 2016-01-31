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

import java.util.ArrayList;

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
	}
	
	//Shortcut
	public String Message(String msg) {
		return new ZenMessage(this, msg).get();
	}
}