package com.app.array;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[]= {51,12,32,4,1,54,6,4,2,67,89};
		Arrays.stream(a).forEach(x -> System.out.print(x+" "));
		System.out.println("\nQuick sort ");
		sort(a);
	}
	
	private static void sort(int a[]) {
		quick(a, 0, a.length-1);
		System.out.println();
		Arrays.stream(a).forEach(x -> System.out.print(x+" "));
		
	}
	private static void quick(int[] a, int start, int end) {

		if(start < end) {
			int partition = partition(a,start,end);
			quick(a, start, partition-1);
			quick(a, partition+1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot =a[end];
		int i=start-1;
		for(int j=start;j < end;j++) {
			if(a[j] < pivot) {
				i++;
				if(i!=j) swap(a,i,j);
			}
		}
		swap(a,i+1,end);
		return i+1;
	}

	private static void swap(int a[], int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j]=t;
	}
}
