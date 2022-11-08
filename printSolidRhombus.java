import java.util.*;

public class printSolidRhombus {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= (line-i); j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= line; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
