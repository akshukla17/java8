package com.app.string;

import java.util.HashSet;

/**
 * print all possible unique permutations of given string;
 * 
 * https://www.youtube.com/watch?v=GuTPwotSdYw
 * 
 * @author Ajay
 *
 */
public class AllPermutations {

	public static void main(String[] args) {
		String s ="ajay";
		HashSet<String> set = new HashSet<String> (); //storing unique permutations
		doPermutation(s, 0, s.length()-1, set);
//		for (String string : set) {
//			System.out.println(string);
//		}
	}
	// *********complexity O(print single combination  *  all possible combination) *
	//          complexity O(n * n!)
	private static void doPermutation(String s, int sIndex, int eIndex, HashSet<String> set) {

		if(sIndex == eIndex) {
			if(!set.contains(s)) {
				set.add(s);
				System.out.println(s); // print string
			}
		}else {
			for(int i=sIndex;i<= eIndex;i++) {
				s = swap(s, sIndex, i);   // swapping elements  
				doPermutation(s, sIndex+1, eIndex, set);  //permutate and print string 
				s = swap(s, sIndex, i); //restoring to original string
			}
		}
	}

	private static String swap(String s, int start, int i) {
		char [] ch = s.toCharArray();
		char t = ch[start];
		ch[start] = ch[i];
		ch[i] = t;
		return String.valueOf(ch);
	}
}
