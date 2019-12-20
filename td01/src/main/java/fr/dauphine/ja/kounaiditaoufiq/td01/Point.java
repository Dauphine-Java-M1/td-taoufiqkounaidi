package fr.dauphine.ja.kounaiditaoufiq.td01;

import java.util.*;
@SuppressWarnings("unused")
public class Point {

	private  double x,y;
	private double x2,y2;
	private Point p;
	
	/*
	static int noOfObjects = 0;
	{
		noOfObjects+=1;
	}
	*/
	public Point(int px, int py){
		this.x=px;
		this.y=py;
	}
	public Point(Point pt) {
		this.p=pt;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
	// question 2 exo 3
	public boolean isSameAs(Point pt) {
		return ((this.x==pt.x) && (this.y==pt.y));
	}
	
	public void translate(int dx, int dy) {
		x=x+dx;
		y=y+dy;
	}

	public double calculDistance(Point p2) {
		return Math.sqrt((y2 - getY()) * (y2 - getY()) + (x2 - getX()) *(x2 - getX()));
	}
	public double getX() {
		return x;
	}
	public void setX(int newX) {
		this.x=newX;
	}
	public double getY() {
		return y;
	}
	public void setY(int newY) {
		this.y=newY;
	}

}
