public class BasicSortingQuestion {
/* Question : Use the following sorting algorithms to sort an array in DESCENDING order:
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]*/

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minPosition] < array[j]) { //Change '>' to '<' for Sorted Reverse Array.
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i <= n - 1; i++) {
            int current = array[i];
            int previous = i - 1;

//				Finding the correct position for insertion.
            while (previous >= 0 && array[previous] < current) {
                array[previous + 1] = array[previous];
                previous--;
            }
//				Insertion
            array[previous + 1] = current;
        }
    }

    public static void countingSort(int[] array) {
        int n = array.length;
        int largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largeNum = Math.max(largeNum, array[i]);
        }

        int[] count = new int[largeNum + 1];
        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        //Sorting
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        System.out.println("Buble Sort:");
        bubbleSort(array);
        printArray(array);

        System.out.println("\nSelection Sort:");
        selectionSort(array);
        printArray(array);

        System.out.println("\nInsurtion Sort:");
        insertionSort(array);
        printArray(array);

        System.out.println("\nCounting sort:");
        countingSort(array);
        printArray(array);
    }
}