import java.util.*;

public class BinaryToDecimal {

	//BinaryToDecimal fuction definition.
	public static void BiToDec(int biNum) {
		int Binum = biNum;
		int dec = 0;
		int Pow = 0;

		while (biNum > 0) {
			int ld = biNum % 10;
			dec += (ld * (int) Math.pow(2, Pow));
			Pow++;
			biNum /= 10;
		}

		System.out.print("Decimal of " + Binum + " is " + dec);
	}

	public static void main(String[] paracoder) {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===CONVERT BINARY TO DECIMAL===");
		System.out.print("Enter Binary Number: ");

		int Bi = scan.nextInt();

		BiToDec(Bi); //function call.
	}
}