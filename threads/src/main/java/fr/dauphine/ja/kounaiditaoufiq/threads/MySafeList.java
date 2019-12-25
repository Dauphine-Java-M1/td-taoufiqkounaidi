package fr.dauphine.ja.kounaiditaoufiq.threads;

import java.util.ArrayList;

public class MySafeList{

	ArrayList<Double> list;
	
	public MySafeList() {
		this.list = new ArrayList<Double>();
	}
	
	public void add(Double e) {
		list.add(e);
	}
	
	public int size() {
		return list.size();
	}
	
	public synchronized Double get(int index) {
		return list.get(index);
	}
	
	public static boolean stressTest(int n, final int m) throws Exception {
		final MySafeList safelist = new MySafeList();
		ArrayList<Thread> listTh = new ArrayList<Thread>();
		
		for (int i = 0; i < n; i++) {
			Runnable r = new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < m ;j++) {
						safelist.add((double) j);
					}
				}
			};
			
			listTh.add(new Thread(r));
			
		for (Thread t : listTh) {
			t.start();
		}
		
		System.out.println("Size of the list :"+ safelist.size() +" and its max size is :" +(n*m));
		
		for (Double d : safelist.list) {
			System.out.println(d);
		}
		}
		return safelist.size() == (n*m);
	}
}