package com.app.interview;
/*
 * given array is from 1 to n integer.
 * only one element missing and only one is duplicated,
 * find them
 */
import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndMissingNumber {

	public static void main(String[] args) {

		int a[]= {2,4,1,1,6,5,7};
		findDuplicate(a);
	}

	private static void findDuplicate(int[] a) {
		int cSum=0;
		int nSum=0;
		List<Integer> ls=new ArrayList<>(a.length);
		for(int i=0;i<a.length;i++) {
			ls.add(a[i]);
			cSum+=a[i];
			nSum+=(i+1);
		}
		boolean found=false;
		int m=0;
		for(int i=0;i<a.length;i++) {
			if(!ls.contains(i+1) && !found) {
				m=i+1;
				System.out.println("missing number: "+m);
				found=true;
			}
		}
		System.out.println("duplicate number: "+(cSum+m-nSum));
		/*
		System.out.println("cSum: "+cSum+" nSum: "+nSum);
		for(Integer i:ls) {
			System.out.print(i+" ");
		}
		System.out.println("*******");*/
		
	}

}
