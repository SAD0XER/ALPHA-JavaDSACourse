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
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.ceil(Math.sqrt(X2 + Y2));
    }

    //Question 3:
    public static void lexicoGraphic(String[] str) {
        String large = str[0];

        for (int i = 1; i < str.length; i++) {
            if (large.compareTo(str[i]) < 0) {
                large = str[i];
            }
        }
        System.out.println(large);
    }

    //Question 4:
    public static String toCamelCase(String str) {
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                newstr.append(str.charAt(i)); //added firstly character.
                i++; //Increased the index after encountering white space.
                newstr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newstr.append(str.charAt(i)); /*If there is NO Empty char then it'll join to newstr as it is.*/
            }
        }
        return newstr.toString(); /*Finally converted the StringBuilder to string.*/
    }

    //Question 5:
    public static String strCompression(String str) {
        int n = str.length();
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            Integer count = 1;

            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }

    //Assignment Question 1:
    public static int lowerCaseCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    //Assignment Question 4:
    public static boolean isAnagram(String str1, String str2) {return true;}

    public static void main(String[] para_coder) {
        Scanner scan = new Scanner(System.in);

        //String declartion.
//        String str1 = "sarvesh", str2 = new String("sarvesh");
//        System.out.println("str1 = " + str1 + "\nstr2 = " + str2);

        //next() Function.
//        String fname = scan.next(); /*takes only single word.*/
//        System.out.print(fname);

        //nextLine() Function.
//        String lname = scan.nextLine(); /*take string with white space.*/
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

        //String Comparison
        /*String s1 = "sad", s2 = "sad", s3 = new String("sad");
        if (s1 == s2) System.out.println(1); //For String '==' equals to operator compares at object level.
        else System.out.println(0);
        if (s1.equals(s3)) System.out.println(1); //equal(obj) function compares objects.
        else System.out.println(0);*/

        //Substring
//        String str = "sarvesh ashok devrukhakar";
//        System.out.println(str.substring(8, 14));

        //Question 3:
//        String[] str = {"apple", "banana", "mango"};
//        lexicoGraphic(str);

        //Question 4:
//        String str = " hi i am sarvseh.";
//        System.out.println(toCamelCase(str));

        //Question 5:
//        String str = "abbcccdddd";
//        System.out.println(strCompression(str));

        //Assignment Question: 1
        /*System.out.print("Enter String: ");
        String str = scan.nextLine();
        System.out.println(lowerCaseCount(str) + " Lower Case Characters in your string.");*/

        //Assignment Question: 2
//        String str = "ShradhaDidi", str1 = "ApnaCollege", str2 = "ShradhaDidi";
//        System.out.println(str.equals(str1) + " " + str.equals(str2));

        //Assignment Question: 3
//        String str = "ApnaCollege".replace("l", "");
//        System.out.println(str);

        //Assignment Question 4: Determine if 2 Strings are Anagrams of each other.
//        System.out.print("Enter String 1: ");
//        String str1 = scan.next();
//        System.out.print("Enter String 2: ");
//        String str2 = scan.next();
//        System.out.println();
    }
}
