public class Recursion {
    public static void printDec(int N) {
        if (N == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(N + "\t");
        printDec(N - 1);
    }

    public static void printInc(int N) {
        if (N == 1) {
            System.out.print(1 + "\t");
            return;
        }
        printInc(N - 1);
        System.out.print(N + "\t");
    }

    public static int factorial(int N) {
        if (N == 0) return 1;
        int fnm1 = factorial(N - 1);
        int fn = N * fnm1;
        return fn;
    }

    public static int sumNatural(int N) {
        if (N == 1) return 1;

        int snm1 = sumNatural(N - 1);
        int son = N + snm1;
        return son;
    }

    public static int fibonacci(int N) {
        if (N == 0 || N == 1) return N;
        int fnm1 = fibonacci(N - 1);
        int fnm2 = fibonacci(N - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        if (arr[i] > arr[i + 1]) return false;
        return isSorted(arr, i+1);
    }

    public static void main(String[] para_coder) {
//        printDec(10);
//        printInc(10);
//        System.out.println(factorial(5));
//        System.out.println(sumNatural(5));
//        System.out.println(fibonacci(5));
/*        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));*/
    }
}