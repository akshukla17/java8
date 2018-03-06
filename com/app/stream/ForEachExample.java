package com.app.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {

		List<Integer> numbers =Arrays.asList(12,112,434,121,343,2321,343,434,11,33,2,1,445);
		
		System.out.println("Sorted orders numbers");
		numbers.stream()
				.forEachOrdered((p) ->System.out.print(p+" ,"));
		System.out.println("\n JAVA 7  ----print unique number from list");
		
		Set<Integer> numbersSet=new HashSet<Integer>(numbers);
		System.out.println(numbersSet);
		
		System.out.println("\n JAVA 8 --- -set "+
		numbers.stream()
				.collect(Collectors.toSet()));
		
		System.out.println(" \n"+numbers.parallelStream()
				.collect(Collectors.toSet()));
		/*System.out.println(" \n ****************");
		numbers.parallelStream()
				.filter(number -> number>100)
				.forEach(p ->System.out.print(p+" \t"));*/
	}

}
