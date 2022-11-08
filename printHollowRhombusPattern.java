import java.util.Scanner;

public class printHollowRhombusPattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= (line-i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= line; j++) {
				if (i==1 || i==line || j==1 || j==line) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
