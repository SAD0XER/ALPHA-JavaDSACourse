import java.util.*;

public class printCHARACTERpattern {
	public static void main(String[] sadoxer) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Total Number of Line: ");
		int num = scan.nextInt();
		char ch = 'A';
		//outer loop
		for (int line=1; line<=num; line++) {

			//inner loop
			for (int chars=1; chars<=line; chars++) {
				System.out.print(ch + "\t");
				ch++;
			}
			System.out.println();
		}

	}
}