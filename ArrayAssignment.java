public class ArrayAssignment {

/* Question 1:
IO:[1, 2, 3, 1], OP:true //case 1
IO:[1, 2, 3, 4], OP:false //case 2
IO:[1, 1, 3, 3, 4, 3, 2, 4, 2], OP:true //case 3*/

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

/**/


	public static void main(String[] sadoxer) {
		int[] array = {1, 1, 3, 3, 4, 3, 2, 4, 2};

//		System.out.println(atLeastTwice(array));
	}
}
