//This is the Practice Problem (homework)
public class MaxMinSumOfSubArray {

	public static void sumOfSubArray(int[] array) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + array[k];
					System.out.print(array[k] + " ");
				}
				System.out.println("= " + sum);
				if (max < sum) max = sum;
				else if (min > sum) min = sum;
			}
			System.out.println();
		}
		System.out.println("Max Sum = " + max);
		System.out.println("Min Sum = " + min);
	}

	public static void main(String[] sadoxer) {
		int[] array = {56, 34, 78, 5, 49, 4, 33, 6};

		sumOfSubArray(array);
	}
}