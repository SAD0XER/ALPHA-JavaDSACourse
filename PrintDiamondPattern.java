import java.util.Scanner;

public class PrintDiamondPattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= (line-i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
