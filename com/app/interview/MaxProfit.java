package com.app.ques;

import java.util.Scanner;

import com.app.sort.Print;

public class MaxProfit {

	public static void main(String[] args) {

		System.out.println("Enter the length of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Given array is ");
		Print.printArray(a);
		int min = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (min == 0)
				min = a[i];
			if (max == 0)
				max = a[i];
			if ((i + 1) < n && max < a[i + 1]) {
				max = a[i + 1];
			} else {
				System.out.println("Buy at " + min + " and sell at " + max);
				min = max = 0;
			}
		}
		if (min != 0 && max != 0) {
			System.out.println("Buy at " + min + " and sell at " + max);
		}
	}

}
