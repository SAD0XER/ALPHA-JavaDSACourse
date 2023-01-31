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

    public static void main(String[] para_coder) {
        int[] arr = {6, 3, 9, 5, 2, 8, -2};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
