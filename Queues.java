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

    public static void main(String[] para_coder) {
        QueueArr q = new QueueArr(3); //Here we've defined size of the array.
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
