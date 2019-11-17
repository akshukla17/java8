package com.app.thread;

/**
 * Idea to give an example of inter thread communication
 * 
 * @author Ajay
 *
 */
public class InterThreadCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}

class Customer {

	int totalAmount =10000;

	synchronized public void withdraw(int amount) {
		System.out.println("Going to withdraw , amount: " + amount);

		while (totalAmount < amount) {
			try {
				System.out.println("Less balance; waiting for deposit...");  
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		totalAmount -= amount;
		System.out.println("Amount withdrawn " + amount + " successfully");
	}

	synchronized public void deposit(int amount) {

		System.out.println("Going to deposit : " + amount);

		totalAmount += amount;

		System.out.println("Total amount become :: " + totalAmount);
		notify();
	}
}
