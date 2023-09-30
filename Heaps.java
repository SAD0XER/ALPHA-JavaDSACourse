import java.util.*;

public class Heaps {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        //Insert in Heaps. //Time Complexity: O(log N)
        public void add(int data) {
            //Add Data at Last Index.
            arr.add(data);

            int x = arr.size() - 1; //Index of Child.
            int parent = (x - 1) / 2; //Index of Parent.

/*FYI: This is the code for Minimum Heap, If you want to make it for Maximum Heap then change the sign '<' with '>' in while loop.
            Time Complexity of While Loop: O(log N) - Because of the Height of Tree.*/
            while (arr.get(x) > arr.get(parent)) {
                //Swap child with parent.
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                //Updating values for running loop.
                x = parent;
                parent = (x - 1) / 2;
            }
        }

        //Get Minimum in Heap. (Peek from Heap) Time Complexity: O(1);
        public int peek() {
            return arr.get(0);
        }

        //Utility function for remove() method to Fix the Heap after deletion O(log N).
        private void heapify(int index) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            int maxIndex = index;

/*FYI: This is the code for Minimum Heap, If you want to make it for Maximum Heap then change the sign '>' with '<' in if condition.
            Checking conditions for is Leaf Node.*/
            if (left < arr.size() && arr.get(maxIndex) < arr.get(left)) { //For Left.
                maxIndex = left;
            }

            if (right < arr.size() && arr.get(maxIndex) < arr.get(right)) { //For Right.
                maxIndex = right;
            }

            if (maxIndex != index) { //if Root is NOT Min.
                //Swap Root with Min
                int temp = arr.get(index);
                arr.set(index, arr.get(maxIndex));
                arr.set(maxIndex, temp);

                heapify(maxIndex);
            }
        }

        //Delete in Heap. (Remove from Heap) Time Complexity: O(log N)
        public int remove() {
            int data = arr.get(0);

            //Step-1: Swap 1st and Last.
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //Step-2: Delete Last Element.
            arr.remove(arr.size() - 1);

            //Step-3: Heapify for Root to Fix the Heap.
            heapify(0);

            return data;
        }

        //Function to check Heap is Empty or NOT.
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    //Function Work: To sort Heap in a Descending Order. (Utility Function for heapSort() method.)
    public static void heapify(int[] arr, int i, int size) { //size: size of the Heap.
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int maxIndex = i;

        if (left < size && arr[left] < arr[maxIndex]) {
            maxIndex = left;
        }

        if (right < size && arr[right] < arr[maxIndex]) {
            maxIndex = right;
        }

        if (maxIndex != i) {
            //Swapping
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            heapify(arr, maxIndex, size);
        }
    }

    //Heap Sort (Descending Order Sorting). Time Complexity: O(N*LogN)
    public static void heapSort(int[] arr) {
        //Step-1: Build MaxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        //Step-2: Push the Largest Element at End.
        for (int i = n - 1; i > 0; i--) {
            //Swap Largest (1st index) with Last index.
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        /*Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) { //Heap Sort. O(log N)
            System.out.println(pq.peek());
            pq.remove();
        }*/

        int[] arr = {1, 2, 4, 5, 3};
        heapSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
