public class Recursion {
    public static void printDec(int N) {
        if (N == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(N + "\t");
        printDec(N-1);
    }
    public static void main(String[] para_coder) {
        printDec(10);
    }
}