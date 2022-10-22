//Max Sum of Subarray-1 (Brute Force): Time Complexity O(n³)
public class MaxSubarraySum1 {

	public static void MaxSumSubArray(int[] array) {
		int max = Integer.MIN_VALUE, currentSum = 0;

		//starting point of array.
		for (int i = 0; i < array.length; i++) {

			//ending point of array.
			for (int j = i; j < array.length; j++) {
				currentSum = 0;

				//sub array
				for (int k = i; k <= j; k++) {
					currentSum = currentSum + array[k];
					System.out.print(array[k] + "  ");
				}
				System.out.print(" = " + currentSum);
				if (max < currentSum) max = currentSum; //comparison
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("max sum  = " + max);
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, -2, 6, -1, 3};

		MaxSumSubArray(array);
	}
}
