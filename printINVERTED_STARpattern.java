import java.util.*;

public class printINVERTED_STARpattern {
	public static void main(String[] ParaCoder) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total line number: ");
		int lNum = scan.nextInt();

		//Outer Loop
		for (int line=1; line<=lNum; line++) {
			//Inner Loop
			for (int star = 1; star<=(lNum-line+1); star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}