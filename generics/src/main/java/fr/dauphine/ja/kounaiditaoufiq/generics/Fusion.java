package fr.dauphine.ja.kounaiditaoufiq.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Fusion {
	
	public static void main(String[] args) {
		//Exo 4
    	List<String> l1= Arrays.asList("C", "rc");
    	List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
    	List<? extends CharSequence> r1=fusion(l1,l2);
    	List<?> r2=fusion(l1,l2);
    	List<Integer> l3 = Arrays.asList(1,2);
    	List<Integer> l4 = Arrays.asList(10,20);
    	List<Integer> r3 = fusion(l3,l4);
    	List<?> r4 = fusion(l1,l3);
    	System.out.println(r1);
    	System.out.println(r2);
    	System.out.println(r3);
    	System.out.println(r4);
	}
	
	public static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2){
		List<T> listfusion = new LinkedList<T>();
		Iterator<? extends T> itr1 = l1.iterator(); 
		Iterator<? extends T> itr2 = l2.iterator();
		
		while (itr1.hasNext()) {
			listfusion.add(itr1.next());
			listfusion.add(itr2.next());
		}
		return listfusion;
	}
	
	
}
