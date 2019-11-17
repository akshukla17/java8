package com.app.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceMain {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		
		for(int i=0;i< 10;i++) {
			Thread t = new WorkerThread(" "+i);
			executor.execute(t); // run command
		}
		
		executor.shutdown();
		while(! executor.isTerminated()) {
		}
		System.out.println("all threads jobs are DONE");
	}
}

class WorkerThread extends Thread {
	String message;

	public WorkerThread(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();// call process message method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
