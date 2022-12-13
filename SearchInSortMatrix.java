public class SearchInSortMatrix {

    public static void searchInSort(int[][] matrix, int key) {
        //Down Stair approach(0,m-1).
        /*int row = 0; int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Found key at (" + row + "," + col + ").");
                return;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.print("Key Not Found!");*/

        //Up Stair approach(n-1,0).
        int row = matrix.length-1; int col = 0;

        while (row >= 0 && col < matrix.length){
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ").");
                return;
            }
            else if (key < matrix[row][col]){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.print("Key Not Found!");
    }

    public static void main(String[] para_coder) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 39, 48},
                {32, 33, 39, 50}
        };
        int key = 39;
        searchInSort(matrix, key);
    }
}
