package fr.dauphine.ja.kounaiditaoufiq.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.Random;

public abstract class Drawer {
	Color color = randomColor();
	Shape shape;

	public abstract void Draw(Graphics g);
	public Color randomColor() {
		Random rc = new Random();
		float r = rc.nextFloat();
		float g = rc.nextFloat();
		float b = rc.nextFloat();
		
		return Color.getHSBColor(r, g, b);
		
	};
	 
	
}
