package com.app.media;

public class InterThreadCommunication {

	private int amount=10000;

	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw amount");
		if(this.amount<amount) {
			System.out.println("Less amount, waiting for deposit");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.amount-=amount;
		System.out.println("Amount withdrawal is completed");
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Going for deposit");
		this.amount+=amount;
		System.out.println("deposit completed");
		notify();
		
	}
	public static void main(String[] args) {

		InterThreadCommunication obj=new InterThreadCommunication();
		Thread t1=new Thread() {
			public void run() {
				obj.withdraw(15000);
			};
		};
		
		Thread t2=new Thread() {
			public void run() {
				obj.deposit(10000);
			};
		};
		
		t1.start();
		t2.start();
		
		
	}

}
