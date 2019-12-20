package fr.dauphine.ja.kounaiditaoufiq.shapes;

import fr.dauphine.ja.kounaiditaoufiq.view.DrawCircle;
import fr.dauphine.ja.kounaiditaoufiq.view.Drawer;

public class Circle implements Shape{
	
	private Point centerpoint;
	private double radius;
	private DrawCircle dc;
	
	public Circle(Point cpt, double r) {
		this.setCenterpoint(cpt);
		this.setRadius(r);
		this.dc = new DrawCircle(this);
	}
	
	public Circle(Point cpt, double r, Model d) {
		this.setCenterpoint(cpt);
		this.setRadius(r);
		d.add(this);
		this.dc = new DrawCircle(this);
	}
	public double surface() {
		return Math.PI * (radius) * (radius);
	}
	
	@Override
	public String toString() {
		return "Centre: " + this.centerpoint + " Rayon: " + this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) return true;
		Circle c = (Circle)obj;
		return c.getCenterpoint().equals(centerpoint) && c.getRadius() == radius;
	}
	
	public boolean contains(Point pt) {
		return this.centerpoint.produitScalaire(pt) <= (radius)*(radius);
	}
	
	public static boolean contains(Point pt, Circle...circles) {
		for (Circle c : circles) {
			if(c.contains(pt)) return true;
		}
		return false;
	}
	
	
	public void translate(int dx, int dy) {
		this.centerpoint.translate(dx, dy);
	}
	
	public Point getCenterpoint() {
		return centerpoint;
	}

	public void setCenterpoint(Point centerpoint) {
		this.centerpoint = centerpoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Drawer getDrawer() {
		// TODO Auto-generated method stub
		return dc;
	}


		
}
