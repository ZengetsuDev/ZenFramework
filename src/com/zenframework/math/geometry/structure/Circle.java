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
 * ©2016 Civiz. All rights reserved.
 */

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.Material;

public class Circle {
	
	//Variables
	private Location l1;
	private int R;
	
	private Material m;
	private byte b;
	
	private ArrayList<Location> cL = new ArrayList<Location>();
	
	//Constructor
	public Circle(Location l1, int R, Material m, byte b) {
		this.l1 = l1;
		this.R = R;
		this.m = m;
		this.b = b;
	}
	
	//Methods
	@SuppressWarnings("deprecation")
	public void setBlock(int x, int z) {
		Location l = new Location(l1.getWorld(), x, l1.getBlockY(), z);
		cL.add(l);
		l.getBlock().setType(m);
		l.getBlock().setData(b);
	}
	
	public void make() {
		int Ox = l1.getBlockX();
		int Oz = l1.getBlockZ();
		
		int x = R;
		int z = 0;
		int err = 0;
		int dedx = (R << 1) - 1;	// 2x-1 = 2R-1
		int dedz = 1;	// 2z-1
		
		setBlock(Ox + R, Oz);	// +0
		setBlock(Ox, Oz + R);	// +90
		setBlock(Ox - R, Oz);	// +180
		setBlock(Ox, Oz - R);	// +270
		
		while(x > z){
			z++;
			err += dedz;
			dedz += 2;
			if (err >= dedx){
				x--;
				err -= dedx;
				dedx -= 2;
			}
			
			setBlock(Ox + x, Oz + z);	// +theta
			setBlock(Ox + x, Oz - z);	// -theta
			setBlock(Ox - x, Oz + z);	// 180-theta
			setBlock(Ox - x, Oz - z);	// 180+theta
			setBlock(Ox + z, Oz + x);	// 90+theta
			setBlock(Ox + z, Oz - x);	// 90-theta
			setBlock(Ox - z, Oz + x);	// 270+theta
			setBlock(Ox - z, Oz - x);	// 270-theta
		}
	}
	
	//Getters
	public ArrayList<Location> getCL() {
		return cL;
	}
}
