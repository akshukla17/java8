package com.app.thread;

public class ThreadGroupEx implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		ThreadGroupEx runnable=new ThreadGroupEx();
		ThreadGroup th=new ThreadGroup("parent group");
		Thread t1=new Thread(th, runnable,"one");
		Thread t2=new Thread(th,runnable, "two");
		Thread t3=new Thread(th,runnable, "three");
		
		System.out.println("Thread parent name : "+th.getName());
		th.list();
		
		
		t2.start();
		t1.start();
		t3.start();
		
		try {
			t3.join(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
