
package day11_if_statements;

import java.sql.SQLOutput;

        public class Diver {
            /*
            create a class Diver

            You are diving in the ocean. Your oxygen tank has a certain level (number)

            declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

                Above 90 - Your tank is full
                Above 80 - Still okay
                Above 70 - Don't go too far
                Above 60 - Start to head back
                Above 50 - Be careful now you at at 50%
             */
            public static void main(String[] args) {
                int oxygenLevel = 85;

                if (oxygenLevel > 90) {
                    System.out.println("Your tank is full");
                } else if (oxygenLevel > 80) {
                    System.out.println("Still okay");
                } else if (oxygenLevel > 70) {
                    System.out.println("Don't go too far");
                } else if (oxygenLevel > 60) {
                    System.out.println("Start to head back");
                } else if (oxygenLevel > 50) {
                    System.out.println("Be careful now you at at 50%");
                } else {
                    System.out.println("You were a good. Rest in peace. BYE BYE");
                }

                System.out.println("------------------------------------------");

                // Besides the relation between the condition, we also HAVE TO CHECK HOW THE ORDER OF THE CONDITIONS HAVE TO BE
                oxygenLevel = 75;
                if (oxygenLevel > 50) {
                    System.out.println("Your tank is full");
                } else if (oxygenLevel > 60) {
                    System.out.println("Still okay");
                } else if (oxygenLevel > 70) {
                    System.out.println("Don't go too far");
                } else if (oxygenLevel > 80) {
                    System.out.println("Start to head back");
                } else if (oxygenLevel > 90) {
                    System.out.println("Be careful now you at at 50%");
                } else {
                    System.out.println("You were a good. Rest in peace. BYE BYE");
                }

                System.out.println("------------------------------------------");

                oxygenLevel = 40;
                String message = "";
                if (oxygenLevel > 90) {
                    message = "Your tank is full";
                } else if (oxygenLevel > 80) {
                    message = "Still okay";
                } else if (oxygenLevel > 70) {
                    message = "Don't go too far";
                } else if (oxygenLevel > 60) {
                    message = "Start to head back";
                } else if (oxygenLevel > 50) {
                    message = "Be careful now you at at 50%";
                } else {
                    message = "You were a good. Rest in peace. BYE BYE";
                }

                System.out.println(message);


            }
        }
