package com.zenframework.math.geometry;

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
