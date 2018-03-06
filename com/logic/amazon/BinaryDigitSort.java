package com.logic.amazon;

import com.logic.sort.Print;

// given binary array [1,1,1,0,1,0,1,0]
public class BinaryDigitSort {

	public static void main(String[] args) {
		int[] a = {1,1,1,0,1,1,0,0,0,1,1,1,0,0};
		Print.printArray(a);
		int n = a.length - 1;

		for (int i = 0; i < n; ) {
			if (a[i] == 0) {
				i++;
				continue;
			}	
			if (a[n] == 1) {
				n--;
				continue;
			}	
			if (a[i] > a[n]) {
				int t = a[i];
				a[i] = a[n];
				a[n] = t;
				i++;
				n--;
			}
			Print.printArray(a);
		}
		/*
		 * for (int i = 0; i < n; i++) { for (int j = i + 1; j <= n ; j++) { if (a[i] >
		 * a[j]) { int t = a[i]; a[i] = a[j]; a[j] = t; } Print.printArray(a); } }
		 */
		System.out.println("***************");
		Print.printArray(a);
	}

}
