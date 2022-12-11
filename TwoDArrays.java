import java.util.*;

public class TwoDArrays {

    public static void searchKey(int[][] array, int key) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (key == array[i][j]) {
                    System.out.print("Key found at " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Key Not Found.");
    }

    public static void main(String[] paracoder) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[3][3];

//        Taking input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        searchKey(matrix, 0);

//        Printing Array
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/
    }
}