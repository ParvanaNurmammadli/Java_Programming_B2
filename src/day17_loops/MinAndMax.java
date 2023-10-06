package day17_loops;
 /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */

import java.util.Map;
import java.util.Scanner;

/*
    repeated steps:

        ask for a number

        check is it the biggest

        check is it the smallest


 */
public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // userInput = 2, -1, -40, -30, -100

        int highest = -2147483648; // The reason I gave the smallest value to the 'highest' container is because if user gives me bigger value than what it is now, so, I can re-assign it
        int lowest = 2147483647;  // The reason I gave the biggest value to the 'lowest' container is because if user gives me smalled value than what it is now, so, I can re-assign it
        /*
            if userInput > highest --- > { highest = userInput } ---- >  highest = 100 | 100 | 100
            if userInput < lowest ---- > { lowest = userInput }  ---- >  lowest = 10  |  10  | 5
         */

        int counter = 1;

        while (counter <= 5) {

            System.out.print("Enter number: ");
            int userNumber = input.nextInt();

            if (userNumber > highest) {
                highest = userNumber;
            }

            if (userNumber < lowest){
                lowest = userNumber;
            }

            counter++;

        }

        System.out.println("Max: " + highest);
        System.out.println("Min: " + lowest);



    }

}
