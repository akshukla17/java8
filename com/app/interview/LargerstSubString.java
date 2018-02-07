package com.app.leet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.

// abcdabcdefrass

public class LargerstSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.nextLine();
		// findSubString(input);
		method(input);
		sc.close();

	}

	public static void method(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
			System.out.println(set);
		}
		System.out.println("sdffffffffffffffff"+set);
		System.out.println(ans);
	}

	private static void findSubString(String input) {

		// better approach

		Set<Character> set = new HashSet<Character>();
		Set<Character> finalSet = new HashSet<Character>();
		int n = input.length();
		int i = 0, j = 0;
		while (i < n && j < n) {

			if (!set.contains(input.charAt(j))) {
				set.add(input.charAt(j++));
			} else {
				set.remove(input.charAt(i++));
			}

			if (finalSet.size() < set.size()) {
				finalSet = null;
				finalSet = set;
			}
			System.out.println(set + " length : " + set.size());
			System.out.println(" finale " + finalSet);
		}

		System.out.println(" largest sub string is : " + finalSet + " length : " + finalSet.size());

		// O(n2) approach
		/*
		 * char[] chr = input.toCharArray(); String s = null; String fs = null; for (int
		 * i = 0; i < input.length(); i++) { s = "" + chr[i];
		 * 
		 * for (int j = i + 1; j < input.length(); j++) {
		 * 
		 * if (s != null && !s.contains("" + chr[j])) { s = s + chr[j]; } else { break;
		 * } } // System.out.println("SSSSSSSSSSSSSSSS " + s); //
		 * System.out.println("FFFFFFFFFFF " + fs); if(fs==null) fs=s;
		 * 
		 * if (fs != null && fs.length() < s.length()) { fs = s; } }
		 * 
		 * System.out.println(" Final largest substring is : "+fs);
		 */
	}

}
