package fr.dauphine.ja.kounaiditaoufiq.threads;

public class ThreadTest {
	
	static Object monitor = new Object();

	public static Runnable threadTest(final int id) {
		
		return new Runnable() {

			public void run() {
				
				boolean flag = false;;
				for (int i = 0; i < 10 ; i++) {
					synchronized(monitor) {
						if (i < 10) {
							i++;
							flag = true;
						}
						if (flag) {
							System.out.println("lol " +i);
						}
						flag = false;
					}
				}
			}	
		};
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(threadTest(1));
		Thread t2 = new Thread(threadTest(2));
		t1.start();
		t2.start();
		
		
	}
}
