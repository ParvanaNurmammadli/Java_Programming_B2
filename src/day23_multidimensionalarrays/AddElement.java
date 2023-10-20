package day23_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;
/*
    Ask a user: How many elements do you want to have in an array?
    I need to make an array with that size
    Now ask a user to enter the values for each element
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to have in an array? ");
        int size = input.nextInt(); // 5

        int [] arr = new int[size];  // I made a new array with size that user gave

        for (int i = 0; i < arr.length; i++) {
            System.out.println ("Enter Value for index of " + i + ": ");
            arr [i] = input.nextInt();
        }

        System.out.println("Array so far: " + Arrays.toString(arr));

        // Add one more element which is 100 to the elements that user gave
        int [] arr2 = Arrays.copyOf(arr, arr.length+1);   // size of new array: whatEverUserGave make 1 more
        arr2[arr2.length-1] = 100;  //
        System.out.println("New arr with addition: " + Arrays.toString(arr2));


        // Do not add only 100 - ask a user how many new numbers they want to add: 5
        //      int newAdd = input.nextInt();
        // Make new array with that size
        //       int [] arr3 = Arrays.copyOf(arr, arr.length+newAdd);
        // ask user to enter new values for those added indexes
    }
}
