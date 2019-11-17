package com.app.gfg;

public class CountSort {

	public static void main(String[] args) {
		String s = "AVajay88";
		countSort(s.toCharArray());
	}
	
	 public static void countSort(char seq[])
	    {
	        // add your code here    
	        int count []= new int[256];
	        for(int i=0;i<count.length; i++){
	            count[i] =0; // initialize array with default value
	        }
	        //updating count based on seq 
	        for(int i=0;i< seq.length;i++ ){
	            count[seq[i]]=  count[seq[i]] +1;
	        }
//	        printArray(count);
	        //add prev value with current value
	        for(int i=1;i< count.length;i++) {
	        	count[i] = count[i-1] + count[i];
	        }
//	        printArray(count);
	        
	        //create an array io size seq
	        char [] sort = new char[seq.length];
	        // place seq data at position assigned in count array and decrease count array 
	        // value by 1
	        
	        for(int i=0;i< seq.length;i++){
	            int v = count[seq[i]];
	            sort[v-1] = seq[i];
	            count[seq[i]] = v-1;
	        }
	        printCharArray(sort);
	    }
	 public static void printCharArray(char []a) {
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	 }
	 public static void printArray(int a[]) {
		 for(int i=0;i< a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	 }
}
