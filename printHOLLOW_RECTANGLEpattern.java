import java.util.*;

public class printHOLLOW_RECTANGLEpattern {

	public static void hollowRectangle(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if ((i == 1 || j == 1 || i == num || j == num)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();

		hollowRectangle(num);
	}
}