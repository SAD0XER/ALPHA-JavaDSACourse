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
        Node ptr;

        //Constructor.
        Node(int data) {
            this.data = data;
            this.ptr = null;
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

            newNode.ptr = head;
            head = newNode;
        }

        //Pop(): To Remove element from Linked List.
        public static int pop() {
            if (isEmpty()) return -1;

            int top = head.data;
            head = head.ptr;
            return top;
        }

        //Peek(): To see which elements on the top.
        public static int peek() {
            if (isEmpty()) return -1;

            return head.data;
        }
    }

    //Question 1: Push at the Bottom of the Stack. O(n)
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        //Base Case: If Stack is Empty then Add/Push data directly.
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        //Work
        int top = stack.pop(); //Storing Top most element.
        pushAtBottom(stack, data); //Recursive Calling for next element.
        stack.push(top); //Adding those removed element again.
    }

    //Question 2: Reverse a String using Stack.
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!stack.isEmpty()) {
            char curr = stack.pop();
            result.append(curr);
        }

        return result.toString();
    }

    //Question 3: Reverse a Stack. O(n)
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return; //If Stack is Empty.

        int top = stack.pop(); //1st. popping all elements 1 by 1.
        reverseStack(stack); //2nd. Recursive Calling.
        pushAtBottom(stack, top); //3rd. Pushing elements at Bottom.
    }

    //Question 4: Stock Span Problem. O(n)
    public static void stocksSpan(int[] stocks, int[] span) {
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!stack.isEmpty() && currPrice > stocks[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }

            stack.push(i);
        }
    }

    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    //Valid Parentheses Code. O(n)
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Opening condition
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // Closing condition
                if (stack.isEmpty()) return false;

                if ((stack.peek() == '(' && ch == ')') /*()*/
                        || (stack.peek() == '[' && ch == ']') /*[]*/
                        || (stack.peek() == '{' && ch == '}') /*{}*/) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Duplicate Parentheses. O(n)
    public static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Closing case.
            if (ch == ')') {
                int count = 0;
                while (stack.pop() != '(') {
                    count++;
                }
                if (count < 1) return true; //Duplicate exist.
            } else { //Opening case.
                stack.push(ch);
            }
        }
        return false;
    }

    //Max Area in Histogram. O(n)
    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length]; //Next Smaller Right.
        int[] nsl = new int[arr.length]; //Next Smaller Left.

        //Next Smaller Right. O(n)
        Stack<Integer> stack = new Stack<>();

        for (int j = arr.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[j]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[j] = arr.length; //n/-1
            } else {
                nsr[j] = stack.peek(); //Top
            }
            stack.push(j);
        }

        //Next Smaller Left. O(n)
        stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1; //-1
            } else {
                nsl[i] = stack.peek(); //Top
            }
            stack.push(i);
        }

        //Current Area: width = j - i - 1 = nsr[i] - nsl[i] - 1; O(n)
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Maximum Area in Histogram = " + maxArea);
    }

    //Assignment Question 1: Palindrome Linked List.
    static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.ptr;
        }
        return ispalin;
    }

    //Assignment Question 2: Simplify Path. TC: O(n) & SC: O(1)
    static String simplify(String str) {
        Stack<String> st = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = str.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            while (i < len_A && str.charAt(i) == '/') {
                i++;
            }

            while (i < len_A && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            } else if (dir.equals(".")) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }

        Stack<String> st1 = new Stack<String>();
        while (!st.empty()) {
            st1.push(st.pop());
        }

        while (!st1.empty()) {
            if (st1.size() != 1) {
                res += (st1.pop() + "/");
            } else {
                res += st1.pop();
            }
        }
        return res;
    }

    public static void main(String[] para_coder) {
//        StackLL stack = new StackLL();
        /*Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);
        printStack(stack);*/

//        pushAtBottom(stack, 4);

        /*while (!stack.isEmpty()) {
            System.out.println(stack.peek()); //Printing the TOP element.
            stack.pop(); //After printing, Removing TOP element.
        }*/

        /*String str = "SAD";
        String result = reverseString(str);
        System.out.println("Result = " + result);*/

        /*int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        stocksSpan(stocks, span);

        for(int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }*/

        /*Next Greater Element: This question has 4 forms.
        1. Next Greater at Right Side (Backward Loop and <=)
        2. Next Greater at Left Side (Forward Loop and <=)
        3. Next Smallest at Right Side (Backward Loop and >=)
        4. Next Smallest at Left Side (Forward Loop and >=)*/
        /*int[] arr = {98, 76, 54, 32, 10}, nextGreater = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
//        int[] nextGreater = new int[arr.length];

        //Backward loop.
        for (int i = arr.length - 1; i >= 0; i--) {
            //1. While loop
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            //if-else checking.
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }

            //pushing in stack.
            stack.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }*/

        //Valid Parentheses. O(n)
        /*String str = "{()[{}]()}"; //true
        String str2 = "{)([]{}}"; //false
        System.out.println(isValid(str));*/

        //Duplicate Parentheses. O(n)
        /*String str = "((a+b))"; //true
        String str2 = "(c+d)"; //false
        System.out.println(isDuplicate(str2));*/

        //Max Area in Histogram. O(n)
        /*int[] arr = {2, 1, 5, 6, 2, 3}; //Heights in Histogram.
        maxArea(arr);*/

        //Assignment Question 1: Palindrome Linked List. TC & SC: O(n)
        /*Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;

        if (isPalindrome(one)) {
            System.out.println("Yes, It is Palindrome.");
        } else {
            System.out.println("No, It is NOT a Palindrome.");
        }*/

        //Assignment Question 2: Simplify Path. TC: O(n) & SC: O(1)
        String str = new String("/a/./b/../../c/");
//        String str = new String("/apnacollege/"); // /apnacollege
//        String str = new String("/a/.."); // /
        System.out.println(simplify(str));
    }
}
