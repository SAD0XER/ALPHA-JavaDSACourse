import java.util.ArrayList;

public class Array_List {
    public static void main(String[] para_coder) {
        //Defining all the ArrayList variable
        ArrayList<Byte> list1 = new ArrayList<>();
        ArrayList<Short> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Long> list4 = new ArrayList<>();
        ArrayList<Float> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        ArrayList<Character> list7 = new ArrayList<>();
        ArrayList<String> list8 = new ArrayList<>();
        ArrayList<Boolean> list9 = new ArrayList<>();

        //Adding elements in ArrayList.
        list1.add((byte) 123); list1.add((byte) 1); list1.add((byte) 0);
        list2.add((short) 1212); list2.add((short) 3332); list2.add((short) 4443);
        list3.add(1234567); list3.add(3423452); list3.add(3495736);
        list4.add(10000000067L); list4.add(1034L); list4.add(10000430000L);
        list5.add(1.23f); list5.add(2.832f); list5.add(3.232f);
        list6.add(1.34534544); list6.add(2.34534); list6.add(3.3434554);
        list7.add('a'); list7.add('7'); list7.add('%');
        list8.add("sad"); list8.add("234AD"); list8.add("sdf45$%");
        list9.add(true); list9.add(true); list9.add(false);

        //Getting elements of ArrayList
        /*System.out.println(list1.get(1));
        System.out.println(list2.get(1));
        System.out.println(list3.get(1));
        System.out.println(list4.get(1));
        System.out.println(list5.get(1));
        System.out.println(list6.get(1));
        System.out.println(list7.get(1));
        System.out.println(list8.get(1));
        System.out.println(list9.get(1));*/

        //Removing elements of ArrayList
        /*list1.remove(1);
        list2.remove(1);
        list3.remove(1);
        list4.remove(1);
        list5.remove(1);
        list6.remove(1);
        list7.remove(1);
        list8.remove(1);
        list9.remove(1);*/

        //Setting elements of ArrayList
        /*list1.set(1, (byte) 111);
        list2.set(1, (short) 111);
        list3.set(1, 9999);
        list4.set(1, 999945345L);
        list5.set(1, 9999.345f);
        list6.set(1, 9999.4353434);
        list7.set(1, '@');
        list8.set(1, "OM");
        list9.set(1, false);*/

        //Checking ArrayList contains specific value or not
        /*System.out.println(list1.contains((byte) 123));
        System.out.println(list2.contains((short) 123));
        System.out.println(list3.contains(1234567));
        System.out.println(list4.contains(1034L));
        System.out.println(list5.contains(1034.3f));
        System.out.println(list6.contains(3.3434554));
        System.out.println(list7.contains('5'));
        System.out.println(list8.contains("sad"));
        System.out.println(list9.contains(false));*/

        //Adding elements at specified index
        /*list1.add(2, (byte) 101);
        list2.add(2, (short) 101);
        list3.add(3, 9999);
        list4.add(3, 999945433L);
        list5.add(3, 9999.23f);
        list6.add(3, 9999.234234);
        list7.add(0, '!');
        list8.add(3, "Aa!1");
        list9.add(3, true);*/
   }
}
