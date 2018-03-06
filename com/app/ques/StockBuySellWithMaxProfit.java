package com.app.ques;


//Stock Buy Sell to Maximize Profit
/**
 * 
 * The cost of a stock on each day is given in an array,
 *  find the max profit that you can make by buying and selling in those days. 
 * For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
 *  the maximum profit can earned by buying on day 0, selling on day 3. 
 * Again buy on day 4 and sell on day 6. 
 * If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
 *
 */
public class StockBuySellWithMaxProfit {
	public static void main(String[] args) {
		int [] stock={100, 180, 260, 310, 32, 31,535, 550};
		int min=0;
		int max=0;
		for(int i=0;i<stock.length;i++) {
			if(max==0) {
				min=stock[i];
				max=stock[i];
			}
			if((i+1)<stock.length && stock[i]>stock[i+1] ) {
				max=stock[i];
				System.out.println(" Buy at "+min +" and sell at "+max);
				min=0;
				max=0;
			}
			if((i+1)==stock.length) {
				System.out.println(" Buy at "+min +" and sell at "+stock[i]);
			}
		}
	}

}
