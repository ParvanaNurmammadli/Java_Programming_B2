package day30_a_arraylist;



    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    /*
        Given an ArrayList of words switch position for each pair in the List.
        A pair is an element and the element next to it.
        The given ArrayList will always have an even number of elements so each element will always have a single pair

        Ex:
        Input:
            {"Cat", "in", "the", "hat"}

                There is two pairs:
                    "Cat" and "in"
                    "the" and "hat"
        Output:
            {"in", "Cat", "hat", "the”}
     */
    public class SwitchPairs {

        public static void main(String[] args) {

            ArrayList <String> words = new ArrayList<>(Arrays.asList( "Cat", "in",
                    "the", "hat",
                    "apple", "water")  );


            System.out.println("Original: " + words);
            for (int i = 0; i < words.size(); i+=2) {

                Collections.swap(words, i, (i + 1) );

                //TODO:  can you do this using a .set()
                // HINT: thing about swapping 2 int numbers

            }

            System.out.println("After Swap: " + words);

        }

    }

