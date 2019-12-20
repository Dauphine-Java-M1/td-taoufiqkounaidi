package fr.dauphine.ja.kounaiditaoufiq.view;

import java.awt.Graphics;

import fr.dauphine.ja.kounaiditaoufiq.shapes.Circle;

public class DrawCircle extends Drawer {

	private Circle circle;
	public DrawCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Override
	public void Draw(Graphics g) {
		double radius = circle.getRadius();
		int x = (int) circle.getCenterpoint().getX();
		int y = (int) circle.getCenterpoint().getY();
		
		g.setColor(color);
		g.fillOval((int) (x-radius) , (int) (y-radius), (int) radius*2, (int) radius*2);
	}

}
