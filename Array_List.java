import java.util.*;

public class Array_List {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        //brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
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

        //Print reverse of ArrayList. O(n)
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

        //Container with Most Water. Brute Force: O(n^2)
        ArrayList<Integer> height = new ArrayList<>();
        //height = [1, 8, 6, 2, 5, 4, 8, 3, 7] //ArrayList
        height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);

        System.out.println(storeWater(height));
    }
}
