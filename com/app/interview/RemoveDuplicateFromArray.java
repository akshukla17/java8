package com.app.interview;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		String s="geeksforgeeks";
		// remove duplicate alphabet/character from the given string and print.
	//	usingCharAt(s);
	//	withoutCharAt(s);
		
		//print occurrence of character of given string
		System.out.println(s);
		findOccurrence(s);
		
		
	}

	private static void findOccurrence(String s) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			System.out.println("key: "+e.getKey()+" value: "+e.getValue());
		}
	}

	private static void withoutCharAt(String s) {
		System.out.println("without charAt");
		char[]ch=s.toCharArray();
		HashSet<Character> newSet =new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			newSet.add(ch[i]);
		}
		System.out.println(newSet);
	}

	private static void usingCharAt(String s) {
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		System.out.print(set);
	}

}
