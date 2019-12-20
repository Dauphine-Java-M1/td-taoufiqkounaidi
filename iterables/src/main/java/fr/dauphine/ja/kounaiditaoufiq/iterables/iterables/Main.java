package fr.dauphine.ja.kounaiditaoufiq.iterables.iterables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		Iterator<Integer> it = Panel.panel1(1, 5);
		for (;it.hasNext();) {
			System.out.println(it.next());
		}
		
		for (int i:Panel.panel2(1, 5)) {
			System.out.println(i);
		}
		

		List<Integer> l = Panel.panel(3, 6);
		for (int i : l) {
			System.out.println(i);
		}
		System.out.println(l.get(1));
		*/
		ArrayList<Integer> al = new ArrayList<Integer>();
    	for (int i = 0; i < 1000000; i++) {
    		al.add(i);
    	}
    	long t0 = System.nanoTime();
    	List<Integer> ret = Mult.mult(2, al);
    	long sum=0;for(int val : ret) {
    		sum+=val/2;
    	}
    	
    	System.out.println((System.nanoTime() - t0));
    	
    	LinkedList<Integer> ll = new LinkedList<Integer>();
    	for (int i = 0; i < 1000000; i++) {
    		ll.add(i);}
    	t0 = System.nanoTime();
    	sum=0;ret = Mult.mult(2, ll);
    	for(int val : ret) {sum+=val/2;}
    	
    	System.out.println((System.nanoTime() - t0));
	}



}
