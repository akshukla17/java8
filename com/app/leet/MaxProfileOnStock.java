package com.app.leet;

public class MaxProfileOnStock {

	public static void main(String[] args) {

		int []prices= {6,5,4,3,6};//{1,3,2,8,4,9};
		
		System.out.println("max profit is "+maxProfit(prices,2));
	}

	public static int maxProfit(int[] prices, int fee) {
		 if (prices == null || prices.length == 0) {
	            return 0;
	        }
	        int len = prices.length;
	        int buy = -prices[0], sell = 0;
	        for (int i = 1; i < len; i++) {
	            int tmpbuy = buy;
	            
	            buy = Math.max(buy, sell - prices[i]);
	            sell = Math.max(sell, tmpbuy + prices[i] - fee);
	            System.out.println("price: "+prices[i]);
	            System.out.println("temp buy: "+tmpbuy+" buy: "+buy+" sell: "+sell);
	            
	        }
	        return Math.max(buy, sell);
    }
}
