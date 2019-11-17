package com.app.java8;

public class I1I2Impl  implements I1, I2{

	public static void main(String[] args) {
		I1I2Impl c = new I1I2Impl();
		c.display();
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("my own default method");
	}

}
