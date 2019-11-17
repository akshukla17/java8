package com.app.gfg;
/*
 * https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum/0
 * 
 */

import java.util.HashMap;
import java.util.Scanner;

public class CountPairOfGivenSum {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k=sc.nextInt();
			int arr[] = new int[n];
			//int largest=0;
			HashMap<Integer,Integer> hash=new HashMap<>();
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				if(hash.containsKey(arr[i])) {
					hash.put(arr[i], hash.get(arr[i])+1);
				}else {
					hash.put(arr[i], 1);
				}
			}
			System.out.println("hash : "+ hash);
			int result=0;

			for(int i=0;i<n;i++) {
				if(hash.get(k-arr[i])!=null) {
					result+=hash.get(k-arr[i]);
				}
				if(k-arr[i]==arr[i]) {
					result--;
				}
			}
			
			
			System.out.println(result/2);
		t--;
		}
		sc.close();
	}
}
