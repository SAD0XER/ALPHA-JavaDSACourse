import java.util.*;

public class FindLargNSmallNUm {

	public static int largestNum(int[] array) {
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (largest < array[i]) largest = array[i];
		}
		return largest;
	}

	public static int smallestNum(int[] array) {
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) smallest = array[i];
		}
		return smallest;
	}

	public static void main(String[] args) {
		int[] array = {22, 3, 5, 6, 76};

		System.out.println("The Largest Number of array is " + largestNum(array));
		System.out.println("The Smallest Number of array is " + smallestNum(array));
	}
}
