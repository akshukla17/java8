package com.app.thread;

public class X  implements Runnable{

	@Override
	public void run() {
		System.out.println("Test");		
	}
	
	public static void main(String[] args) {
		Thread t=new Thread(new X());
		t.start();
		
		Thread tt = new Thread();
		tt.start();
	}

}
