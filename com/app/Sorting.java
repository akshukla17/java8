package com.app;

import java.util.Comparator;
import java.util.List;

public class Sorting implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getLastName().compareTo(p2.getLastName());
	}
	
	public void printConditionally(List<Person> people,Condition condition ) {
		for (Person person : people) {
			if(condition.test(person)){
				System.out.println(person);
			}
			
		}
	}
}

interface Condition{
	public boolean test(Person p);
	
}
