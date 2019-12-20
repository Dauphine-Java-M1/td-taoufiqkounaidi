package fr.dauphine.ja.kounaiditaoufiq.shapes;

import fr.dauphine.ja.kounaiditaoufiq.observer.AbstractModel;

public class Model extends AbstractModel {
	
	public void add(Shape sh) {
		shapes.add(sh);
		update();
	}
}
