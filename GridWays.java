public class GridWays {
    public static int findGridWays(int i, int j, int n, int m) {
        //base case
        if (i == n - 1 && j == m - 1) { /*condition for last cell*/
            return 1;
        } else if (i == n || j == m) { /*condition for boundary cells*/
            return 0;
        }

        //recursion
        int w1 = findGridWays(i + 1, j, n, m); //down cell
        int w2 = findGridWays(i, j + 1, n, m); //right cell

        return w1 + w2;
    }

    public static void main(String[] para_coder) {
        int n = 3, m = 4;
        System.out.println(findGridWays(0, 0, n, m));
    }
}
