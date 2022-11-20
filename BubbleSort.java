public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int n = array.length; // n is a length of array.

		// 0th index based
		/*for (int turn = 0; turn < n - 1; turn++) {
			for (int j = 0; j < n - 1 - turn; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}*/

		// 1th index based
		/*for (int turn = 1; turn <= n - 1; turn++) {
			for (int j = 0; j <= n - 1 - turn; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}*/
	/* The time complexity of these two method is O(n²)
	* so, Write the optimized solution and the time complexity is must be O(n).*/
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] sadoxer) {
		int[] array = {5, 3, 1, 2, 4};

		bubbleSort(array);
		printArray(array);
	}


}
