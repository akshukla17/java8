package com.app.interview;

import java.util.*;
/*
	For given two array 
	1. string array contains push & pop.
	2. int array contains element which add remove based on the first array value.
	
	OUTPUT:
	expected product of min*max value of the array. 
*/
public class MaxProduct{
	public static void main(String []args){
		String [] s={"push","push","push","pop","push","pop","pop"};
		int[] a={1,2,3,1,4,2,3};
		int []p=new int[a.length];
		List<Integer> ls=new ArrayList<>();
		int i=0;
		int j=0;
		int min=a[0];
		int max=a[0];
		for(String word:s){
			if(word.equals("push")){
				ls.add(a[i]);		
			}else{
				ls.remove(new Integer(a[i]));
			}
			Collections.sort(ls);
			System.out.println("****** "+ls);
			min=(int)ls.get(0);
			max=(int)ls.get(ls.size()-1);
			p[j++]=min*max;
			i++;
		}
			System.out.print("Print result array ");
		for(int k=0;k<p.length;k++){
			System.out.print(p[k]+" ");
		}
	}
	
}