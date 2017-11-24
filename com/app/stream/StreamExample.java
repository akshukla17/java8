package com.app.stream;

import java.util.Arrays;
import java.util.List;

import com.app.Person;

public class StreamExample {
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
								new Person("Rockie", "Dusuja", 45),
								new Person("Ramesh","Shukla",41),
								new Person("Ramesh", "Kalu", 12),
								new Person("Jakie", "chan", 50),
								new Person("jackie", "V", 30),
								new Person("Venkat", "R", 5)				
								);
		
		System.out.println("**********Print first name whose age is less than 35********");
		
		people.stream()
				.filter(person -> person.getAge() <35)
			//	.forEach(System.out::println);
				.forEach(p -> System.out.println(p.getFirstName()+" with age : "+ p.getAge()));
		
		System.out.println("********print calculated age of all person********* \n"+
		people.stream()
				.map(Person::getAge)
				.reduce(0,(carry,age) -> carry+age));
		
		System.out.println("********Print the person whose age is largest \n"+
				people.stream()
						.max((Person1,Person2) -> Person1.getAge() >Person2.getAge() ? 1 : -1)				
				);
	}


}
