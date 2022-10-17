public class PairsInArray {

	public static void printPairs(int[] array) {
		int tp = 0;
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			for (int j = i + 1; j < array.length; j++) {
				System.out.print("(" + current + "," + array[j] + ") ");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs: " + tp);
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printPairs(array);
	}
}