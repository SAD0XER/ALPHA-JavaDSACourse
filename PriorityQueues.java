import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        /*This code will give output in Ascending order.
        If you want output in a Descending/Reverse order then add "Comparator.reverseOrder()" in PriorityQueue Constructor.*/
        PriorityQueue<Student> pq = new PriorityQueue<>(/*Comparator.reverseOrder()*/);

        //Adding every element's in PQ takes O(log n) time. Where, 'N' is a number of elements already exist in PQ.
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 6));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); //O(1)
            pq.remove(); //O(log n)
        }
    }
}
