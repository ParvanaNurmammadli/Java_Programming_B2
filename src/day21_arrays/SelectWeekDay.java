package day21_arrays;
import java.util.Scanner;
public class SelectWeekDay {




        public static void main(String[] args) {
            String [] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            //                        0        1            2            3         4          5          6

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number that represents a week day: ");

            int userNum = input.nextInt();


            if (userNum >= 1 && userNum <= 7){

                System.out.println(weekDays[userNum - 1]);

            } else {
                System.out.println("Sorry, invalid input");
            }


            // Ask a user to enter the valid input until it is actually valid.
        }
    }

