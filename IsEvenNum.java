import java.util.*;

public class IsEvenNum {

	/* Question 2 : Write a method named isEven that accepts an int argument.
	The method should return true if the argument is even, or false otherwise.
	Also write a program to test your method. */
	public static boolean IsEven(int num) {
		boolean flag = num % 2 == 0;
		return flag;
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your Number: ");
		int num = scan.nextInt();

		System.out.println(IsEven(num));
	}
}
