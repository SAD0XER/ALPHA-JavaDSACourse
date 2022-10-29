/* Problem: You are given an array named price,
swhere prices[i] is the price of a given stock on the ith day.
* You want to maximize your profit by choosing a single day to buy one stock and
* choosing a different day in the future to sell that stock.
* Return the maximum profit you can achieve from this transaction.
* If you cannot achiece any profit, return 0.*/

public class BuyAndSellStocks {
	public static int buyAndSellStocks(int[] price) {
		int buyPrice = Integer.MAX_VALUE, maxProfit = 0;

		for (int i = 0; i < price.length; i++) {
			if (buyPrice < price[i]) {
				int profit = price[i] - buyPrice; //Todays profit
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyPrice = price[i];
			}
		}
		return maxProfit;
	}

	public static void main(String[] sadoxer) {
		int[] price = {7, 1, 8, 3, 6, 4};

		System.out.println("My all time Maximum profit is " + buyAndSellStocks(price));
	}
}
