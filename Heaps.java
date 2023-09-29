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
            while (arr.get(x) < arr.get(parent)) {
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
            int minIndex = index;

/*FYI: This is the code for Minimum Heap, If you want to make it for Maximum Heap then change the sign '>' with '<' in if condition.
            Checking conditions for is Leaf Node.*/
            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) { //For Left.
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) { //For Right.
                minIndex = right;
            }

            if (minIndex != index) { //if Root is NOT Min.
                //Swap Root with Min
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);
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

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) { //Heap Sort. O(log N)
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
