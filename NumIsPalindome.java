import java.util.*;

public class NumIsPalindome {

	/* Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not) */
	public static void IsPalindrome(int num) {
		int rev = 0;
		int ld = 0;
		int rmld = 0;

		while (num > 0) {
			ld = num % 10;
			rev = (rev * 10) + ld;
			num = num / 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = scan.nextInt();

		IsPalindrome(num); // function call.
//		System.out.println(IsPalindrome(num));
	}
}
