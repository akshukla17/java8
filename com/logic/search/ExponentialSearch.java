package com.logic.search;

import java.util.Arrays;
/**
 * Find given element is found in the sorted array. Assume that length of array is infinite.
 
  			array.length = INFINITE
 
 * @author Ajay
 *
 */
public class ExponentialSearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,11,34,55,67,567,765,5433,22222};
		int target = 545;
		System.out.println("found at index : "+ expoSearch(a,target,1));
	}
	
	private static int expoSearch(int a[], int target, int i) {
		int value = a[i-1];
		if(value == target) {
			return i;
		}else {
			if(value < target) {
				i *=2;
				return expoSearch(a, target,i);
			}
			else{
				int index = Arrays.binarySearch(a, i/2, i, target);
				if(index > -1) {
					return index;
				}else {
					return -1;
				}
			}
		}
	}
}
