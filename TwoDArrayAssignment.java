public class TwoDArrayAssignment {

    //Question 1:Print the number of 7’s that are inthe 2d array.
    // Input - int[][] array = {{4,7,8},{8,8,7}}; Output - 2
    public static int Q1(int[][] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (key == array[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    //Question 2:Print out the sum of the numbers in the second row of the array.
    // Input - int[][] nums = {{1,4,9},{11,4,3},{2,2,3}}; Output - 18
    public static int Q2(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row-1][i];
        }
        return sum;
    }


    public static void main(String[] para_coder) {
//        Question 1:
//        int[][] array = {{4,7,8}, {8,8,7}}; int count = 0;
//        System.out.println(Q1(array, 7));
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (8 == array[i][j]) {
                    count++;
                }
            }
        }
        System.out.println("This number arrived " + count + " times.");*/

//        Question 2:
        int[][] array = {{1,4,9}, {11,4,3}, {2,2,3}};
//        System.out.println(Q2(array, 2));
        int sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            sum += array[1][i];
        }
        System.out.println("The sum of Row is " + sum);
    }
}
