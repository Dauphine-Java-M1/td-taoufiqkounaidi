package fr.dauphine.ja.kounaiditaoufiq.generics;

public class Maximums {
	
	public static <T extends Comparable<T>> T myMax(T o, T...objets) {
		T max = o;
		for (T i : objets) {
			if (i.compareTo(max) > 0) {
				return max = i;
			}
		}
		return max;
	}
	
	/*
	public static int myMaxbis(int i,int...integers) {
		int max = i;
		for (int j : integers) {
			if (j > max) {
				return max = j;
			}
		}
		return max;	
		
	}
	*/
	
}
