import java.util.ArrayList;

public class Stack {

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

    public static void main(String[] para_coder) {
        StackAL stack = new StackAL();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); //Printing the TOP element.
            stack.pop(); //After printing, Removing TOP element.
        }
    }
}
