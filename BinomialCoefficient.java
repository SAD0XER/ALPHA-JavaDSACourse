import java.util.*;

public class BinomialCoefficient {

	public static int isFactorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void binomialCoe(int n, int r){
		int factOfn = isFactorial(n);
		int factOfr = isFactorial(r);

		int ncr = factOfn / (factOfr * isFactorial(n - r));
		System.out.println("Binomial Coefficient: nCr = " + ncr);
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Find Binomial Coefficient nCr:\nn = ");
		int n = scan.nextInt();
		System.out.print("r = ");
		int r = scan.nextInt();

		binomialCoe(n, r); //function call

	}
}