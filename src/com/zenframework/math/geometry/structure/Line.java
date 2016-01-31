package com.zenframework.math.geometry.structure;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.Material;

public class Line {
	
	//Variables
	private Location l1;
	private Location l2;
	
	private Material m;
	private byte b;
	
	private ArrayList<Location> lL = new ArrayList<Location>();
	
	//Constructor
	public Line(Location l1, Location l2, Material m, byte b) {
		this.l1 = l1;
		this.l2 = l2;
		this.m = m;
		this.b = b;
	}
	
	//Methods
	@SuppressWarnings("deprecation")
	public void make() {
		int startx = l1.getBlockX();
		int starty = l1.getBlockY();
		int startz = l1.getBlockZ();
		
		int endx = l2.getBlockX();
		int endy = l2.getBlockY();
		int endz = l2.getBlockZ();
		
		int dx = endx - startx;
		int dy = endy - starty;
		int dz = endz - startz;

		int ax = Math.abs(dx) << 1;
		int ay = Math.abs(dy) << 1;
		int az = Math.abs(dz) << 1;

		int signx = (int) Math.signum(dx);
		int signy = (int) Math.signum(dy);
		int signz = (int) Math.signum(dz);

		int x = startx;
		int y = starty;
		int z = startz;

		int deltax, deltay, deltaz;
		if (ax >= Math.max(ay, az)) /* x dominant */ {
			deltay = ay - (ax >> 1);
			deltaz = az - (ax >> 1);
			while (true) {
				Location l = new Location(l1.getWorld(), x, y, z);
				lL.add(l);
				l.getBlock().setType(m);
				l.getBlock().setData(b);
				if (x == endx) {
					break;
				}

				if (deltay >= 0) {
					y += signy;
					deltay -= ax;
				}

				if (deltaz >= 0) {
					z += signz;
					deltaz -= ax;
				}

				x += signx;
				deltay += ay;
				deltaz += az;
			}
		} else if (ay >= Math.max(ax, az)) /* y dominant */ {
			deltax = ax - (ay >> 1);
			deltaz = az - (ay >> 1);
			while (true) {
				Location l = new Location(l1.getWorld(), x, y, z);
				lL.add(l);
				l.getBlock().setType(m);
				l.getBlock().setData(b);
				if (y == endy) {
					break;
				}

				if (deltax >= 0) {
					x += signx;
					deltax -= ay;
				}

				if (deltaz >= 0) {
					z += signz;
					deltaz -= ay;
				}

				y += signy;
				deltax += ax;
				deltaz += az;
			}
		} else if (az >= Math.max(ax, ay)) /* z dominant */ {
			deltax = ax - (az >> 1);
			deltay = ay - (az >> 1);
			while (true) {
				Location l = new Location(l1.getWorld(), x, y, z);
				l.getBlock().setType(m);
				l.getBlock().setData(b);
				if (z == endz) {
					break;
				}

				if (deltax >= 0) {
					x += signx;
					deltax -= az;
				}

				if (deltay >= 0) {
					y += signy;
					deltay -= az;
				}

				z += signz;
				deltax += ax;
				deltay += ay;
			}
		}
	}

	//Getters
	public Location getL1() {
		return l1;
	}

	public Location getL2() {
		return l2;
	}

	public ArrayList<Location> getLL() {
		return lL;
	}
}
