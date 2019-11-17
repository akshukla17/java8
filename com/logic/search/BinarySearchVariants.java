package com.logic.search;
/**
 * will use binary search with variant options
 * 
 * 1. find first occurrence of given number
 * 2. find last occurrence of given number
 * 3. contains
 * 4.Index of least element greater than key
 * 5. Index of greatest element less than key
 * @author AS52140
 *
 */
public class BinarySearchVariants {

	public static void main(String[] args) {
		int a[] = {1,2,2,2,2,4,5,6,8,11,11,11,33,45,56,66};
		int target = 21;
		
		System.out.println("find first occurrence of "+target +" at index:  "+ firstOccurrence(a,target));
		System.out.println("find first occurrence of "+target +" at index:  "+ first(a,target));
	}
	
	private static int first(int a[], int target) {
		int index =-1;
		int low = 0, high = a.length-1;
		
		while(low < high) {
			int mid = (low+high)/2;
			
			int val = a[mid];
			
			if(val < target) {
				low = mid+1;
				
			}else if(val > target) {
				high = mid-1;
			}else {
				index = mid;
				high = mid-1; // to find lowest matched index // point 4
//				low = mid+1; // to find highest matched index   point 5
			}
		}
		
		return index;
	}

	private static int firstOccurrence(int[] a, int target) {
		int index = SearchDuplicateElementOccurrence.binarySearch(a, target);

		int t = index-1;
		int pre =-1;
		while (t >= 0) {  // not good in worst case , here we r doing linear searching
			if (a[t] == target) {
				pre = t;
				t--;
			} else {
				break;
			}
		}
		return pre !=-1 ? pre : index;
	}
}
