package fr.dauphine.ja.kounaiditaoufiq.shapes;

import fr.dauphine.ja.kounaiditaoufiq.view.DrawRing;
import fr.dauphine.ja.kounaiditaoufiq.view.Drawer;

public class Ring implements Shape {
	
	private Point center;
	private double radiusInterne;
	private Circle circleExterne;
	private DrawRing dr;
	
	public Ring(Point center, double radiusExterne, double radiusInterne) {
		this.center = center;
		this.setRadiusInterne(radiusInterne);
		this.setCircleExterne(new Circle(center,radiusExterne));
		
		if(radiusInterne > radiusExterne) {
			this.setCircleExterne(new Circle(center,radiusInterne));
			this.setRadiusInterne(radiusExterne);
		}
		this.dr = new DrawRing(this);
	}
	
	public static boolean contains(Point pt, Ring...anneaux) {
		for (Ring ring : anneaux) {
			if (ring.contains(pt)) return true;
		}
		return false;
	}
	public boolean contains(Point pt) {
		return false;
	}

	@Override
	public String toString() {
		return circleExterne + " Rayon interne:" + radiusInterne;
	}
	public Circle getCircleExterne() {
		return circleExterne;
	}

	public void setCircleExterne(Circle circleExterne) {
		this.circleExterne = circleExterne;
	}

	public double getRadiusInterne() {
		return radiusInterne;
	}

	public void setRadiusInterne(double radiusInterne) {
		this.radiusInterne = radiusInterne;
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}

	public Drawer getDrawer() {
		// TODO Auto-generated method stub
		return dr;
	}
}
