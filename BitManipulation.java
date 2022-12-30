public class BitManipulation {

    //Question 1:
    public static void isOddOrEven(int n) {
        int bitMast = 1;
        if ((n & bitMast) == 0) {
            System.out.print("Your Number is Even.");
        } else {
            System.out.print("Your Number is Odd.");
        }
    }

    //Operations on Bits
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
//        if (newBit == 0) {
//            return clearIthBit(n, i);
//        } else {
//            return setIthBit(n, i);
//        }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = -1 << i;
        return n & bitMask;
    }

    public static int clearRangeInBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    //Question 2:
    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    //Question 3:
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    //Question 4:
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { /*checking LSB*/
                ans = a * ans;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }

    //Assignment Questions:
    public static void swap(int a, int b) {
        a = a ^ b; // a now becomes 15 (1111)
        b = a ^ b; // b becomes 10 (1010)
        a = a ^ b; // a becomes 5 (0101)
        System.out.println("a = " + a + " b = " + b);
    }

    public static int addOneToInt(int n) {
        return -~n;
    }

    public static char toLowerCase(char ch) {
        return (char)(ch | ' ');
    }

    public static void main(String[] para_coder) {
//        System.out.println(5 & 2); //AND
//        System.out.println(5 | 2); //OR
//        System.out.println(5 ^ 2); //XOR
//        System.out.println(~5); //NOT

//        isOddOrEven(13);
//        System.out.println(setIthBit(1010, 0));
//        System.out.println(clearIthBit(10, 1));
//        System.out.println(updateIthBit(10, 1, 1));
//        System.out.println(clearIBits(10, 2));
//        System.out.println(clearRangeInBits(15, 1, 2));
//        System.out.println(isPowerOfTwo(16));
//        System.out.println(countSetBits(0));
//        System.out.println(fastExpo(3, 5));
//        int x = 3; System.out.println(x^x); /*x^x is always zero*/
//        swap(2, 3);
//        System.out.println(addOneToInt(0));
//        System.out.println(toLowerCase('A'));
    }
}
