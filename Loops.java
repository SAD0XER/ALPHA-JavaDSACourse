import java.util.*;

public class Loops {
	public static void main(String sarvesh[]) {
		Scanner sc = new Scanner(System.in);

/* Question 2 : Write a program that reads a set of integers,
and then prints the sum of the even and odd integers. */
	/*	int evensum = 0, oddsum = 0;

		System.out.println("NOTE: If you want to Stop Entering Number then press 00.\n\n");

		while(true) {
			System.out.print ("Enter the Number: ");
			int number = sc.nextInt();

			if (number%2==0){
				evensum+=number;
			}
			else {
				oddsum+=number;
			}

			if (number == 00){
				break;
			}
		}
		System.out.println("Sum of Even Number is = " + evensum);
		System.out.println("Sum of Odd Number is = " + oddsum); */

/* Question 3 : Write a program to find the factorial of any number entered by the user.

(Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
only. We write factorial as n!
So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.

Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same) */
	/*	int factorial = 1;

		System.out.print("Enter the Number: ");
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("Factorial of 0 is 1.");
		}
		else if (number == 1) {
			System.out.println("Factorial of 1 is 1.");
		}
		else {
			for (int i = 1; i<=number; i++) {
				factorial *= i;
			}
			System.out.println("factorial = " + factorial);
		}*/

/* Question 4 : Write a program to print the multiplication table of a number N, entered by the user. */
	/*	System.out.print ("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 1; i<=10; i++) {
			int table = num * i;
			System.out.println(num+ " * " +i+ " = " + table);
		}*/
	}
}