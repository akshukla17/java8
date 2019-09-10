package com.app.java8.stream;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPart2 {

	public static void main(String[] args) {
		String [] str = {"ajay","vijay","shikha","susel"};
		Stream<String> stream = Stream.of(str);
		System.out.println("print string not Start with 's'");
		stream.filter(s -> !s.startsWith("s")).collect(Collectors.toList())
		       .forEach(s -> System.out.print(s+" "));
		
		System.out.println("\n check if 'susel' name is available in given string stream");
		stream =Stream.of(str);
		System.out.println(stream.anyMatch(p ->p.equals("susel")));
		
		stream =Stream.of(str);
		System.out.println("replace 'vijay' with 'sachin' if exist");
		
		
		int a =10;
		int b =20;
		BiFunction<Integer, Integer, Integer> c = (x,y) -> { return (x+y);};
		System.out.println(c.apply(a, b));
		
	}
}
