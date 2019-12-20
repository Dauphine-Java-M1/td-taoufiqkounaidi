package fr.dauphine.ja.kounaiditaoufiq.view;

import java.awt.Graphics;

import fr.dauphine.ja.kounaiditaoufiq.shapes.Ring;

public class DrawRing extends Drawer {

	private Ring ring;
	
	public DrawRing(Ring ring) {
		this.ring = ring;
	}
	@Override
	public void Draw(Graphics g) {
		int x = (int) this.ring.getCircleExterne().getCenterpoint().getX();
		int y = (int) this.ring.getCircleExterne().getCenterpoint().getY();
		double radius = (int) this.ring.getCircleExterne().getRadius();
		
		g.setColor(color);
		g.fillOval((int) (x-radius) , (int) (y-radius), (int) radius*2, (int) radius*2);
	}

}
