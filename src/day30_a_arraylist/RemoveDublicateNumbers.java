package day30_a_arraylist;



    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

    /*
        Remove Duplicates

        Create a method that will take an ArrayList of numbers and remove any duplicates values.
        The method will return an ArrayList of unique elements.
        @param nums - The given ArrayList of numbers @return - ArrayList of numbers
        Ex:
        Input:
            {1, 3, 5, 1, 4, 5, 9};
        Output:
            {3, 4, 9};
     */
    public class RemoveDublicateNumbers {

        public static ArrayList <Integer> removeDuplicates (ArrayList <Integer> nums) {
            ArrayList <Integer> uniques = new ArrayList<>(nums);
            uniques.removeIf(  each ->  Collections.frequency(uniques, each) > 1 );
            return uniques;
        }

        public static void main(String[] args) {
            ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9 ));
            System.out.println("Original " + nums);
            System.out.println("Uniques: " + removeDuplicates(nums));
        }
    }

