package com.app.java8;

public class IMainImpl implements I1{

	public static void main(String[] args) {
		IMainImpl i = new IMainImpl();
		i.display();
		
		IMainImpl.print();
		
		I1.print();
	}
	
//	@Override // can't override static method of Interface
	static void print() {
		System.out.println("Impl print method");
	}
	
	// can override default method of Interface
	@Override
	public void display() {
		System.out.println("Impl class display method");
	}
	@Override
	public void get() {
		System.out.println("calling Impl method");
		
	}
}
