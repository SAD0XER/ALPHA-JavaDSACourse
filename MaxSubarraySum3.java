//Max Sum of Subarray-3 (Kadane's Algorithm): Time Complexity O(n)
public class MaxSubarraySum3 {

	public static void MaxSumSubArray(int[] array) {
		int max = Integer.MIN_VALUE, currSum = 0;

		//starting point of array.
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];

			if (currSum < 0) currSum = 0;
			max = Math.max(currSum, max);
		}
		System.out.println("Max Sum = " + max);
	}

	public static void main(String[] sadoxer) {
		int[] array = {-2, -3, -4, -1, -2, -1, -5, -3};

		MaxSumSubArray(array);
	}
}
