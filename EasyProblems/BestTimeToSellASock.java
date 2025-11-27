public class BestTimeToSellASock {

     public int maxProfit(int[] prices) {
       if (prices == null || prices.length < 2) return 0;

    int smallest = prices[0];
    int largest = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < smallest) {
            smallest = prices[i]; // update the lowest buying price
        } else {
            maxProfit = Math.max(maxProfit, prices[i] - smallest); // potential profit
        }
    }

    return maxProfit;
    }
}
