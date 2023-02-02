public class DivideNConquer {

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        //base case
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; //idx for left array
        int j = mid + 1; //idx for right array
        int k = 0; //idx for temp array

        //comparing left arr with right arr & assigning to that respective page.
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //Here we're pushing those sorted array into temporary array.
        //Left side of temporary array.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //Left side of temporary array.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copying temp array into main array.
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) return; //Base Case

        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); //Partition in Left
        quickSort(arr, pIdx + 1, ei); //Partition in Right
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei]; //Choose Last number as a Pivot
        int i = si - 1; //Index pointer

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { //Comparing pivot with elements of array
                i++;
                //swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //Swapping for pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //Don't pivot = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] para_coder) {
        int[] arr = {6, 3, 9, 5, 2, 8, -2};
//        mergeSort(arr, 0, arr.length - 1);
//        printArray(arr);
//        quickSort(arr, 0, arr.length - 1);
//        printArray(arr);
    }
}
