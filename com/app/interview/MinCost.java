package com.app.leet;

import com.app.sort.Print;

public class MinCost {

	public static void main(String[] args) {
		int a[] = {0,0,0,0};
		Print.printArray(a);
		minCostClimbingStairs(a);
		System.out.println("dsgfsdfg"+Math.min(0, 0));

	}

	public static void minCostClimbingStairs(int[] cost) {
		int first = 0;
		int second = 0;
		int n = cost.length;

		for (int i = 0; i < n;) {
			first += cost[i];
			if ((i + 2) < n) {
				int next = Math.min(cost[i + 1], cost[i + 2]);
				if (next == cost[i + 1])
					i++;
				else
					i += 2;
				continue;
			} else {
				i++;
			}
		}

		for (int i = 1; i < n;) {
			second += cost[i];

			if ((i + 2) < n) {
				int next = Math.min(cost[i + 1], cost[i + 2]);
				i=(next == cost[i + 1])?(i+=1):(i+=2);
				continue;
			} else {
				i++;
			}
		}
		System.out.println(" first " + first);
		System.out.println(" second " + second);
		
		System.out.println("Miminum cost would be :"+Math.min(first, second));
	}
}
