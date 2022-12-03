public class CountingSort {

    public static void countingSort(int[] array) {
        int n = array.length;
        int largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largeNum = Math.max(largeNum, array[i]);
        }

        int[] count = new int[largeNum+1];
        for (int i = 0; i<n; i++) {
            count[array[i]]++;
        }

        //Sorting
        int j = 0;
        for (int i = 0; i<count.length; i++) {
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

    public static void main(String[] sad0xer) {
        int[] array = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(array);
        printArray(array);
    }
}
