package fr.dauphine.ja.kounaiditaoufiq.shapes;

import fr.dauphine.ja.kounaiditaoufiq.view.DrawPoint;
import fr.dauphine.ja.kounaiditaoufiq.view.Drawer;

@SuppressWarnings("unused")
public class Point implements Shape {
	private int x,y;
	private static int nbrpoint=0;
	private final int largeurpoint = 5;
	private DrawPoint dp;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		Point.nbrpoint++;
		this.dp = new DrawPoint(this,largeurpoint);
	}
	public Point(int x, int y,Model d) {
		this.x=x;
		this.y=y;
		Point.nbrpoint++;
		d.add(this);
		//call the drawer
		this.dp = new DrawPoint(this,largeurpoint);
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
	public boolean isSameAs(Point pt) {
		return (this.x==pt.x && this.y==pt.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) return true;
		Point p = (Point) obj;
		return this.isSameAs(p) ;
	}
	
	public static int getPointNumber() {
		return Point.nbrpoint;
	}
	
	public static int setPointNumber(int nbpoint) {
		return Point.nbrpoint = nbpoint;
	}
	
	public double produitScalaire(Point pt) {
		return Math.pow(pt.getX() - this.x, 2) - Math.pow(pt.getY() - this.x,2);
	}
	public boolean contains(Point pt) {
		return false;
	}
	
	public void translate(int dx, int dy) {
		this.x=+dx;
		this.y=+dy;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public Drawer getDrawer() {
		// TODO Auto-generated method stub
		return dp;
	}
	
}
