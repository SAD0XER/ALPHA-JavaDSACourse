import java.util.Scanner; //impoting scanner class.
public class Basic {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		// Practice of Taking input from user in all format.
		int a = sc.nextInt();
		byte b = sc.nextByte();
		float c = sc.nextFloat();
		double d = sc.nextDouble();
		boolean e = sc.nextBoolean();
		long f = sc.nextLong();
		String g = sc.nextLine();
*/
		/* here, if you index 0, it means whatever you give input it'll choose character that lies on index 0.
		* example 1: in this case you give index as 0. & your Input is 'SARVESH' then it will return only 'S'.
		* example 2: Here you give index as 1. & your Input is 'SARVESH' then it will return 'A' and so on. */
//		char ch = sc.next().charAt(0);

//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
//		 System.out.println(d);
//		 System.out.println(e);
//		 System.out.println(f);
//		 System.out.println(e);
//		 System.out.println(ch);

	}
}