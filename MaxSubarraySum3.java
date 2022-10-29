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
		int[] array = {-2, -3, 4, -1, -2, 5, 3};
		/*PS: here, if all the numbers of array is < 0, then the output will be 0.
		* so, for enhanced solution check file "MaxSubarraySun.java" file.
		* If you give all the numbers are 0, then the that program will give the maximum negative number from it.*/

		MaxSumSubArray(array);
	}
}
