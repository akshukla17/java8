package com.app.java8;

@FunctionalInterface
public interface I2 {
	void get();
	default void display() {
		System.out.println("I2 display");
	}

}
