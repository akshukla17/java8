package com.app.thread;

import java.util.LinkedList;

/**
 * Try to solve classic producer consumer problem.
 * Here is a list of capacity of 2. 
 * Producer should not insert data if list is full.
 * Consumer should not remove data if list is empty.
 * 
 * using wait and notify method.
 * @author Ajay
 *
 */
public class ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {
		final PCImpl pc = new PCImpl();
		
		//producer thread
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (pc) {
					try {
						pc.produce();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		});
		
		//condumer thread
		Thread t2 = new Thread( new Runnable() {
			
			public void run() {
				synchronized (pc) {
					try {
						pc.consume();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t1.start();
		t1.join();

		t2.start();
		t2.join();
		
	}
}

class PCImpl{
	
	
	LinkedList<Integer> list = new LinkedList<>();
	int capacity =2; 
	public void produce() throws InterruptedException {
		int value = list.size();
		while(value == capacity) {
			wait();
		}
		list.add(value++);
		System.out.println("Producer produced-"+ value); 
		
		notify(); // inform consumer that data is added
		
		Thread.sleep(1000); // make thread sleep for 1 sec
	}
	
	public void consume() throws InterruptedException {

		while(list.size() == 0) {
			wait();
		}
		int value =list.removeFirst();
		
		System.out.println("Consumer consumed-" + value); 
		notify();
		
		Thread.sleep(1000);
	}
}
