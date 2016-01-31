package com.zenframework.methods;

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
