import java.util.*;

public class Strings {

    //Question 1:
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Question 2:
    public static float getDisplacement(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.ceil(Math.sqrt(X2 + Y2));
    }

    public static void main(String[] para_coder) {
        Scanner scan = new Scanner(System.in);

        //String declartion.b
//        String str = "sarvesh";
//        System.out.println("str = " + str);
//        String str2 = new String("sarvesh is the strongest person.");
//        System.out.println("str2 = " + str2);

        //next() Function.
//        String fname = scan.next();
//        System.out.print(fname);

        //nextLine() Function.
//        String lname = scan.nextLine();
//        System.out.println(lname);

        //String Length() Function.
//        String stri = "I CAN AND I WILL";
//        System.out.println("Lenght: " + stri.length());

        //String Concatination.
//        String fullName = "_" + "SARVESH" + "_";
//        System.out.println("fullName = " + fullName);

        //Question 1: Given string is palindrome or not.
//        String str = scan.next();
//        System.out.println(isPalindrome(str));

        //Question 2: Find shortest path (displacement).
//        String path = "WNEENESENN";
//        System.out.println(getDisplacement(path));
    }
}
