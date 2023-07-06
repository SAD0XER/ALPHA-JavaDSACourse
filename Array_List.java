import java.util.*;

public class Array_List {

    /*public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }*/

    //Brute Force Approach Function.
    /*public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }*/

    //2 Pointer Approach Function.
    /*public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0; //Left Pointer.
        int rp = height.size() - 1; //Right Pointer.

        while (lp < rp) {
            //Calculating Water Area.
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);

            //Updating Pointer.
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }*/

    //Brute Force Approach Function.
    /*public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }*/

    //2 Pointer Approach Function.
    /*public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;

        while (lp != rp) {
            //case 1:
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case 2:
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else { //case 3:
                rp--;
            }
        }
        return false;
    }*/

    //2 Pointer Approach Function.
    /*public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size(), bp = -1; //Breaking Point
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1; //Smallest Element
        int rp = bp; //Largest Element

        while (lp != rp) {
            //Case 1:
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //Case 2:
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size(); //Important Formula
            } else { //Case 3:
                rp = (list.size() + rp - 1) % list.size(); //Important Formula
            }
        }
        return false;
    }*/

    //Assignment Question 1: Monotonic
    public static boolean isMonotonic(ArrayList<Integer> list) {
        //with O(n^2) complexity
        /*if (list.get(0) <= list.get(1)) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (!(list.get(i) <= list.get(j))) { //for increasing monotone
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (!(list.get(i) >= list.get(j))) { //for decreasing monotone
                        return false;
                    }
                }
            }
        }
        return true;*/

        //with O(n) complexity
        boolean increase = true, decrease = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increase = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                decrease = false;
            }
        }

        return increase || decrease;
    }

    //Assignment Question 3: Most Frequent Number of Following Key
    /*public static int frequentNumber(ArrayList<Integer> list, int key) {
        int target = list.get(key), count = 0;

        for (int i = key; i < list.size(); i++) {
            if (list.get(i) == target) {
                count++;
            }
        }
        System.out.println("Count of target occurrence is " + count);
        return target;
    }*/

    //Assignment Question 2: Lonely Numbers in ArrayList
    /*public static ArrayList<Integer> aloneNumbers(ArrayList<Integer> list) {
        //Actual Solution
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                ans.add(list.get(i));
            }
        }

        if (list.size() == 1) {
            ans.add(list.get(0));
        }

        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                ans.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                ans.add(list.get(list.size() - 1));
            }
        }
        return ans;
    }*/

    //Assignment Question 4: Beautiful ArrayList - Approach 1: Divide and Conquer
    /*public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        dividenConquer(1, 1, res, n);
        return res;
    }

    private static void dividenConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        dividenConquer(start, 2 * increment, res, n);
        dividenConquer(start + increment, 2 * increment, res, n);
    }*/

    //Assignment Question 4: Beautiful ArrayList - Approach 2: Iterative
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n) temp.add(e * 2);
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n) temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] para_coder) {
        //Defining all the ArrayList variable
        /*ArrayList<Byte> list1 = new ArrayList<>();
        ArrayList<Short> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Long> list4 = new ArrayList<>();
        ArrayList<Float> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        ArrayList<Character> list7 = new ArrayList<>();
        ArrayList<String> list8 = new ArrayList<>();
        ArrayList<Boolean> list9 = new ArrayList<>();*/

        //Adding elements in ArrayList.
        /*list1.add((byte) 123); list1.add((byte) 1); list1.add((byte) 0);
        list2.add((short) 1212); list2.add((short) 3332); list2.add((short) 4443);
        list3.add(1234567); list3.add(3423452); list3.add(3495736);
        list4.add(10000000067L); list4.add(1034L); list4.add(10000430000L);
        list5.add(1.23f); list5.add(2.832f); list5.add(3.232f);
        list6.add(1.34534544); list6.add(2.34534); list6.add(3.3434554);
        list7.add('a'); list7.add('7'); list7.add('%');
        list8.add("sad"); list8.add("234AD"); list8.add("sdf45$%");
        list9.add(true); list9.add(true); list9.add(false);*/

        //Getting elements of ArrayList.
        /*System.out.println(list1.get(1));
        System.out.println(list2.get(1));
        System.out.println(list3.get(1));
        System.out.println(list4.get(1));
        System.out.println(list5.get(1));
        System.out.println(list6.get(1));
        System.out.println(list7.get(1));
        System.out.println(list8.get(1));
        System.out.println(list9.get(1));*/

        //Removing elements of ArrayList.
        /*list1.remove(1);
        list2.remove(1);
        list3.remove(1);
        list4.remove(1);
        list5.remove(1);
        list6.remove(1);
        list7.remove(1);
        list8.remove(1);
        list9.remove(1);*/

        //Setting elements of ArrayList.
        /*list1.set(1, (byte) 111);
        list2.set(1, (short) 111);
        list3.set(1, 9999);
        list4.set(1, 999945345L);
        list5.set(1, 9999.345f);
        list6.set(1, 9999.4353434);
        list7.set(1, '@');
        list8.set(1, "OM");
        list9.set(1, false);*/

        //Checking ArrayList contains specific value or not.
        /*System.out.println(list1.contains((byte) 123));
        System.out.println(list2.contains((short) 123));
        System.out.println(list3.contains(1234567));
        System.out.println(list4.contains(1034L));
        System.out.println(list5.contains(1034.3f));
        System.out.println(list6.contains(3.3434554));
        System.out.println(list7.contains('5'));
        System.out.println(list8.contains("sad"));
        System.out.println(list9.contains(false));*/

        //Adding elements at specified index.
        /*list1.add(2, (byte) 101);
        list2.add(2, (short) 101);
        list3.add(3, 9999);
        list4.add(3, 999945433L);
        list5.add(3, 9999.23f);
        list6.add(3, 9999.234234);
        list7.add(0, '!');
        list8.add(3, "Aa!1");
        list9.add(3, true);*/

        //Print reverseLL of ArrayList. O(n)
        /*ArrayList<Integer> list = new ArrayList<>();
        //Adding elements in ArrayList using loop.
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        //Reversing ArrayList.
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/

        //Find Maximum number from ArrayList. O(n)
        /*ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter Number: ");
            int n = scan.nextInt();
            list.add(n);
        }

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) max = list.get(i);
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element of ArrayList is = " + max);*/

        //Swap 2 Numbers.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1234567); list.add(5); list.add(323452); list.add(3); list.add(3736);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);*/

        //Sorting an ArrayList.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(5); list.add(3); list.add(1); list.add(4);

        System.out.println("Given ArrayList: " + list);

        Collections.sort(list); //Ascending Sort
        System.out.println("Ascending Sorted ArrayList: " + list);

        Collections.sort(list, Collections.reverseOrder()); //Descending Sort
        //list.sort(Collections.reverseOrder()); //Descending Sort
        System.out.println("Descending Sorted ArrayList: " + list);*/

        //Multi-Dimensional ArrayList.
        /*ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); //Defining 2D ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(); //Defined nested list 1
        ArrayList<Integer> list2 = new ArrayList<>(); //Defined nested list 2
        ArrayList<Integer> list3 = new ArrayList<>(); //Defined nested list 2
        mainList.add(list1); mainList.add(list2); mainList.add(list3); //Adding all lists in mainList

        //Add elements in each list through loop.
        for (int i = 1; i <= 10; i++) {
            list1.add(1 * i); list2.add(2 * i); list3.add(3 * i);
        }

        //Print all nested list.
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("mainList = " + mainList);*/

        //Container with Most Water. 2 Pointer Approach: O(n)
        /*ArrayList<Integer> height = new ArrayList<>();
        //height = [1, 8, 6, 2, 5, 4, 8, 3, 7] //ArrayList
        height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);

        System.out.println(storeWater(height));*/

        //Pair Sum 2: 2 Pointer Approach O(n)
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(11); list.add(15); list.add(6); list.add(8); list.add(9); list.add(10);
        int target = 16;

        System.out.println(pairSum2(list, target));*/

        //Assignment Question 1: Monotonic ArrayList O(n^2)
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(2); list.add(4); list.add(3);

        System.out.println(isMonotonic(list));*/

        //Assignment Question 3: Most Frequent Number of Following Key
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(2); list.add(2); list.add(2); list.add(3); list.add(2);
        int key = 2;

        System.out.println("Target was " + frequentNumber(list, key));*/

        //Assignment Question 3: Lonely Numbers in ArrayList
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(5); list.add(6); list.add(8); list.add(11);

        System.out.println(aloneNumbers(list));*/

        //Assignment Question 4: Beautiful ArrayList
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = scan.nextInt();
        System.out.println(beautifulArray(n));
    }
}
