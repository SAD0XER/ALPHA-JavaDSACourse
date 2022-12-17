import java.util.*;

public class Strings {

    //Question 1:
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] para_coder) {
        Scanner scan = new Scanner(System.in);
//        String str = "sarvesh";
//        System.out.println("str = " + str);
//        String str2 = new String("sarvesh is the best and strongest person.");
//        System.out.println("str2 = " + str2);

//        System.out.print("Enter Your First Name: ");
//        String fname = scan.next();
//        System.out.print("\nEnter Your Second Name: ");
//        String lname = scan.nextLine();
//        System.out.println(fname);
//        System.out.println(lname);

//        String stri = "I CAN AND I WILL";
//        int lengh = stri.length();
//        System.out.println("Lenght: " + lengh);
//
//        String fullName = "_" + "SARVESH" + "_";
//        System.out.println("fullName = " + fullName);

//        String str = scan.next();
//        System.out.println(isPalindrome(str));
    }
}
