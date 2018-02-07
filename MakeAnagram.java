package com.app.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

/* two string is given , find cout
how many element will be remove from both string so that 
both will become anagram of each other

*/
public class MakeAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="abcsa";
		String b="asacdre";
		
		int value=logic(a.toCharArray(),b.toCharArray());
		System.out.println("number of characters removal : "+value);
		
	}

	private static int logic(char[] a, char[] b) {
		int value=0;
		Map<Character,Integer> ma=null;
		Map<Character,Integer> mb=null;
		if(a==null && b!=null) {
			return b.length;
		}else if(a!=null && b==null) {
			return a.length;
		}else {
				ma=fillMap(a, ma);
				mb=fillMap(b,mb);
				printMap(ma);
				System.out.println("**********");
				printMap(mb);
				 value=anagram(ma,mb);
				/*if(ma.size()<mb.size()) {
					for(Entry e:ma.entrySet()) {
						int u=ma.get(e.)
					}
				}*/
				
			return value;
		}
	}

	private static int anagram(Map<Character, Integer> ma, Map<Character, Integer> mb) {
		int value=0;
		if(ma.size()<mb.size()) {
			for(Entry<Character,Integer> e:ma.entrySet()) {
				Integer a= e.getValue();
				if(mb.containsKey(e.getKey())) {
					Integer b=mb.get(e.getKey());
					if(a<b) {
						value+=(b-a);
						mb.put(e.getKey(),(b-a));
					}else if(a>b) {
						value+=(a-b);
						ma.put(e.getKey(),(a-b));
					}else {
						mb.put(e.getKey(),0);
						ma.put(e.getKey(),0);
					}
				}
				
			}
		}
		System.out.println("after updation value ");
		printMap(ma);
		System.out.println("=======");
		printMap(mb);
		value=countValue(ma);
		return value;
	}

	private static int countValue(Map<Character, Integer> m) {
		int a=0;
		for(Entry<Character,Integer> e:m.entrySet()) {
			a+=e.getValue();
		}
		return a;
	}

	private static void printMap(Map<Character, Integer> m) {
		for(Entry<?, ?> e:m.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
		}
	}

	private static Map<Character, Integer> fillMap(char[] a, Map<Character, Integer> m) {
		if(m==null) {
			m=new HashMap<Character,Integer>();
			for(int i=0;i<a.length;i++) {
					if(m.containsKey(a[i])) {
						m.put(a[i], m.get(a[i])+1);
					}else {
						m.put(a[i], 1);
					}
			}
		}
		return m;
	}

}
