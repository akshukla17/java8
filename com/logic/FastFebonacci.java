package com.logic;

import java.util.Scanner;

public class FastFebonacci {

	public static void main(String[] args) {

		System.out.println("Enter the number upto which febonacci number should print");
		int number=new Scanner(System.in).nextInt();
		for(int i=0;i<number;i++) {
			System.out.println(febinacciRecursion(number));
		}
	}

	private static int febinacciRecursion(int number) {
		if(number==1 || number==2) {
			return 1;
		}
		return (febinacciRecursion(number-1)+febinacciRecursion(number-2));
		
	}

}
