package com.app.ques;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array of distinct integers,
 *  print all the pairs having positive value and negative value of a number that exists in the array.
 *  INPUT:  1 -3 2 3 6 -1
 *  OUTPUT : [1,-1] & [-3,3]
 * 
 */
/*
 * 	2
	
	6
	1 -3 2 3 6 -1
	
	8
	4 8 9 -4 1 -1 -8 -9
 *
 *
 */
public class FindPair {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total_sets = sc.nextInt();
		int a[] = null;

		for (int i = 0; i < total_sets; i++) {
			int array_size = sc.nextInt();
			a = new int[array_size];
			for (int j = 0; j < array_size; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			doLogic(a);
		}
		sc.close();
	}

	private static void doLogic(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			for (int j = i + 1; j < a.length - 1; j++) {
				if (num == -a[j]) {
					System.out.print(num +" "+ a[j]+" " );
					break;
				}
			}
		}
	}
}
