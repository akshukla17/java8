package com.app.string;

import java.util.Arrays;

public class RorateArray {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int num =4;
		replace(a, num);
		String s ="name";
		for(int i=0; i< s.length();i++) {
			for(int j=i;j<=s.length();j++) {
				System.out.println(s.subSequence(i, j));
			}
		}
//		System.out.println(dd);
	}
	
	private static void replace(int []a, int num){
		   // 5 2
	       // 1 2 3 4 5
	       int t [] = new int[num];
	       int k =0;
	       for(int i =0;i< num;i++){
	           t[k++] = a[i];
	       }
	       for(int j=num; j< a.length; j++){
	          a[j-num] = a[j];
	       }
	       k=0; // start from 0th in temp array
	       for( int i = a.length-1 -num+1; i< a.length; i++){
	           a[i] = t[k];
	           k++;
	       }
	       
	       Arrays.stream(a).forEach(x -> System.out.print(x+" "));
		}
}
