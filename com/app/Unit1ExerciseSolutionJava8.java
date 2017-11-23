package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		Sorting s=new Sorting();
		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyel",51),
				new Person("Charlotte","Brante",45),
				new Person("Matthew","Arnold",39)
				);
		System.out.println(" ********************JAVA 8*****************************\n \n ");
		
		System.out.println("**************Without Sorting*********************");
		s.printConditionally(people, p -> true);
		//sort by last name
		
		Collections.sort(people, s);
			
		
		// create method which will print all elements in the list
		System.out.println("************print all elements in the list******************");
		s.printConditionally(people,p ->true);
		
		
		// create method that print all people that last name beginning with C
		System.out.println("************print all people that last name beginning with C***************");

		s.printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("************print all people that first name beginning with C***************");
		s.printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

}
