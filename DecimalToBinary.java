import java.util.*;

public class DecimalToBinary {

	//DecimalToBinary fuction definition.
	public static void DecToBi (int decNum) {
		int Decnum = decNum;
		int bin = 0;
		int Pow = 0;

		while (decNum > 0) {
			int rem = decNum % 2;
			bin += rem * (int)Math.pow(10, Pow));
			Pow++;(
			decNum /= 10;
		}
		System.out.println("Decimal Number " + Decnum + " in Binary is " + bin);
	}

	public static void main(String[] paracoder) {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===CONVERT DECIMAL TO BINARY===");
		System.out.print("Enter Decimal Number: ");
		int Decimal = scan.nextInt();

		DecToBi(Decimal); //function call.
	}
}