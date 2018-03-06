package com.logic.search;

// find occurance in log N
public class FindOccurance {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3};
		int search = 3;
		int counter = 0;
		find(a, 0, a.length - 1, search);
	}

	private static void find(int[] a, int first, int last, int search) {
		int count=0;
		int left=0;
		int right=0;
		int mid=(first+last)/2;
			if(search ==a[mid]) {
				left=mid;
				right=mid;
			}
	}

}