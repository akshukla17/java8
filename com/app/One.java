package com.app;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class One {
public static void main(String[] args) {
	double d =  Math.pow(11, 20);
	System.out.println(BigDecimal.valueOf(Math.pow(11, 20)));
	System.out.println();
	String s = d+"";
	int c=0;
	for(int i=0;i< s.length();i++) {
		char cc = s.charAt(i);
		System.out.print(cc+", ");
		if(cc == 1) {
			c++;
		}
	}
	System.out.println("\n"+c);
	
	Set<String> set = new HashSet<>(); 
	set.add("a");
	set.add(null);
	set.add("a ");
	set.forEach(p -> System.out.print(p+" "));
	
	List<String> list = new LinkedList<>();
	list.add("ajay");
	list.add("game");
	list.add("changer");
	Iterator<String> itr= list.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
//		itr.remove();
		list.clear();
	}
}
}
