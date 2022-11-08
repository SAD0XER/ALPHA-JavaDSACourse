import java.util.*;

public class printButterflyPattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= (line-i)*2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= (line-i)*2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}