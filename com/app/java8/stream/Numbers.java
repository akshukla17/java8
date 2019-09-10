package com.app.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
/**
 * https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx
 * @author Ajay
 *
 */
public class Numbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
		List<Integer> result =null;
		System.out.println("Using an anonymous class");
		// Using an anonymous class
		result =findNumbers(list, new BiPredicate<Integer, Integer>() {
		  public boolean test(Integer i1, Integer i2) {
		    return Numbers.isMoreThanFifty(i1, i2);
		  }
		});
		result.forEach(i -> System.out.print(i+" "));
		System.out.println("\nUsing a lambda expression");

		// Using a lambda expression
		result = findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));
		result.forEach(i -> System.out.print(i+" "));
		System.out.println("\nUsing a method reference");
		
		// Using a method reference
		result = findNumbers(list, Numbers::isMoreThanFifty);
		result.forEach(System.out:: println);
		System.out.println();
	}
	 public static boolean isMoreThanFifty(int n1, int n2) {
		    return (n1 + n2) > 50;
	}
	 
	public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
		      List<Integer> newList = new ArrayList<>();
		      for(Integer i : l) {
		        if(p.test(i, i + 10)) {
		          newList.add(i);
		        }
		      }
		      return newList;
		  }
	
		  
}
