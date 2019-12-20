package fr.dauphine.ja.kounaiditaoufiq.iterables.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer>{

	private final int first;
	private final int last;
	
	public Panel(int first, int last) {
		this.first = first;
		this.last = last;
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){

			private int position = first;
			
			public boolean hasNext() {
				return position >= last;
			}

			public Integer next() {
				return position++;
			}
		};
	}
	
	public static Iterator<Integer> panel1(int i, int j) {
		Panel p1 = new Panel(i,j);
		return p1.iterator();
	}
	
	public static Iterable<Integer> panel2(int i, int j) {
		return new Panel(i,j);
	}
	
	public static List<Integer> panel(int i, int j){
		return new Panel(i,j);
	}

	@Override
	public Integer get(int index) {
		if (first + index >= last) throw new IndexOutOfBoundsException();
		return first + index;
	}

	@Override
	public int size() {
		return last - first + 1;
	}


	
}

