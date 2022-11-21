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
//		The time complexity of these two method is O(n²).

		/*boolean swaped = false;
		int swapping = 0;
		int cout = 0;
		for (int turn = 0; turn < n - 1; turn++) {
			for (int j = 0; j < n - 1 - turn; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swaped = true;
					swapping++;
				}
				cout++;
			}
			System.out.println("count of How many times loop iterates = " + cout);
			System.out.println("Count of how many times number is swapped = " + swapping);
			if (swaped == false) {
				break;
			}
		}*/

		//Most ideal and best code :)
		boolean swaped = false;
		for (int turn = 0; turn < n - 1; turn++) {
			for (int j = 0; j < n - 1 - turn; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swaped = true;
				}
			}
			if (swaped == false) {
				break;
			}
		}
//		The time complexity of this method is O(n).
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, 2, 3, 4, 5};

		bubbleSort(array);
		printArray(array);
	}


}
