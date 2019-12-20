package fr.dauphine.ja.kounaiditaoufiq.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import fr.dauphine.ja.kounaiditaoufiq.observer.AbstractModel;
import fr.dauphine.ja.kounaiditaoufiq.shapes.Point;
import fr.dauphine.ja.kounaiditaoufiq.shapes.Shape;

public class MouseControler extends AbstractControler implements MouseMotionListener {

	public MouseControler(AbstractModel abstractmodel) {
		super(abstractmodel);	
	}

	public void mouseDragged(MouseEvent e) {
		this.abstractmodel.getShapes();
		for (int i = abstractmodel.getShapes().size()-1; i>=0 ; i--) {
			Shape sh = abstractmodel.getShapes().get(i);
			if (abstractmodel.getShapes().get(i).contains(new Point(e.getX(),e.getY()))) {
				sh.translate(e.getX(), e.getY());
				abstractmodel.update();
				break;
			}
			
		}
	}

	public void mouseMoved(MouseEvent e) {
			
	}

	@Override
	public void control() {
		
	}

}
