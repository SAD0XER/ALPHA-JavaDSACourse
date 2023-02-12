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

    public static void quickSort(int[] arr, int si, int ei) {
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
        arr[ei] = arr[i]; //Don't pivot = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static int search(int[] arr, int tar, int si, int ei) {
        //Base Case
        if (si > ei) return -1;

        //Finding Mid of Line
        int mid = si + (ei - si) / 2;

        //Target found at mid
        if (tar == arr[mid]) return mid;

        //Mid on line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) return search(arr, tar, si, mid - 1); //Left side
            else return search(arr, tar, mid + 1, ei); //Right side
        } else {
            //Mid on line 2
            if (arr[mid] <= tar && tar <= arr[ei]) return search(arr, tar, mid + 1, ei); //Right side
            else return search(arr, tar, si, mid - 1); //Left side
        }
    }

    public static int search(int[] arr, int target) {
        /*This is an official code from Alpha.
        Approach: Iterative
        In this code bring your element at mid so, it will return by mid.*/

        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            //falls on L1
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= target && target <= arr[mid]) {
                    //go left
                    ei = mid - 1;
                } else {
                    //go right
                    si = mid + 1;
                }
            }
            //falls on L2
            else {
                if (arr[mid] <= target && target <= arr[ei]) {
                    //go right
                    si = mid + 1;
                } else {
                    //go left
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    //This is Official Solution. Not by Me.
    public static String[] sortString(String[] str, int si, int ei) {
        if (si == ei) {
            String[] A = {str[si]};
            return A;
        }

        int mid = si + (ei - si) / 2;
        String[] str1 = sortString(str, si, mid);
        String[] str2 = sortString(str, mid + 1, ei);
        return merge(str1, str2);
    }

    static String[] merge(String[] str1, String[] str2) {
        int m = str1.length;
        int n = str2.length;
        String[] arr3 = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(str1[i], str2[j])) {
                arr3[idx] = str1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = str2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            arr3[idx] = str1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = str2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    // Return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] para_coder) {
//        int[] arr = {6, 3, 9, 5, 2, 8, -2};
//        mergeSort(arr, 0, arr.length - 1);
//        printArray(arr);
//        quickSort(arr, 0, arr.length - 1);
//        printArray(arr);
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(search(arr, 1, 0, arr.length - 1));
//        System.out.println(search(arr, 0));
//        String[] str = {"sun", "earth", "mars", "mercury"};
//        String[] A = sortString(str, 0, str.length - 1);
//        for (int i = 0; i < str.length; i++) System.out.println(A[i]);
    }
}
