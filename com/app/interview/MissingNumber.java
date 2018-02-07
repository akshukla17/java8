package com.app.ques;

import java.util.Arrays;

/**
 * 
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in list. One of the integers is missing in the list.
 *  Write an efficient code to find the missing integer.
 *
 */
public class MissingNumber {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int l=sc.nextInt();*/
		
		int [] a= {1,2,3,5,6,4,7};
		 Arrays.stream(a)
		 		.forEach(x ->System.out.println(x+ ","));
		
		int length=a.length+1;
		int sum =length*(length+1)/2;
		int ls=Arrays.stream(a).sum();
		System.out.println( "sum :"+sum+ " given array sum : "+ls);
		System.out.println("missing number : "+(sum -ls));
	//	sc.close();
		
	}

}
