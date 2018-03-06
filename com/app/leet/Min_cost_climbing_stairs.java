package com.app.leet;

import java.util.Scanner;

import com.logic.sort.Print;

/*
Once you pay the cost, you can either climb one or two steps.
 You need to find minimum cost to reach the top of the floor, 
 and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15 Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6 Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
*/
public class Min_cost_climbing_stairs {

	public static void main(String[] args) {
		int []a= {02,2,1}; 
		Print.printArray(a);
		System.out.println(minCost(a));
	}

	private static int minCost(int[] cost) {
		/*int min=0;
		for(int i=cost.length;i>=2;) {
			min+=Math.min(cost[i-1], cost[i-2]);
			i=cost[i-1]<cost[i-2]?i-1:i-2;
		}
		System.out.println(min);*/
		
		 int f1 = 0, f2 = 0;
	        for (int i = cost.length - 1; i >= 0; --i) {
	            int f0 = cost[i] + Math.min(f1, f2);
	            f2 = f1;
	            f1 = f0;
	            System.out.println("f2 "+f2+" f1 "+f1+" f0"+f0);
	        }
	        return Math.min(f1, f2);
	}

}
