package com.app.ques;
/*
Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural numbers.

Note:- Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + �� + (1+3+5+7+�+(2n-1))

Input:
2
2
5

Output:
5
55
Explanation:
Testcase 1:
			(1) + (1+3) = 5
Testcase 2: (1) + (1+3) + (1+3+5) + (1+3+5+7) + (1+3+5+7+9) = 55
 
 */

import java.util.Scanner;

public class OddSeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_of_cases = sc.nextInt();
		for (int k = 0; k < no_of_cases; k++) {
			
			int no_of_odd = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < no_of_odd; i++) {
				
				for (int j = 0; j <= i; j++) {
					
					sum += (2 * j) + 1;
				}
			}

			System.out.println(sum);
		}

	}

}
