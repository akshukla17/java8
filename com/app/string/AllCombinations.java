package com.app.string;

import java.util.HashSet;

/**
 * Find All Possible Combinations Of String In Java
 * 
 * @author Ajay
 *
 */
public class AllCombinations {

	public static void main(String[] args) {
		String s ="wxyz";  // a aj aja ajay j ja jay ay
//		allComb(s, new HashSet<String>(), "");
		printAllSubstrings(s);
	}
	private static void printAllSubstrings(String s) {
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<= s.length();i++) {
			
			for(int j=i;j<= s.length();j++) {
				String ss =s.substring(i, j);
				if( !set.contains(ss)) {
					System.out.println(ss);
					set.add(ss);
				}
			}
		}
	}

	private static void allComb(String s, HashSet<String> set,String start) {
//		for(int i=)
	}
}
