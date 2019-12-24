package fr.dauphine.ja.kounaiditaoufiq.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Swaper {

	public static <T> List<T> swap(List<T> list, int i, int j){
		
		if (i > list.size() || j > list.size() || i < 0 || j < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		T ei = list.get(i);
		T ej = list.get(j);
		
		list.set(i, ej);
		list.set(j, ei);
		
		return list;
	}
	
	/*
	public static <T> List<T> shuffle(List<T> list){
		Collections.shuffle(list);
		return list;
	}
	*/
	
	public static <T> List<T> shuffle(List<T> list){
		Random r = new Random();
		for (int i = 1; i<list.size(); i++) {
			int nxt = r.nextInt(i+1);
			Swaper.swap(list, i, nxt);
		}
		return list;
	}
	
	
	public static <T> List<T> shufflerandom(List<T> list, Random r){
		Collections.shuffle(list,r);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> l = Arrays.asList("a","b","c","d");
		System.out.println(Swaper.swap(l, 1, 3));
		System.out.println(Swaper.shuffle(l));
	}
	
}
