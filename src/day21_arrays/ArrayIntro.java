package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {



        public static void main(String[] args) {

            // With Normal String variable declaration.
            String cityOne = "Fairfax";
            String cityTwo = "Baku";
            String cityThree = "Houston";
            String cityFour = "Seattle";


            // With data Structure --- > Array
            String [] cities = {"Fairfax", "Baku", "Houston", "Seattle"};
            String [] cities2 = {cityOne, cityTwo, cityThree, cityFour };
            // Indexes:             0         1        2          3


            // How can you reach each value from array?
            System.out.println(cities2[0]);
            System.out.println(cities2[1]);
            System.out.println(cities2[2]);
            System.out.println(cities2[3]);

            System.out.println("All cities: " + cities2[0] + ", " + cities2[1] + ", " + cities2[2] + ", " + cities2[3]) ;

            //System.out.println(cities2[4]);  // Since we do not have the 4th index, it will give an EXCEPTION: ArrayIndexOutOfBoundsException


            // How to print an Array
            System.out.println(cities2); // This does not print the array how we want. It just shows the hashcode
            System.out.println(Arrays.toString(cities2)); // .toString(arrayName) from Arrays class, lets us to print the array fully with [ ]


            // How to get the count of the elements in the array
            // Similar to String we have a method for that. --- > String str = "loop"; --- > str.length()
            System.out.println(cities2.length);


            System.out.println(cities2[1].substring(0, 2));  // Ba


            System.out.println("" + Arrays.toString(cities2).charAt(0));  // [

        }
    }



