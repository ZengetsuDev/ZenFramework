package com.zenframework.math.geometry.structure;

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
 * �2016 Civiz. All rights reserved.
 */

import org.bukkit.Location;
import org.bukkit.Material;

public class Triangle {
	//Variables
	private Location l1;
	private Location l2;
	private Location l3;
	
	private Material m;
	private byte b;
	
	//Constructor
	public Triangle(Location l1, Location l2, Location l3, Material m, byte b) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.m = m;
		this.b = b;
	}
	
	//Methods
	public void make() {
		new Line(l1, l3, m, b).make();
		new Line(l1, l2, m, b).make();
		new Line(l2, l3, m, b).make();
	}
	
	//Getters
	public Location getL1() {
		return l1;
	}
	public Location getL2() {
		return l2;
	}
	public Location getL3() {
		return l3;
	}
}
