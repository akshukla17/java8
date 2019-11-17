package com.app.array;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[]= {2,1,5};
		Arrays.stream(a).forEach(x -> System.out.print(x+" "));
		System.out.println("\n Merge sort");
		sort(a,0,a.length-1);
	}

	private static void sort(int[] a, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			sort(a, start, mid);
			sort(a,mid+1,end);
			
			merge(a,start, mid, end);
		}
	}

	private static void merge(int[] a, int start, int mid, int end) {

		int left[] = new int[mid-start+1];
		int right [] = new int[end-mid];
		int k=0,l=0;
		for(int i=start;i< mid-start+1;i++) {
			left[k++]= a[start+ i];
		}
		for(int i=mid;i < end-mid ; i++) {
			right[l++] = a[mid+ 1+ i];
		}
		int x=0, y=0;
		while(x < left.length-1 && y < right.length-1) {
		}
	}
}
