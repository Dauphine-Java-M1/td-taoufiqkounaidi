package fr.dauphine.ja.kounaiditaoufiq.controller;

import java.awt.event.MouseEvent;

import fr.dauphine.ja.kounaiditaoufiq.observer.AbstractModel;

public abstract class AbstractControler {
	protected AbstractModel abstractmodel;
	
	public AbstractControler(AbstractModel abstractmodel) {
		this.abstractmodel = abstractmodel ;
	}
	
	public abstract void control();
}
