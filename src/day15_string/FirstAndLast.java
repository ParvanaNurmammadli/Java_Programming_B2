package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Get the first character
        System.out.println("First character: " + sentence.charAt(0));  // "a"  ---- charAt(0); -- > a
        // 0
        // Get the last character
        System.out.println("Last character: " + sentence.charAt( sentence.length() - 1 )); // "a"  ---- charAt(0); -- > a
        // 0   ---- charAt("a".length()-1) -- > 0 -- > "a"

        // If user press enter, we get empty string which is -- > ""; --- > That means there is nt character so there is index.


    }

}