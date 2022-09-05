import java.util.*;

public class printHALF_PYRAMIDpattern {
	public static void main(String[] ParaCoder) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total line number: ");
		int Num = scan.nextInt();

		//Outer Loop
		for (int line=1; line<=Num; line++) {

			//Inner Loop
			for (int number = 1; number<=line; number++) {
				System.out.print(number + "\t");
			}
			System.out.println();
		}
	}
}