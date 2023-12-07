package day42_maps.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // reference is List interface - object is ArrayList class
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // null is allowed
        list.add("a");  // can have duplicates
        // Keeps insertion order
        // add(),remove() is slower because of arrays being used in the background
        // get() is faster since we know what index se will get the element from
        System.out.println(list);
        System.out.println(list.get(3));


        List <String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); // null is allowed
        list2.add("a");  // can have duplicates
        // Keeps insertion order
        // add(),remove() is faster because of nodes being used in the background
        // get() is slower since we do not know what index, so we have to loop through to fins the element we want to get
        System.out.println(list2);
        System.out.println(list2.get(3));


        List <String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null); // null is allowed
        list3.add("a");  // can have duplicates
        // Keeps insertion order
        // It is synchronized meaning thread safe - > since it is thread safe, it is slower.

        System.out.println(list3);
        System.out.println(list3.get(3));


        // -----------------------------------------------------------------------------

       /*
       Set -- > Interface

            HashSet
                - Not ordered
                - No duplicates
                - accepts null

            LinkedHashSet
                - maintained the insertion order
                - No duplicate
                - accepts null

            TreeSet
                - Implementes SortedSet interface
                - No duplicates
                - Order is Sorted
                - Accepts null

        */

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(14);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
        // Set does not work with indexes. That is why we can not get the element in this way.
        //System.out.println("first: " + set.get(0));

        // Because SET does not word with indexes, I need to loop through the Set and get the element
        for ( Integer each : set) { //         for ( int each : set) { -- > DOWNCASTING / UNBOXING

            if (each == 10){
                System.out.println(each);
            }
        }


        // How can I sort my HashSet ?
        // By converting HashSet into TreeSet
        Set <Integer> setSorted = new TreeSet<>(set);
        System.out.println(setSorted);


        //------------------------------------------
        List <Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(10);
        list4.add(14);
        list4.add(2);
        list4.add(-5);
        list4.add(10);
        list4.add(4);
        System.out.println(list4);

        // How can you remove duplicates
        // By converting List to Set
        Set <Integer> set2 = new HashSet<>(list4);
        System.out.println(set2);

        // How can you sort the ArrayList and remove duplicates
        Set <Integer> set3 = new TreeSet<>(list4);
        System.out.println(set3);


        System.out.println(new ArrayList<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));
        // We took all the data type numbers and stored it as Array and converted it to be in ArrayList



        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));
        // We took all the data type numbers and stored it as Array and converted it to be in List and converted it into HasSet

        String s = "aaaabbbccccccccddddeee";
        s.split(""); //  ["a", "a", "a"..............]
        System.out.println(Arrays.toString( s.split("")));
        Arrays.asList(s.split("")); // Now we took array and made an ArrayList
        System.out.println(Arrays.asList(s.split("")));
        new HashSet<>(Arrays.asList(s.split("")));
        System.out.println(
                new HashSet<>(Arrays.asList(s.split("")))
                        .toString()
                        .replace(", ", "")
                        .replace("[", "")
                        .replace("]", "")
        );



    }
}




