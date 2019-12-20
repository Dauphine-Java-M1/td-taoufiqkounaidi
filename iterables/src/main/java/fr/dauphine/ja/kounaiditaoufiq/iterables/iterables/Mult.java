package fr.dauphine.ja.kounaiditaoufiq.iterables.iterables;

import java.util.*;

public class Mult {
	
	public static List<Integer> mult(final int n,final List<Integer> listint){
		if (listint instanceof RandomAccess) {
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int index) {
					return listint.get(index) * n;
				}

				@Override
				public int size() {
					return listint.size();
				}
			};
		} else {
			return new AbstractSequentialList<Integer>() {
				
				@Override
				public int size() {
					return 0;
				}
				@Override
				public ListIterator<Integer> listIterator(int index) {
					return new ListIterator<Integer>() {

						private ListIterator<Integer> lit = listint.listIterator();
						
						public boolean hasNext() {
							return lit.hasNext();
						}

						public Integer next() {
							return lit.next() * n;
						}

						public boolean hasPrevious() {
							return lit.hasPrevious();
						}

						public Integer previous() {
							return lit.previous() * n;
						}

						public int nextIndex() {
							return lit.nextIndex();
						}

						public int previousIndex() {
							return lit.previousIndex();
						}

						public void remove() {
							throw new UnsupportedOperationException();
						}

						public void set(Integer e) {
							throw new UnsupportedOperationException();
						}

						public void add(Integer e) {
							throw new UnsupportedOperationException();
						}
						
					};
				}		
			};
			}
	}
}