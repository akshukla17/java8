package com.logic.search;

/**
 * Given a sorted array with possible duplicate elements. Find number of occurrences of input ‘key’ in log N time.
 * 
 * a= [1,2,3,3,3,3,4,4,4,5,8,9,9,11]
 * target = 3, output = 4
 * @author Ajay
 *
 */
public class SearchDuplicateElementOccurrence {

	public static void main(String[] args) {
		int a [] = {1,2,3,3,3,3,4,4,4,5,8,9,9,11};
		int target = 91;
		System.out.println(target +" occurred in given array "+ occured(a,target)+ " times");
	}
	
	private static int occured(int a[], int target) {
		
		int index = binarySearch(a, target);
		if(index == -1) {
			return 0;
		}else {
			int count =0;
			int left =index-1;
			while( left >=0 ) {
				if(a[left] == target) {
					count++;
					left--;
				}else {
					break;
				}
			}
			
			while(index < a.length-1) {
				if(a[index] == target) {
					count++;
					index++;
				}else {
					break;
				}
			}
			return count;
		}
	}

	public static int binarySearch(int[] a, int target) {
		int low = 0;
		int high = a.length;
		while(low < high) {
			int mid = (low + high)/2;
			
			if(a[mid] == target) {
				return mid;
			}else if(a[mid] > target) {
				high = mid;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
}
