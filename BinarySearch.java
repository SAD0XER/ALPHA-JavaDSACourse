public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int start = 0, end = arr.length - 1; // delete "- 1" and go to loop

		while (start <= end) { // delete "=" and execute progeram
			int mid = (start + end) / 2;

			//compare
			if (arr[mid] == key) {
				return mid;
			} else {
				if (arr[mid] < key) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] sadoxer) {
		int[] arr = {12, 343, 545, 65, 3, 23, 23, 5};
		int key = 3;

		int index = binarySearch(arr, key);

		if (index == -1) {
			System.out.println("KEY not found.");
		} else {
			System.out.println("Key found at the index: " + index);
		}
	}
}
