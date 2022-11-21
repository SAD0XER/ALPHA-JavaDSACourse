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
	 * IO:[7, 6, 4, 3, 1], OP: 0 //case 2 */

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

	/* Question 4:
	 * IO:[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1], OP: 6 //case 1
	 * IO:[4, 2, 0, 3, 2, 5], OP: 9 //case 2 */

	public static int trappedRainWater(int[] array) {
		int l = array.length;
		int[] leftMax = new int[l];
		int[] rightMax = new int[l];

		//left max array
		leftMax[0] = array[0];
		for (int i = 1; i < l; i++) {
			leftMax[i] = Math.max(array[i], leftMax[i - 1]);
		}

		//right max array
		rightMax[l - 1] = array[l - 1];
		for (int i = l - 2; i >= 0; i--) {
			rightMax[i] = Math.max(array[i], rightMax[i + 1]);
		}

		int trappedWater = 0;
		for (int i = 0; i < l; i++) {
			int waterLevel = Math.min(leftMax[i], rightMax[i]); //calculate water level
			trappedWater += waterLevel - array[i]; //calculate trapped water
		}
		return trappedWater;

		/*//New Very optimized solution on this problem.
		int l = array.length;

		int trappedWater = 0, left = 0, right = l - 1;
		int[] rMax = new int[right], lMax = new int[left];

		while (left < right) {
			if (lMax < rMax) {
				left++;
				lMax = Math.max(lMax, array[left]);
				trappedWater += lMax - array[left];
			} else {
				right--;
				rMax = Math.max(rMax, array[right]);
				trappedWater += rMax - array[right];
			}
		}
		return trappedWater;*/
	}


	public static void main(String[] sadoxer) {
//		int[] array = {1, 1, 3, 3, 4, 3, 2, 4, 2};
//		System.out.println(atLeastTwice(array));

//		int[] array = {7, 6, 4, 3, 1};
//		System.out.println(maxProfitByTradingStocks(array));

//		int[] array = {4, 2, 0, 3, 2, 5};
//		System.out.println(trappedRainWater(array));
	}
}
