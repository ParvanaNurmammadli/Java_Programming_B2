package day41_collection.collect;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

    public class SetObjects {
        public static void main(String[] args) {

            Set <String> set = new HashSet<>(); //Reference is Set interface, object is HashSet object
            // Order not Guaranteed, No duplicates, null is accepted.
            set.add(null);
            set.add("hello");
            set.add("$4.5");
            set.add("400");
            set.add("hello"); // Does NOT allow duplicates
            set.add("%");
            set.add(null);
            System.out.println(set);


            Set <String> set2 = new LinkedHashSet<>();
            // Insertion order is kept, No duplicates, null is accepted
            set2.add(null);
            set2.add("hello");
            set2.add("$4.5");
            set2.add("400");
            set2.add("hello"); // Does NOT allow duplicates
            set2.add("%");
            set2.add("400");  // Does NOT allow duplicates
            System.out.println(set2);


            Set <String> set3 = new TreeSet<>();
            // Order is SORTED, No duplicates, null is NOT accepted
            // set3.add(null); // Does not allow null
            set3.add("hello");
            set3.add("$4.5");
            set3.add("400");
            set3.add("hello"); // Does NOT allow duplicates
            set3.add("%");
            set3.add("400");  // Does NOT allow duplicates
            set3.add("WORLD");
            set3.add("Hello");
            System.out.println(set3);









        }
    }


