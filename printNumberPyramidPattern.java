import java.util.Scanner;

public class printNumberPyramidPattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			//Spaces
			for (int j = 1; j <= (line - i); j++) {
				System.out.print(" "); //use \t instead of blank space & RUN the code
			}
			//Numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " "); //use \t instead of blank space & RUN the code
			}
			System.out.println();
		}
	}
}