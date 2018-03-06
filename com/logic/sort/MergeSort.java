package com.logic.sort;

import com.logic.common.Print;

public class MergeSort {

	public static void main(String[] args) {
		Print pr=new Print();
		int arr[]= {12,1,32,43,44,5,334,2};
		pr.printArr("integer", arr);
		sort(arr,0,arr.length-1);
		System.out.println("final sorted array id : \n");
		pr.printArr("integer", arr);
	}

	public static void sort(int[] arr, int first, int last) {
		if(first<last) {
			int middle=(first+last)/2;
			sort(arr,first,middle);
			sort(arr,middle+1,last);

			mergerSort(arr,first,middle,last);
			
		}
		
	}
	public static void mergerSort(int[] arr, int first, int middle, int last) {

		//create 2 temp array
		int n1 = middle-first+1;
		int n2 = last-middle;
		int[]left=new int[n1];
		int[]right=new int[n2];
		
		//copy data from original array to corresponding temp arrays
		for(int i=0;i<n1;i++) {
			left[i]=arr[first+i];
		}
		for(int j=0;j<n2;j++) {
			right[j]=arr[middle+1+j];
		}
		int i=0,j=0;
		int k=first;
		//comparing data from both array and put the sorted data into main array
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		//copy the remaining data into main array
		while(i<n1){
			arr[k]=left[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k]=right[j];
			j++;
			k++;
		}
		//return arr;
	}

}
