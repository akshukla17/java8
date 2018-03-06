package com.app.stream;

public class TestDeadLockEx {

	public static void main(String[] args) {
		String rec1 = "Ajay";
		String rec2 = "Vijay";

		Thread t1 = new Thread() {
			public void run() {

				synchronized (rec1) {
					System.out.println("Thread1 aquired lock on resource1");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (rec2) {
						System.out.println("Thread 1 aquired lock on resource2");
					}
				}
			};
		};

		Thread t2 = new Thread() {
			public void run() {

				synchronized (rec2) {
					System.out.println("Thread2 aquired lock on resource2");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (rec1) {
						System.out.println("Thread 1 aquired lock on resource1");
					}
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}
