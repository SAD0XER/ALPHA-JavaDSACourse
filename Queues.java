public class Queues {
    static class QueueArr {
        static int[] arr;
        static int size;
        static int rear;

        //Constructor
        QueueArr(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //isEmpty Method.
        public static boolean isEmpty() {
            return rear == -1;
        }

        //Add (Enque) Method. O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full.");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        //Remove (Dequeue) Method. O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear = rear - 1;
            return front;
        }

        //Peek O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.print("Queue is Empty.");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] para_coder) {
        QueueArr q = new QueueArr(5); //Here we've defined size of the array.
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
