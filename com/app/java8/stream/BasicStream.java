package com.app.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		// ****************Stream creation********************
		Integer a[] = { 1, 2, 3, 4 };
		Stream<Integer> streamInt = Stream.of(a);
		System.out.println(streamInt);

		int b[] = { 10, 20, 30 };
		Stream<int[]> intStream = Stream.of(b);
		System.out.println(intStream);

		Stream<String> stream1 = Stream.generate(() -> {
			return "abc";
		});
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
		
		Arrays.stream(new int[] {1,3,4,5});
		
		//*********************Store data from stream***********************************
		
		List<Integer> dataInt = streamInt.collect(Collectors.toList());
		dataInt.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		//streamInt is already used so we can't reuse it. We have to set stream again
		streamInt = Stream.of(new Integer[] {10,20,30,40});
		 Map<Integer, Integer> append100 = streamInt.collect(Collectors.toMap(x -> x, x -> x+100));
		 System.out.println("display values");
		 append100.values().forEach(i -> System.out.print(i+" "));
		 
		 System.out.println();
		//************************Intermediate operation**************************************
		 
		 System.out.println("...............filter operation.............................");
		 Stream<Integer> intData = Stream.of(100,300,12,34,432,342);
		 
		 List<Integer> nums =intData.filter(p -> p > 90).collect(Collectors.toList());
		 System.out.println("print number more that 90");
		 nums.forEach(p -> System.out.print(p+" "));
		 System.out.println();
		 
		 intData = Stream.of(100,300,12,34,432,342);
		 Map<Integer, Integer> mapData = intData.filter(p -> p > 90).collect(Collectors.toMap(p -> p, p -> p*p));
		 System.out.println("printing keys");
		 mapData.keySet().forEach(p -> System.out.print(p+" "));
		 
		 System.out.println("\n.............map operation................");
		 
		 Stream<String> words= Stream.of("aBc","CC","dfg","fre"); // Stream.of(new String[]{"aBc","CC","dfg","fre"});
		 
		 System.out.println("printing words in uppercase");
		 words.map(w ->w.toUpperCase()).collect(Collectors.toList()).forEach(p -> System.out.print(p+ " "));
		 
		 System.out.println("\n................sorted operation..................");
		 
		 Stream<String> unsorted = Stream.of("abc","123","##","xd","xv");
		 
		 System.out.println("sorted in ascending order");
		 
		 unsorted.sorted().collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));
		 
		 unsorted = Stream.of("abc","123","##","xd","xv"); // assigned again because we already used the stream
		 
		 System.out.println("\nprint string in reverse order");
		 unsorted.sorted(Comparator.reverseOrder())
		 		.collect(Collectors.toList())
		 		.forEach(System.out::println); //using method reference to print data
		 
		 System.out.println("...........using flatMap...............");

		Stream<List<String>> namesOriginalList = Stream.of(
			Arrays.asList("Pankaj"), 
			Arrays.asList("David", "Lisa"),
			Arrays.asList("Amit"));
		//flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList
			.flatMap(strList -> strList.stream());
		
		flatStream.forEach(x ->System.out.print(x+" "));
		System.out.println("\n...............reduce operation // it is a acccumilation operation.....................");
		Stream<Integer> data = Stream.of(1,2,3,4,5);
		
		Optional<Integer> sum = data.reduce((i,j) -> {return i+j;});
		System.out.println("print summation of all numbers: "+ sum.get());
		
		data = Stream.of(1,2,3,4,5);
		System.out.println(" numbers count: "+data.count());
		 
	}
}
