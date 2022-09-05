import java.util.*;

public class printSTARpattern {
	public static void main(String[] ParaCoder) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter line number: ");
		int lNum = scan.nextInt();

		//Outer Loop
		for (int line=1; line<=lNum; line++) {
			//Inner Loop
			for (int star = 1; star<=line; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}