package com.zenframework.math;

/*
 * This Framework was developed by Zenegtsu_.
 * 
 * Zengetsu_ was a young French Developer.
 * He had 14 years old.
 * 
 * Last Update: 31/01/2016 00:39 (Paris).
 * Version: 0.05
 */

import org.bukkit.Location;

import com.zenframework.ZenFramework;
import com.zenframework.math.geometry.GeometricalMethods;
import com.zenframework.math.pythagoras.Pythagoras;

public class Calculator {
	public Pythagoras Pythagoras = new Pythagoras();
	public GeometricalMethods GeometricalMethods = new GeometricalMethods();
	
	private ZenFramework ZenFramework;
	
	public Calculator(ZenFramework ZenFramework) {
		this.ZenFramework = ZenFramework;
	}
	
	public double CalculateSquareRoot(double i) {
		return Math.sqrt(i);
	}
	public double CalculateSquare(double i) {
		return i * i;
	}
	
	public double CalculateDifference(double x1, double x2, int state) {
		double i = x1 - x2;
		if (state == 0) {} else if (state == 1) {
			if (i < 0) i = i * -1;
		} else if (state == 2) {
			if (i > 0) i = i * -1;
		} else {
			System.out.println(ZenFramework.Message("§cCan't find state in method : CalculateDifference."));
		}
		return i;
	}
	
	public double CalculateXDifferenceLoc(Location l1, Location l2, int state) {
		double i = l1.getX() - l2.getX();
		if (state == 0) {} else if (state == 1) {
			if (i < 0) i = i * -1;
		} else if (state == 2) {
			if (i > 0) i = i * -1;
		} else {
			System.out.println(ZenFramework.Message("§cCan't find state in method : CalculateXDifference."));
		}
		return i;
	}
	public double CalculateYDifferenceLoc(Location l1, Location l2, int state) {
		double i = l1.getY() - l2.getY();
		if (state == 0) {} else if (state == 1) {
			if (i < 0) i = i * -1;
		} else if (state == 2) {
			if (i > 0) i = i * -1;
		} else {
			System.out.println(ZenFramework.Message("§cCan't find state in method : CalculateYDifference."));
		}
		return i;
	}
	public double CalculateZDifferenceLoc(Location l1, Location l2, int state) {
		double i = l1.getZ() - l2.getZ();
		if (state == 0) {} else if (state == 1) {
			if (i < 0) i = i * -1;
		} else if (state == 2) {
			if (i > 0) i = i * -1;
		} else {
			System.out.println(ZenFramework.Message("§cCan't find state in method : CalculateZDifference."));
		}
		return i;
	}
}
