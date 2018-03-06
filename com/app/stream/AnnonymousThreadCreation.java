package com.app.stream;

public class AnnonymousThreadCreation extends Thread {

	public static void main(String[] args) {

		Counter c = new Counter();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				c.printTable(5);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				super.run();
				c.printTable(100);
			}
		};
		t1.start();
		t2.start();

	}

}

class Counter {

	// synchronized method
	public synchronized void printTable(int i) {
		for (int j = 1; j < 5; j++) {
			System.out.println(j * i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
