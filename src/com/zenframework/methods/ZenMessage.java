package com.zenframework.methods;

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
