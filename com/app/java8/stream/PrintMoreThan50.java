package com.app.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrintMoreThan50 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(55);
		list.add(47);
		list.add(39);
		list.add(329);
		list.add(41);
		
		System.out.println("print those number whose+10 is greater than 50 ");
		
		list.stream().filter(i -> {if((i+10)> 50) return true;
		return false;}).forEach(j -> System.out.println(j));
		
		System.out.println("************2nd way************");
		Consumer<Integer> c;
		for(Integer i: list) {
			 c = (p) -> PrintMoreThan50.moreThan50(i, 10);
			 c.accept(i);
		}
//		list.stream().filter( i ->  t = PrintMoreThan50::moreThan50);
	}
	
	public static boolean moreThan50(int a, int b) {
		return a+b > 50;
	}
}
