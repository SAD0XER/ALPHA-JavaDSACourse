/*Problem: what if tn the given array is completely negative numbers of array?
 * then write a code for that. check whether the given array is negative or not,
 * and if it is negative then return the biggest negative number.
 * The answer must be -1.
 *
 * PS: This is enhanced problem from "MaxSubarraySum3.java" file.*/
public class EnhancedMaxSubarraySum3 {

	public static void MaxSumSubArray(int[] array) {
		int max = Integer.MIN_VALUE, currSum = 0;
		boolean flag = false;

		for (int i : array) {
			if (i > 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			for (int i : array) {
				currSum += i;
				max = Math.max(currSum, max);
			}
			System.out.println("Max Sum = " + max);
		} else {
			//starting point of array.
			for (int i : array) {
				currSum = currSum + i;

				if (currSum < 0) currSum = 0;
				max = Math.max(currSum, max);
			}
			System.out.println("Max Sum = " + max);
		}
	}

	public static void main(String[] sadoxer) {
		int[] array = {-2, -3, -4};

		MaxSumSubArray(array);
	}
}
