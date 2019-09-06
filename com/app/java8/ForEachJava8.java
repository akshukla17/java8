package com.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachJava8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		//using Consumer functional interface as anonymous class
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("print anonymously: "+t);				
			}
		});
		
//		list.forEach(x -> System.out.println(x));
	}
}
