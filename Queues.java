import java.util.*;

public class Queues {
    static class QueueArr {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        //Constructor
        QueueArr(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //isEmpty Method: To check queue is Empty or NOT.
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        //isFull Method: To check Circular Queue is Full or NOT.
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //Add (Enque) Method. O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full.");
                return;
            }
            //Case: while Adding First element.
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //Remove (Dequeue) Method. O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }
            int result = arr[front];

            //Case: when Removing Last element.
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //Peek O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class QueueLL {
        static Node head = null;
        static Node tail = null;

        //isEmpty Method: To check queue is Empty or NOT.
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //Add (Enque) Method. O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            //Case: When there is NO any Node in LL.
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Remove (Dequeue) Method. O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }
            int front = head.data;
            //Case: When there is single element in LL.
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        //Peek O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }
            return head.data;
        }
    }

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    //isEmpty
    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    //Add: O(n)
    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    //Remove: O(1)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        return s1.pop();
    }

    //Peek: O(1)
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] para_coder) {
//        QueueLL q = new QueueLL(); //Here we've defined size of the array.

        /*FYI: Queue is an Interface so, we cannot create object of it. So, we need any other class to implement it.
         * There are two classes in Java who can implement Queue interfaces. One is Linked List and Second is ArrayDeque.*/

//        Queue<Character> q = new LinkedList<>();
//        Queue<Character> q = new ArrayDeque<>();
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
