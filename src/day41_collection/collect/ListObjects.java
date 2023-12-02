package day41_collection.collect;

import java.util.ArrayList;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>(); // What is my reference? -- > List reference
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // We can have null as well
        list.add("a");  // Can I add duplicates? Yes, One of the LIST interface benefits
        System.out.println(list);
        System.out.println(list.get(3));

        System.out.println("*******************");

        List <String> list2 = new LinkedList<>(); //reference of the interface List, but the object is LinkedList object
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));

        System.out.println("*******************");

        List <String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list3.get(3));

    }
}




