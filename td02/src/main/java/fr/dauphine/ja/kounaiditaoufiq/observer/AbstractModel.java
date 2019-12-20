package fr.dauphine.ja.kounaiditaoufiq.observer;

import java.util.*;

import fr.dauphine.ja.kounaiditaoufiq.shapes.Shape;

public abstract class AbstractModel {
	private static List<Observer> observers = new ArrayList<Observer>();
	protected List<Shape> shapes = new ArrayList<Shape>();
	
	public void addObserver(Observer obs) {
		AbstractModel.observers.add(obs);
	}
	public void removeObserver(Observer obs) {
		AbstractModel.observers.remove(obs);
	}
	
	public void update() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public List<Shape> getShapes(){
		return shapes;
	}
}
