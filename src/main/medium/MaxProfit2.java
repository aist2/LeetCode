package medium;

public class MaxProfit2 {
	public static int maxProfit(int[] prices) {
    	int profit = 0;
    	int i=0;
    	while (i<prices.length) {
    		//find local mininum
    		while (i<prices.length-1 && prices[i+1] <= prices[i])
    			i++;
    		//find local maximum
    		int localMin = i;
    		i++;
    		while (i<prices.length-1 && prices[i+1]>=prices[i])
    			i++;
    		int localMax = i;
    		//update profit
    		if (localMax < prices.length && prices[localMin] < prices[localMax])
    			profit += prices[localMax] - prices[localMin];
    	}
    	return profit;
	}
}
