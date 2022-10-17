import java.util.*;

public class printINVERTED_ROTATED_HALF_PYRAMIDpattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the total number of line: ");
		int number = scan.nextInt();

		//outer loop
		for (int i = 1; i <= number; i++) {

			//print space
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}

			//print star
			for (int k = 1; k <= i; k++) { //apply this condition: (k = i; k <= number && i) and see how its works.
				System.out.print("*");
			}
			System.out.println(); //print next line
		}
	}
}