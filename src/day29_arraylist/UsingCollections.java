package day29_arraylist;

   import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    public class UsingCollections{
        public static void main(String[] args) {
            ArrayList <Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12) );
            System.out.println("Original: " + list);

            //sort()
            Collections.sort(list);
            System.out.println("Sorted: " + list);

            //reverse()
            Collections.reverse(list);
            System.out.println("Reversed: " +list );

            System.out.println("------------");
            ArrayList <Character> letters = new ArrayList<>( Arrays.asList( 'A', 'B', 'C', 'D'));
            System.out.println(letters);
            Collections.reverse(letters);
            System.out.println(letters);


            //max() and min()
            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));


            // swap()
            System.out.println("------");
            Collections.swap(letters, 0, 3);
            System.out.println(letters);

            System.out.println("---------------------------");
            //
            ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 2, 34, 5, 7, 11));
            System.out.println(      Collections.frequency( numbers, 11  )          );

            ArrayList <String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "two", "four"));
            System.out.println(     Collections.frequency( words,  "one"  )      );
            System.out.println(     Collections.frequency( words,  "two"  )      );

        }
    }


