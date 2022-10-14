public class LinearSearch {

	//Linear Search
	public static int linearSearch(String[] array, String key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] sadoxer) {
//		int[] array = {1, 34, 54, 66, 77, 88, 99};
//		int key = 8;

//		Practice with String datatype
		String[] software = {"dotNate", "vscode", "csgo", "IntelliJIdea", "git", "grammerly"};
		String key = "git";

//		linearSearch(array, key); //function call
		linearSearch(software, key); //function call


//		int index = linearSearch(array, key);
		int index = linearSearch(software, key);

		if (index == -1) {
			System.out.println("KEY not found.");
		} else {
			System.out.println("Key found at the index: " + index);
		}
	}
}