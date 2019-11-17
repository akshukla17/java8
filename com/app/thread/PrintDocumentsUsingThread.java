package com.app.thread;

public class PrintDocumentsUsingThread {
	public static void main(String[] args) {
		Printer p = new Printer();

		Runnable r = new Thread1(p);
		Thread t1 = new Thread(r);
		Thread2 t2 = new Thread2(p);

		t1.start();
//		try {
//			t1.join();   // this will not release until job is finished (not required for synchronized )
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();

	}

}

class Thread2 extends Thread {
	Printer pRef;

	public Thread2(Printer p) {
		pRef = p;
	}

	public void run() {
		System.out.println("Thread2 ******************* " + Thread.currentThread().getName());
		synchronized (pRef) { // synchronized block
			pRef.printDocs(8, "James Bond's profile");
		}
	}
}

class Thread1 implements Runnable {
	Printer pRef;

	public Thread1(Printer p) {
		pRef = p;
	}

	@Override
	public void run() {
		System.out.println("Thread1 ******************* " + Thread.currentThread().getName());
		synchronized (pRef) { // synchronized block
			pRef.printDocs(10, "Miseil's prifile");
		}
	}
}

class Printer {

//	synchronized public void printDocs(int count ,String name) {   // this will block a complete method 
	public void printDocs(int count, String name) {
		for (int i = 0; i < count; i++)
			System.out.println("Docs number # " + i + " printed from " + name);
	}
}
