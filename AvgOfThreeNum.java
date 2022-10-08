import java.util.*;

public class AvgOfThreeNum {

	/* Question 1 : Write a Java method to compute the average of three numbers.*/
	public static float AvgOfThree(float n1, float n2, float n3) {
		float avg = (n1 + n2 + n3) / 3;
		return avg;
	}

	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		float n1 = scan.nextFloat();
		System.out.print("Enter Number 2: ");
		float n2 = scan.nextFloat();
		System.out.print("Enter Number 3: ");
		float n3 = scan.nextFloat();

//		function call
		System.out.println("Average: " + AvgOfThree(n1, n2, n3));
	}
}
