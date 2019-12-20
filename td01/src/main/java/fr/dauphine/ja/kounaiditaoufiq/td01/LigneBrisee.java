package fr.dauphine.ja.kounaiditaoufiq.td01;

import java.util.*;

@SuppressWarnings("unused")
public class LigneBrisee {

	
	//private Point[] l ;
	private int taille;
	private int numelement=0;
	private LinkedList<Point> linkedList = new LinkedList<Point>();
	
	public LigneBrisee() {
		this.linkedList=new LinkedList<Point>();
	}
	/*
	public LigneBrisee(Integer taille) {
		this.taille = taille;
		this.l = new Point[taille] ;
	}
	*/
	
	public void add(Point pt) {
		linkedList.add(pt);
	}
	/*
	public int pointCapacity() {
		return taille;
	}
	*/
	public int pointCapacity() {
		return linkedList.size();
	}
	/*
	public int nbPoints() {
		for (int i=0;i<l.length;i++) {
			i++ ;
			numelement = i;
		}
		return numelement;
	}
	*/
	public int nbPoints() {
		for (int i=0;i<linkedList.size();i++) {
			i++ ;
			numelement = i;
		}
		return numelement;
	}
	
	public boolean contains(Point pt) {
		for (Point point : linkedList) {
			if (point == pt) return true ;
		}
		return false;
	}
	
	public LinkedList<Point> getL() {
		return linkedList;
	}
	/*
	public String toString() {
		return Arrays.toString(getL());
	}
	*/
	@Override
	public String toString() {
		return ""+getL();
	}
}
