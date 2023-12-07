package day42_maps.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList <Integer> list =  new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5 ));


        // traditional fori loop - > removing element starting from beginning is not good, because it works with indexes and once the element is removed all other elements shifts to left
        // this causes to skip some elements in the collention.
        /*
            for (int i = 0; i < list.size(); i++) {                // [3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5 ]
                if (list.get(i) < 5) {
                    list.remove(i);
                }
                //System.out.println(list.get(i));
            }
            System.out.println(list);
         */

        System.out.println();

        // for each loop -- > this will through the exception ---  > ConcurrentModificationException
        // We cannot chang the size of the ArrayList/Collection while looping through it with foreach loop
        /*
            for ( Integer each : list) {

                if (each < 5) {
                    list.remove(each);
                }

            }
            System.out.println(list);
         */


        System.out.println(list);

        // But how can I remove the element with Collection?
        Iterator <Integer> it = list.iterator();
        while ( it.hasNext()) { //checks if there is an element next to it. If not the loop stops
            if( it.next() < 5){  // move to the next element and the return it
                it.remove(); // remove from the list if condition is true
            }
        }
        System.out.println(list);

        list.removeIf(each -> (each < 5));


        // [ 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5]


    }
}