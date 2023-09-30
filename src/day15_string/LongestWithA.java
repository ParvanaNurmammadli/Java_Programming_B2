package day15_string;

import java.util.Scanner;

/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");

        String wordOne = input.next();  // java
        String wordTwo = input.next();  // mouse
        String wordThree = input.next();// computer


        int wordOneLength =  wordOne.length();  // 4
        int wordTwoLength =  wordTwo.length();   // 5
        int wordThreeLength =  wordThree.length(); // 8


        /*
            if myWord contains "a" AND the length of String of that word is the biggest
         */
        String message = "";


        //This will find if the longest one and then check if a has "a" in it
        if (wordOne.contains("a") && wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength) {
            message = "Your longest word with 'a' is: " + wordOne;

        } else if (wordTwo.contains("a") && wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
            message = "Your longest word with 'a' is: " + wordTwo;

        } else if (wordThree.contains("a") && wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength) {
            message = "Your longest word with 'a' is: " + wordThree;
        } else {
            message = "Our longest does not have \"a\"";
        }

        System.out.println(message);



        // java --- mouse --- computer
        // Find word which has a and it is the longest one with the other a
        // first we can find if each word has a
        // then compare the length

        // java
        // mousea
        // computer
        System.out.println("-----------------------");


        //This way we are finding the words with "a" if no a the size is 0
        if (!wordOne.contains("a")) {
            wordOne = "";
            wordOneLength =  wordOne.length();  // 4
        }
        if (!wordTwo.contains("a")) {
            wordTwo = ""; // mouse  --- 5 --- wordTwo --- > 0;
            wordTwoLength =  wordTwo.length();   // 0
        }
        if (!wordThree.contains("a")){
            wordThree ="";
            wordThreeLength =  wordThree.length(); // 0
        }


        if (wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength) {
            message = "The longest with a: " + wordOne;
        } else if (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
            message = "The longest with a: " + wordTwo;
        } else if (wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength) {
            message = "The longest with a: " + wordThree;
        }
        System.out.println(message);


    }
}
