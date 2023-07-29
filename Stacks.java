import java.util.*;

public class Stacks {

    //Implementation of Stack using ArrayList.
    static class StackAL {
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty(): To know List is Empty or Not.
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //Push(): To Add elements in Stack.
        public static void push(int data) {
            list.add(data);
        }

        //Pop(): To Remove element from stack.
        public static int pop() {
            //Corner case for Empty stack.
            if (isEmpty()) return -1;

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //Peek(): To see which elements on the top.
        public static int peek() {
            //Corner case for Empty stack.
            if (isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    }

    //Implementation of Stack using Linked List.
    static class Node {
        int data;
        Node next;

        //Constructor.
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackLL {
        static Node head = null;

        //isEmpty(): To know Linked List is Empty or Not.
        public static boolean isEmpty() {
            return head == null;
        }

        //Push(): To Add elements in Linked List.
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //Pop(): To Remove element from Linked List.
        public static int pop() {
            if (isEmpty()) return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        //Peek(): To see which elements on the top.
        public static int peek() {
            if (isEmpty()) return -1;

            return head.data;
        }
    }

    public static void main(String[] para_coder) {
//        StackLL stack = new StackLL();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); //Printing the TOP element.
            stack.pop(); //After printing, Removing TOP element.
        }
    }
}
