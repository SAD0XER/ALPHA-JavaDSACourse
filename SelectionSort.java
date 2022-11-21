public class SelectionSort {

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n-1; i++) {
			int minPosition = i;
			for (int j = i+1; j < n; j++) {
				if (array[minPosition] > array[j]) { //Change '>' to '<' for Sorted Reverse Array.
					minPosition = j;
				}
			}
			int temp = array[minPosition];
			array[minPosition] = array[i];
			array[i] = temp;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] sadoxer) {
		int[] array = {5, 4, 1, 3, 2};

		selectionSort(array);
		printArray(array);
	}
}
