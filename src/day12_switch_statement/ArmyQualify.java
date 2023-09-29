package day12_switch_statement;

import java.util.Scanner;

/*
    Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

        - The person must be a citizen or a resident
                    - Their age must be between 18 and 35
                        -> If not print: Your age must be between 18 to 35 years old (inclusive)
                    - They must have a high school diploma
                        -> If not print: You must have a high school diploma

                    > If all the criteria is met print: You are qualified for the Army

        - If not print: You must be a citizen or a resident
 */
public class ArmyQualify {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you a citizen? true/false: ");
        boolean isCitizen = input.nextBoolean();
        System.out.print("Are you a resident? true/false: ");
        boolean isResident = input.nextBoolean();
        System.out.print("Do you have a high school diploma? true/false: ");
        boolean hasDiploma = input.nextBoolean();
        System.out.print("How old are you? ");
        int age = input.nextInt();


        if (isCitizen || isResident) {
            System.out.println("You passed first qualification");

            if (age >= 18 && age <= 35) {
                System.out.println("You passed 2nd qualification as well.");


                if (hasDiploma) {
                    System.out.println("You have passed final qualification. Congrats!");
                } else {
                    System.out.println("You must have a diploma.");
                }



            } else {
                System.out.println("You must be between 18 and 35 years old");
            }








        } else {
            System.out.println("You must be a citizen or resident");
        }


    }


}