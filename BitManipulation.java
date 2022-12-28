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
        int bitMask = -1<<i;
        return n & bitMask;
    }

    public static int clearRangeInBits(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
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
    }
}
