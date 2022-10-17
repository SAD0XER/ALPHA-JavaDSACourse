public class ReverseOfArray {

	public static void reverseArray(int[] array) {
		int first = 0, last = array.length - 1;

		while (first < last) {

			// using temporary variable
			int temp = array[last];

			array[last] = array[first];
			array[first] = temp;
			first++; //first = first + 1;
			last--; //last = last - 1;
		}
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, 2, 3, 4, 5};

		reverseArray(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}