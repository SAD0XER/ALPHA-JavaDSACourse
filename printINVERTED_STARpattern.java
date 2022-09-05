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
				/* if your star count arts from 0 the you need to write condition like
				 * for (int star=1; star<=(NumOfLine - Line)) {}*/
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}