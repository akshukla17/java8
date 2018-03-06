package com.logic.sort;

import com.logic.common.Print;

public class BubbleSort {

	public static void main(String[] args) {
		Print print=new Print();
		int[] unsortedArr={1,3,2,55,3,43,21,432,44,68,9,5};
		print.printArr("Unsorted array: ",unsortedArr);
		
		int[]sortedArr=sortedArr(unsortedArr);
		System.out.println();
		print.printArr("Sorted array: ",sortedArr);
	}

	private static int[] sortedArr(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					 temp=arr[j];
					 arr[j]=arr[i];
					 arr[i]=temp;
				}
			}
		}
		return arr;
	}

}
