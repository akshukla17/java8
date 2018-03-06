package com.core;

import java.util.HashMap;
import java.util.Map;

public class StringFAQ {
	public static void main(String[] args) {
		String a="name";
		String b="name";
		String c=new String("name");
		/*According to Java specification, 
		1) Two unequal objects may return the same hashcode.
		2) When two objects are equal by equals(), they must have the same hashcode.

		*/
				
		System.out.println("hashcode a:"+a.hashCode()+" hashcode b "+b.hashCode()+ " hashcode c "+c.hashCode());
		
		//TODO about point 1
		
		
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        map.put(1, 11);
	        map.put(4, 11);
	        System.out.println(map.hashCode());
	        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
	        map1.put(1, 11);
	        map1.put(4, 12);
	        System.out.println(map1.hashCode());
	        if (map.equals(map1)) {
	            System.out.println("equal ");
	        }
	    }
}
