package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {

/*
    Ask a user to enter a month number, then print the Name of that months
        Input:  1
        Output: January
 */




        public static void main(String[] args) {

            String [] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            //        //              0        1           2        3        4      5       6       7        8            9          10            11
            System.out.println(months.length); //  12
            System.out.println(Arrays.toString(months));


            Scanner input = new Scanner(System.in);
            System.out.print("Enter number that represents the month: ");
            int userNum = input.nextInt();  // 12


            if (userNum >= 1 && userNum <= 12){

                System.out.println(months[userNum - 1]);

            } else {
                System.out.println("Sorry, invalid input");
            }






        }
    }

