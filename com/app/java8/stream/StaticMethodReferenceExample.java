package com.app.java8.stream;

import java.util.function.Consumer;

public class StaticMethodReferenceExample {

	public static void main(String[] args) {
		
		//MethodReference must refer to only FunctionalInteface
		Sayable staticMethodReference = StaticMethodReferenceExample::callMe;
		System.out.println("calling a static method");
		staticMethodReference.staticSay();
		
		System.out.println("Referencing build-in functional inteface");
		
		//MethodReference is nothing but reducing lamdba expression ex: (1) and (2)
		//(1)
		Consumer<String> tt = s ->StaticMethodReferenceExample.display("in-build functional interface refered ");
		tt.accept(null);
		
		//(2)
		Consumer<String> t = StaticMethodReferenceExample::display;
		t.accept("in-build functional interface refered "); // passing input at running time
		
		Thread r = new Thread(StaticMethodReferenceExample::running);
		r.start();
	}
	
	public static void running() {
		System.out.println("running thread");
	}
	public static void callMe() {
		System.out.println("calling callMe static method");
	}
	
	public static void display(String s) {
		System.out.println("display me::  "+s);
	}
}

interface Sayable{
	void staticSay();
	
	default void game() {
		System.out.println();
	};
}
