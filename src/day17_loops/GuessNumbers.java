package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 77;
        int guessedNumber;

        do{
            System.out.print ("Guess a number from 1 - 100: ");
            guessedNumber = input.nextInt();

            if(guessedNumber > secretNumber) {  // 90 > 77 ---- >
                System.out.println(guessedNumber + " is too high. Try again");
            } else if (guessedNumber < secretNumber) {
                System.out.println(guessedNumber + " is too low. Try again");
            }



        } while (guessedNumber != secretNumber); // 20 != 77 --- > true | 77 != 77


        System.out.println("You guessed it correct");

    }
}