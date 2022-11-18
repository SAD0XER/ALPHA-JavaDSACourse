import java.math.*;

public class ArrayAssignment {

/* Question 1:
IO:[1, 2, 3, 1], OP:true //case 1
IO:[1, 2, 3, 4], OP:false //case 2
IO:[1, 1, 3, 3, 4, 3, 2, 4, 2], OP:true //case 3 */

	public static boolean atLeastTwice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}

/* Question 3:
 * IO:[7, 1, 5, 3, 6, 4], OP: 5 //case 1
 * IO:[7, 6, 4, 3, 1], OP: 0 //case2 */

	public static int maxProfitByTradingStocks(int[] array) {
		int buyingPrice = Integer.MAX_VALUE; // comparing
		int maxProfit = 0; // storing max profit

		for (int i = 0; i < array.length; i++) {
			if (buyingPrice < array[i]) {
				int profit = array[i] - buyingPrice;
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyingPrice = array[i];
			}
		}
		return maxProfit;
	}

	public static void main(String[] sadoxer) {
//		int[] array = {1, 1, 3, 3, 4, 3, 2, 4, 2};
//		System.out.println(atLeastTwice(array));

		int[] array = {7, 6, 4, 3, 1};
		System.out.println(maxProfitByTradingStocks(array));
	}
}
