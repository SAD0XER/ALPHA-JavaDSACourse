import java.util.*;

public class NumberIsPrimeOrNot {

	//function for checking the given number is prime or not.
	public static boolean isPrime(int n) {
// your number must be <=2
		if (n == 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				/* for (int i=2; i<=n-1; i++) This is for large numbers,
				but it is algorithmically right. */
				if (n % i == 0) { //if it is completely dividing.
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		/*boolean isPrime = true;
		System.out.print("Enter Your Number: ");
		int n = scan.nextInt();

		if (n == 2) {
			System.out.println(n + " is the Prime Number.");
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				//for (int i=2; i<n-1; i++) This is for small numbers, but it is a very time and space consuming.
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (!isPrime) {
				System.out.println("Number is Not a prime.");
			} else {
				System.out.println("Number is Prime.");
			}
		}*/

		System.out.println(isPrime(2));
	}
}