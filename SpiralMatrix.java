public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1; //ER = n-1
        int endCol = matrix[0].length-1; //EC = m-1

        while (startRow <= endRow && startCol <= endCol) { /*we keep this condition because we want to print that remaining 1 element in nxn matrix.*/
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {  /*This condition helps to print element for only once in nxn matrix.*/
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { /*This condition helps to print element for only once in nxn matrix.*/
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] para_coder) {
     int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printSpiralMatrix(matrix);
    }
}