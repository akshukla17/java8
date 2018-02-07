package com.app.ques;

import java.util.Arrays;

/**
 * Union and Intersection of two sorted arrays
 *  complexity -- O(n)
 * @author A417
 *
 */

public class UnionAndIntersection {
	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 7, 23, 99, 999, 1234 };
		int b[] = { 4, 5, 6, 23, 44, 566, 1234, 7890 };
		System.out.println("\n first array ");
		Arrays.stream(a).forEach(x -> System.out.print(x + ", "));
		System.out.println("\n second array");
		Arrays.stream(b).forEach(x -> System.out.print(x + ", "));

		int i = 0;
		int j = 0;
		int k = 0;

		System.out.println(" \n Find common element from both arrays");
		int[] common = new int[a.length <= b.length ? a.length : b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				common[k++] = a[i];
				i++;
				j++;
			}
		}
		System.out.println("\n Common array");
		Arrays.stream(common).forEach(x -> System.out.print(x + ", "));

		int[] union = new int[a.length + b.length];
		i = 0;
		j = 0;
		k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				union[k++] = a[i++];
			} else {
				union[k++] = b[j++];
			}
		}
		while (i < a.length) {
			union[k++] = a[i++];
		}
		while (j < b.length) {
			union[k++] = b[j++];
		}
		System.out.println(" \n Union of both arrays");
		Arrays.stream(union).forEach(x -> System.out.print(x + ", "));

	}

}
