package com.zenframework.methods;

/*
 * This Framework was developed by Zenegtsu_.
 * 
 * Zengetsu_ was a young French Developer.
 * He had 14 years old.
 * 
 * Last Update: 31/01/2016 00:39 (Paris).
 * Version: 0.05
 */

import com.zenframework.ZenFramework;

public class ZenMessage {
	private ZenFramework ZenFramework;
	private String msg;
	
	//Constructor
	public ZenMessage(ZenFramework ZenFramework, String msg) {
		this.ZenFramework = ZenFramework;
		this.msg = msg;
	}
	//Getters
	public String get() {
		return "§c"+ZenFramework.PFX+" §7"+msg;
	}
}
