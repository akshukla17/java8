package com.logic.sort;

public class BinaryTreeLength {

	public static void main(String[] args) {

		int [] a= {23,34,35,44,56,78,88};
		System.out.println("Without binary sorting");
		Print.printArray(a);
		int n=a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		System.out.println("After making binary tree ");
		Print.printArray(a);
	}

	private static void heapify(int[] a, int n, int i) {

		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && a[left]>a[largest])
			largest=left;
		if(right<n && a[right]>a[largest])
			largest=right;
		
		if(largest!=i) {
			int tmp=a[largest];
			a[largest]=a[i];
			a[i]=tmp;
			heapify(a, n, largest);
		}
			
	}

}
