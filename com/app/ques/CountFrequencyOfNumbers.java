package com.app.ques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Count frequencies of all elements in array in O(1) extra space and O(n) time
 * 
 * Input: arr[] = {2, 3, 3, 2, 5} Output: Below are frequencies of all elements
 * 1 -> 0 2 -> 2 3 -> 2 4 -> 0 5 -> 1
 *
 */
public class CountFrequencyOfNumbers {

	public static void main(String[] args) {
		int[] a = { 2, 3, 3, 2, 5 };
		System.out.println("\n array ");
		Arrays.stream(a).forEach(x -> System.out.print(x + ", "));
		
		Map<Integer, Integer> map = null;
		int i = 0;
		while (i < a.length) {
			if (map == null) {
				map = new HashMap<Integer, Integer>();
				map.put(a[i], 1);
			} else if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
			i++;
		}
		
		System.out.println("\n print count of numbers ");
		for (Entry<Integer, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+" with count  "+e.getValue());
		}

	}

}
