public class MaxStockProfitWithTransctionFee{
	public static void main(String[]args){
		int[] a={31,4,5,9,12,4,2,5,4,1,12,14};
		int fee=2;
		System.out.println("Max profit will be : "+maxProfit(a,fee));
	}
	private static int maxProfit(int []a,int fee){
		int profit=0;
		int buy=-a[0];
		int tmpBuy=0;
		int sell=0;
		
		for(int i=0;i<a.length;i++){
			tmpBuy=buy;
			profit=Math.max(profit,a[i]);
			sell=math.max(sell,tmpBuy+a[i]-fee);
		}
		
		return profit;
	}

}