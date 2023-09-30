package day15_string;

import java.util.Scanner;

/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.next().toUpperCase();
        System.out.print("Enter last name: ");
        String lastName = input.next().toUpperCase();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0); // 'j' + 'b' --> number + number

        // You can apply .toUpperCase here as well.
        System.out.println("Your initial: " + initials.toUpperCase());
    }

}
