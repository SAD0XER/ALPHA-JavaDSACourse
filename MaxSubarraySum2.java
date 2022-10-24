//Max Sum of Subarray-2 (Prefix Sum): Time Complexity O(n²)
public class MaxSubarraySum2 {

	public static void MaxSumSubArray(int[] array) {
		int max = Integer.MIN_VALUE, prevSum = 0;
		int[] prefixSum = new int[array.length];

		//calculate prefix array.
		prefixSum[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			prefixSum[i] = prefixSum[i-1] + array[i];
		}

		//starting point of array.
		for (int i = 0; i < array.length; i++) {
			int start = i;
			//ending point of array.
			for (int j = i; j < array.length; j++) {
				prevSum = 0;
				int end = j;
				prevSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

				if (max < prevSum) max = prevSum; //comparison
			}
		}
		System.out.println("max sum  = " + max);
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, -2, 6, -1, 3};

		MaxSumSubArray(array);
	}
}