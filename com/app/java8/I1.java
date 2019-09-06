package com.app.java8;

@FunctionalInterface
public interface I1 {

	
	void get();
	default void display() {
		System.out.println("I1 display");
	}
	static void print() {
		System.out.println("I1 print method");
	}
	
	//A default method cannot override a method from java.lang.Object 
	
//	default boolean equals(Object obj) {
//		return false;
//	}
}
