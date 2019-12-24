package fr.dauphine.ja.kounaiditaoufiq.generics;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	public static <T> void print(List<T> list) {
		for (T o : list) {
			System.out.println(o);
		}
	}
	
	public static <T extends CharSequence> void printLongueur(List<T> list) {
		for (T o : list) {
			System.out.println(o.length());
		}
	}
	
	/*
	public static List listLengthbis(List list) {
		ArrayList length=new ArrayList();
		for(int i=0;i<list.size();i++) {
		CharSequence seq=(CharSequence)list.get(i);
		length.add(seq.length());
		}
		return length;
	}
	*/
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> listLength(List<? extends CharSequence> list){
		ArrayList l = new ArrayList();
		for (int i=0 ; i<list.size() ; i++) {
			CharSequence seq = list.get(i);
			l.add(seq.length());
		}
		return list ;
	}
}
