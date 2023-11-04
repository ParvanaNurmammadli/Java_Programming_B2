package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

    /*
        Remove Bad Pairs

        Create a method that will accept an Integer ArrayList and check for good pairs. A pair is an element and th  element next to it.
        A good pair is whenever the first number in the pair is bigger then the second number. Remove any bad pairs for the ArrayList and return the
        ArrayList with good pairs

        Note: The given ArrayList will always be an even number of elements, so each number always has one pair
        @param nums - Given ArrayList of numbers @return - ArrayList of numbers
     */
    public class GoodPair {

//    public static void main(String[] args) {
//        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 7, 8));
//                                                        // elements: 1, 3, 4, 5, 6, 7, 8 --- >  1, 3, 4, 6, 7, 8 -- >  1, 3, 4, 6, 8
//                                                        // indexes:  0  1  2  3  4  5  6 --- >  0  1  2  3  4  5  6 - >0  1  2  3  4  5  6
//        for (int i = 0; i < nums.size(); i++) {                 // i = 0    | i = 1   | i = 2   | i = 3 | i = 4 | i = 5
//
//            //System.out.println( "Each: " +  nums.get(i)  );
//
//            if (nums.get(i) > 4) {                              //  1 > 4   | 3 > 4   | 4 > 4   | 5 > 4  | 7 > 4
//                nums.remove( (Integer)nums.get(i) );            //
//            }
//
//
//        }
//
//        System.out.println(nums);
//
//
//    }

        public static void main(String[] args) {
            ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3,
                    8, 5,
                    6, 7,
                    18, 10));
            ArrayList <Integer> nums2 = new ArrayList<>();

            for (int i = 0; i < nums.size(); i++) {

                if ( nums.get(i) >= 4 ) {
                    nums2.add(nums.get(i));
                }

            }
            System.out.println(nums);
            System.out.println(nums2);


            // TODO:  do the task taking into the consideration the original arrayList size is changeable. So, create another array to handle that



        }

    }



