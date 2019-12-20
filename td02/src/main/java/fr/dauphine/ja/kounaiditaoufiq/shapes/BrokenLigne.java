package fr.dauphine.ja.kounaiditaoufiq.shapes;

import java.util.List;

import fr.dauphine.ja.kounaiditaoufiq.view.Drawer;

import java.util.LinkedList;

public class BrokenLigne implements Shape {
	
	private List<Point> listepoints;
	
	public BrokenLigne() {
		this.listepoints = new LinkedList<Point>();
	}
	
	
	public BrokenLigne(Model d) {
		this.listepoints = new LinkedList<Point>();
		d.add(this);
	}
	
	public int getPointNumber() {
		return listepoints.size();
	}
	public void add(Point pt) {
		listepoints.add(pt);
	}
	
	public boolean contains(Point pt) {
		return this.listepoints.contains(pt);
	}

	public void translate(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}


	public Drawer getDrawer() {
		return null;
	}
}
