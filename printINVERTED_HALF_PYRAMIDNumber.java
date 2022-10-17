import java.util.*;

public class printINVERTED_HALF_PYRAMIDNumber {

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Total Number of Line: ");
		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) { //outerloop:i = 0; i <= number, innerloop:j = 1; j <= (number - i)
			for (int j = 1; j <= (number - i) + 1; j++) { //also try, (j=i;j<=number)
				System.out.print(j);
			}
			System.out.println();
		}
	}
}