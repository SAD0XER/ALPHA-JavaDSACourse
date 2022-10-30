import java.util.*;

public class ZeroOneTriangle {

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Line: ");
		int line = scan.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j) % 2 == 0) System.out.print("1\t");
				else System.out.print("0\t");
			}
			System.out.println();
		}
	}
}
