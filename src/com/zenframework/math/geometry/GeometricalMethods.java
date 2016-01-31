package com.zenframework.math.geometry;

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

import org.bukkit.Location;
import org.bukkit.Material;

import com.zenframework.math.geometry.structure.Circle;
import com.zenframework.math.geometry.structure.Line;
import com.zenframework.math.geometry.structure.Triangle;

public class GeometricalMethods {
	//Methods
	public Line newLine(Location l1, Location l2, Material m, byte b) {
		return new Line(l1, l2, m, b);
	}
	public Circle newCircle(Location l1, int R, Material m, byte b) {
		return new Circle(l1, R, m, b);
	}
	public Triangle newTriangle(Location l1, Location l2, Location l3, Material m, byte b) {
		return new Triangle(l1, l2, l3, m, b);
	}
}
