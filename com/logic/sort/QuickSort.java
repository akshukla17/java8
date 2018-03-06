package com.logic.sort;

import com.logic.common.Print;

public class QuickSort {
	
	public static void main(String[] args) {
		Print p=new Print();
		int[] arr = {1,2,1,2,3,2,1,2,1,2,3,2,1,23,2,2,1,3,2,2,2,2,2,2,1,1,1};
		p.printArr("original array", arr);
		System.out.println("**********************");
		quickSort(arr, 0, arr.length - 1);
		
		p.printArr("sorted array", arr);
	}

	private static void quickSort(int[] arr, int start, int last) {

		if (start < last) {
			int partation = partation(arr, start, last);
			quickSort(arr, start, partation-1);
			quickSort(arr, partation + 1, last);
		}
	}

	private static int partation(int[] arr, int start, int last) {
		Print p=new Print();
		int pivot = arr[last];
		int pIndex = start-1;

		for (int i = start; i < last; i++) {

			if (arr[i] < pivot) {
				pIndex++;
				swap(arr, pIndex, i);
				p.printArr("inside loop", arr);
			}
		}
		swap(arr, last, pIndex+1);
		p.printArr("int arr", arr);
		return pIndex+1;
	}

	private static void swap(int[] arr, int i, int j) {

		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
