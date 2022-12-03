//import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class InbuildsortFunctions {
    /* NOTE: Remember these function returns the sorted array.
    * They does't print anything itself.*/
    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] sad0xer) {
        Integer[] arr = {5, 4, 1, 3, 2};
        Integer[] arr1 = {1, 4, 1, 3, 2, 4, 3, 7};

        //Calling inbuild methods of sorting.
        Arrays.sort(arr); //Ascending sort.
        printArray(arr);

        Arrays.sort(arr1, 0, 3); //Ascending sort with fromIndex & toIndex.
        printArray(arr1);

        Arrays.sort(arr, Collections.reverseOrder()); //Descending sort.
        printArray(arr);

        Arrays.sort(arr1, 0, 3, Collections.reverseOrder()); //Descending sort with fromIndex & toIndex.
        printArray(arr1);
    }
}
