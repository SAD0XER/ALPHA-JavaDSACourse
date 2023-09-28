import java.util.ArrayList;

public class Heaps {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        //Insert in Heaps. //Time Complexity: O(log N)
        public void add(int data) {
            //Add Data at Last Index.
            arr.add(data);

            int x = arr.size() - 1; //Index of Child.
            int parent = (x - 1) / 2; //Index of Parent.

            while (arr.get(x) < arr.get(parent)) { //Time Complexity of While Loop: O(log N) - Because of the Height of Tree.
                //Swap child with parent.
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
            }
        }
    }

    public static void main(String[] args) {
    }
}
