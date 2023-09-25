import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {
    public static void main(String[] args) {
        /*This code will give output in Ascending order.
        If you want output in a Descending/Reverse order then add "Comparator.reverseOrder()" in PriorityQueue Constructor.*/
        PriorityQueue<Integer> pq = new PriorityQueue<>(/*Comparator.reverseOrder()*/);

        //Adding every element's in PQ takes O(log n) time. Where, 'N' is a number of elements already exist in PQ.
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(log n)
        }
    }
}
