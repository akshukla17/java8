package com.app.array;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,6};
		int len =6;
		System.out.println(findOneMissing(a,len));
		printMissingNumber(a, len);
		int bb []= {1,2,4,5,6};
		System.out.println(" Find missing number using XoR >> " + getMissingNo(bb,5) );
		
		int b[] = {1,1,2,3,3,5};
		printDuplicate(b);
	}
	private static void printDuplicate(int a[]) {
		BitSet b= new BitSet(a.length);
		for(int n: a) {
			b.set(n-1);
		}
		System.out.println("*****************");
		System.out.println(b);
		System.out.println("*****************");
	}
	
	// it will applicable for only one missing
	private static int findOneMissing(int a[], int len) {
		int expectedSum = len*(len+1)/2;
		int givenSum =Arrays.stream(a).reduce(0, (x,y) -> x+y);
		return expectedSum - givenSum;
	}
	//
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
//		bitSet.set(2, false);
		System.out.println(bitSet);
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	
	 //{1,2,4,5,6}
	
	static int getMissingNo(int a[], int n) 
    { 
        int x1 = a[0]; 
        int x2 = 1; 
  
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < n; i++) 
            x1 = x1 ^ a[i]; 
  
        /* For xor of all the elements  
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++) 
            x2 = x2 ^ i; 
  
        return (x1 ^ x2); 
    } 

//	Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz61iq5WQF6
}
