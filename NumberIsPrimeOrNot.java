import java.util.*;

public class NumberIsPrimeOrNot {
	public static void main(String[] sadoxer) {

		Scanner scan = new Scanner(System.in);

		boolean isPrime = true;
		int n = scan.nextInt();

		if (n == 2) {
			System.out.println(n + " is the Prime Number.");
		} else {
			for (int i=2; i<Math.sqrt(n); i++) {
				if (n % i == 0) isPrime = false;
			}

		if (isPrime == false) {
			System.out.println("Number is Not a prime.");
		} else {
			System.out.println("Number is Prime.");
		}
		}
	}
}