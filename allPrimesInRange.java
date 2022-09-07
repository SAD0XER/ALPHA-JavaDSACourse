import java.util.*;

public class allPrimesInRange {

	// this function checks your number is prime or not.
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

	// this function prints till the given range.
	public static void primeInRange(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	/* Main Function */
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int n = scan.nextInt();
		primeInRange(n); //function call
	}

}