package day30_a_arraylist;


     import java.util.ArrayList;
import java.util.Arrays;

    /*
        Remove Long Strings
        Create a method that will accept an ArrayList of Strings and an int.

        Remove any String elements that have less characters than the given number.

        Return the modified ArrayList of Strings
        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings

        Ex: {“one”, “two”, “three, “four”, “five”, “six”} Max number: 4
        Output: {“three, “four”, “five”
     */
    public class RemoveLongString {

        public static ArrayList <String> removeLongString (ArrayList <String> list, int maxLength ) {

            ArrayList <String> updateList = new ArrayList<>(list);

            updateList.removeIf(  each -> (each.length() >  maxLength)  );

            return updateList;
        }


        public static void main(String[] args) {
            ArrayList <String> list = new ArrayList<>(Arrays.asList( "one", "two", "three", "four", "five", "six"));
            System.out.println("Original: " + list);
            System.out.println( "After update: " +    removeLongString(list, 4)) ;

        }


    }

