package com.app.gc;

public class GCEx1 {

	static GCEx1 tt;
	static int count;
	public static void main(String[] args) throws InterruptedException {

		GCEx1 t=new GCEx1();
		
		t=null;
		
		System.gc();
		
		Thread.sleep(100);
		
		tt=null;
		System.out.println("GC is called into "+count+" times");
	}
	@Override
	protected void finalize() throws Throwable {
		count++;
		System.out.println(this.toString());
		tt=this;
	}

}
