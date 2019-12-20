package fr.dauphine.ja.kounaiditaoufiq.view;

import java.awt.Graphics;

import fr.dauphine.ja.kounaiditaoufiq.shapes.Point;

public class DrawPoint extends Drawer {
	private Point pt;
	private int largeurpoint;
	
	public DrawPoint(Point pt, int largeurpoint) {
		this.pt = pt;
		this.largeurpoint = largeurpoint;
	}
	@Override
	public void Draw(Graphics g) {
		g.setColor(color);
		g.fillOval(pt.getX(), pt.getY(), largeurpoint, largeurpoint);
	}
	
	
}
