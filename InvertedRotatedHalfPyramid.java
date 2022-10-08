import java.util.*;

public class InvertedRotatedHalfPyramid {

	// function to print Inverted and Rotated Half Pyramid.
	public static void InvertedHalfPyramid(int totalRow) {

		// outer loop for printing ROWs.
		for (int line = 1; line <= totalRow; line++) {

			// inner loop 1: for printing spaces.
			for (int space = 0; space < totalRow - line; space++) {
				System.out.print(" "); //replace the ' '(white space) with \t.
			}

			// inner loop 1: for printing star.
			for (int star = 1; star <= line; star++) {
				System.out.print("*"); //add '\t' before the '*'.
			}
			System.out.println();
		}
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Total Number of Rows: ");
		int totalRow = scan.nextInt();

		//function call.
		InvertedHalfPyramid(totalRow);
	}
}