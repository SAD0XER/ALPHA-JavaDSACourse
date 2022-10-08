import java.util.*;

public class FactorialOfNumber {

	public static int isFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int number = scan.nextInt();

		System.out.println(isFactorial(number));
	}
}