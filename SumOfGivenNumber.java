import java.sql.SQLOutput;
import java.util.*;

public class SumOfGivenNumber {

	/*Question 5 :
Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )*/
	public static int SumOfDigit(int num){
		int sum = 0;

		for(int i = num; i >= 0; i--){
			int ld = num % 10;
			sum += ld;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = obj.nextInt();


		System.out.println(SumOfDigit(num));

	}

}
