public class ArrayAssignment {
	
/* Question 1: Given an integer array,
return true if any value appears at least twice in the array,
and return false if every element is distinct.
IO:[1, 2, 3, 1], OP:true //case 1
IO:[1, 2, 3, 4], OP:false //case 2*/

	public static boolean atLeastTwice(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] sadoxer) {
		int[] array = {1, 2, 3, 4};

		System.out.println(atLeastTwice(array));
	}
}
