package fr.dauphine.ja.kounaiditaoufiq.td01;

import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class Circle {
	
	
	private final Point centerPoint;
	private final double rayon;
	private double surface;

	
	public Circle(Point cpoint, double r) {
		this.centerPoint=cpoint;
		this.rayon=r;
	}
	
	public String toString() {
		return "Center :" + getCenterPoint() + "| radius : " + getRayon() + "| surface : " + surface();
	}

	public Circle translate(Point dx, double dy) {
		return new Circle(dx,rayon+dy);
	}
	
	public double surface() {
		return surface = Math.PI * (rayon * rayon);
	}
	
	public Point getCenterPoint() {
		return centerPoint;
	}

	public double getRayon() {
		return rayon;
	}
	
	public double getSurface() {
		return surface;
	}



}
