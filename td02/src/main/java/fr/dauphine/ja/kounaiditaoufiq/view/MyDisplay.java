package fr.dauphine.ja.kounaiditaoufiq.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.dauphine.ja.kounaiditaoufiq.controller.AbstractControler;
import fr.dauphine.ja.kounaiditaoufiq.observer.Observer;
import fr.dauphine.ja.kounaiditaoufiq.shapes.Model;
import fr.dauphine.ja.kounaiditaoufiq.shapes.Shape;


public class MyDisplay extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	public static Color backgroundcolor = Color.LIGHT_GRAY;
	private Model d;
	@SuppressWarnings("unused")
	private AbstractControler abstractcontroler;
	

	public MyDisplay(AbstractControler controler, Model d) {
		this.setOpaque(true);
		this.setBackground(backgroundcolor);
		this.d = d;
		this.abstractcontroler = controler; 
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape sh : d.getShapes()) {
			sh.getDrawer().Draw(g);
		}
	}

	public void update() {
		repaint();
	}
	
	
	
	
	/*
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(200, 200, 300, 300);
	}
	*/

}