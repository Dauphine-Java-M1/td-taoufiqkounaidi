package fr.dauphine.ja.kounaiditaoufiq.shapes;

import fr.dauphine.ja.kounaiditaoufiq.view.Drawer;

public interface Shape {

	public boolean contains(Point pt);
	
	public Drawer getDrawer();
	public void translate(int dx, int dy);
}
