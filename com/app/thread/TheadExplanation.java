package com.app.thread;

public class TheadExplanation {

	public static void main(String[] args) {
		System.out.println("Application started===========");
		
		MyThread t  = new MyThread();
		t.start();
		
		Runnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		t2.start();
		
		
		System.out.println("Application finished===========");
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("@@ document printed # "+i+"   printer 2");
			try {
				Thread.sleep(new Double(1000*Math.random()).longValue());   // sleeping for 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("$$ document printed # "+i+" printer 1");
			try {
				Thread.sleep( new Double(1000*Math.random()).longValue()   );   // sleeping for 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}