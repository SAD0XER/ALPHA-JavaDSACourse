public class printSubArrays {

	public static void printSubArray(int[] array) {
		int ts = 0;
		for (int i = 0; i < array.length; i++) {
			int start = i;
			for (int j = i; j < array.length; j++) {
				int end = j;
				for (int k = start; k <= end; k++) {
					System.out.print(array[k] + " ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray: " + ts);
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printSubArray(array);
	}
}
