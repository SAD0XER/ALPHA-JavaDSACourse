import java.util.*;

public class printFLOYDSTriangle {

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Total Number of Line: ");
		int number = scan.nextInt();

		int Temp = 1;

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(Temp + " ");
				Temp++;
			}
			System.out.println();
		}
	}
}