package com.app.java8.stream;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class NonStaticMethodReference {

	public static void main(String[] args) {
		
		NonStaticMethodReference methodReference = new NonStaticMethodReference();
		 Supplier<String> supplier=	methodReference::hello;
		 System.out.println(supplier.get());
		 System.out.println("Using BiFunction<T, U, R>............");
		 BiFunction<Integer, Integer, Integer> bi = methodReference::addition;
		 
		 System.out.println(bi.apply(10, 20));
	}
	
	public String hello() {
		return "hello, non-static method";
	}
	
	public int addition(int x, int y) {
		return x+y;
	}
}
