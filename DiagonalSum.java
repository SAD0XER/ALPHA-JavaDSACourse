public class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length; //row
        int m = matrix[0].length; //column
        int sum = 0;

        //Big O(n^2) approach
        //Primary Diagonal
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        //Secondary Diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == n-1) {
                    sum += matrix[i][j];
                }
            }
        }*/


        //Big O(n) approach
        for (int i = 0; i < n; i++) {
            //PD
            sum += matrix[i][i];
            //SD
            if (i != n - 1 - i) {
                sum += matrix[i][m - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] para_coder) {
        /*int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};*/

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(matrix));
    }
}
