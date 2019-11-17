package com.app.array;

import java.util.Arrays;

//How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number -

public class FindPairs {
	
	public static void main(String[] args) {
		int a[] = {1,23,12,45,12,21,4,3,2,1};
		int target =24;
		findPair(a,target);
	}

	private static void findPair(int a[], int target) {
		Arrays.sort(a); // n log n
		int i=0, j=a.length-1;
		
		while(i < j) {
			int sum = a[i]+a[j];
			if(sum == target) {
				System.out.println(a[i]+" "+ a[j]);
				i++;
				j--;
			}else if(sum > target) {
				j--;
			}else {
				i++;
			}
		}
	}
}
