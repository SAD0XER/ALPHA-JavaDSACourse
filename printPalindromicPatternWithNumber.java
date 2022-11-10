import java.util.Scanner;

public class printPalindromicPatternWithNumber {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			//space
			for (int j = 1; j <= (line-i); j++) {
				System.out.print(" ");
			}

			//number p1
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			//number p2
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
