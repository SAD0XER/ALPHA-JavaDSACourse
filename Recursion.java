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
        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return firstOccurrence(arr, key, i + 1);
    }

    public static int lastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        int isfound = lastOccurrence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) return i;
        return isfound;
    }

    public static int pow(int x, int n) {
        if (n == 0) return 1;
        return x * pow(x, n - 1);
    }

    public static int optimizedPow(int x, int n) {
        if (n == 0) return 1;
        int halfPow = optimizedPow(x, n / 2);
        if (n % 2 == 0) return halfPow * halfPow;
        else return x * halfPow * halfPow;

        /*
        //1st time I wrote like this.
        if (n == 0) return 1;
        int halfPow = optimizedPow(x, n / 2);
        if (n % 2 != 0) return x * halfPow * halfPow;
        return (int) Math.pow(optimizedPow(x, n / 2), 2);
        */
    }

    public static int tilingProblem(int N) {
        if (N == 0 || N == 1) return 1; //Base case
        return tilingProblem(N - 1) + tilingProblem(N - 2);

        /*
        //Didi's code
        if (N == 0 || N == 1) return 1; //Base case
        int vertical = tilingProblem(N - 1); //Vertical approach/choice
        int horizontal = tilingProblem(N - 2); //Horizontal approach/choice
        int totalWays = vertical + horizontal;
        return totalWays;
        */
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) { /*Base condition*/
            System.out.println(newstr);
            return;
        }

        int currChar = str.charAt(idx);
        if (map[currChar - 'a']) { /*for duplicate char*/
            removeDuplicates(str, idx + 1, newstr, map);
        } else { /*for new char*/
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstr.append((char)currChar), map);
        }
    }

    public static int FriendsParing(int N) {
        if (N == 1 || N == 2) return N;
        return FriendsParing(N-1) + ((N-1) * FriendsParing(N-2));
    }

    public static void main(String[] para_coder) {
//        printDec(10);
//        printInc(10);
//        System.out.println(factorial(5));
//        System.out.println(sumNatural(5));
//        System.out.println(fibonacci(5));
        /*int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));*/
        /*int[] arr = {8, 3, 7, 6, 9, 7, 5, 10, 6};
        //System.out.println(firstOccurrence(arr, 0, 0));
        System.out.println(lastOccurrence(arr, 7, 0));*/
//        System.out.println(pow(2, 1));
//        System.out.println(optimizedPow(2, 100));
//        System.out.println(tilingProblem(5));
        /*String str = "appannacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);*/
//        System.out.println(FriendsParing(3));
        }
}
