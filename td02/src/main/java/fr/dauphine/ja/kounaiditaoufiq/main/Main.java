package fr.dauphine.ja.kounaiditaoufiq.main;

import java.awt.Dimension;
import javax.swing.JFrame;
import fr.dauphine.ja.kounaiditaoufiq.controller.*;
import fr.dauphine.ja.kounaiditaoufiq.shapes.*;
import fr.dauphine.ja.kounaiditaoufiq.view.MyDisplay;

public class Main {

	public static void main(String[] args) {
		
		Model d = new Model();
		AbstractControler abstractcontroler = new MouseControler(d);
		MyDisplay mydisplay = new MyDisplay(abstractcontroler,d);
		d.addObserver(mydisplay);
		
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseMotionListener(new MouseControler(d));
		frame.add(mydisplay);
		
		Point point = new Point(190,400);
		Circle circle = new Circle(new Point(50,50), 80);
		Circle circle2 = new Circle(new Point(300,200), 80);
		
		d.add(point);
		d.add(circle);
		d.add(circle2);

	}

}
