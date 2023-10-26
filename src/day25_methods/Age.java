package day25_methods;




    import java.util.Scanner;

    /*
        make a method that calculates age and prints it
        take the birth year as parameter
     */
    public class Age {

        // age, calculateAge, getAge
        public static void getAge (int year) {

            // Can you handle if user gives you something invalid - anything more than 2023
            if (year > 2023) {
                System.out.println("You have born yet");
            } else {
                System.out.println("Your age is " + (2023 - year) );
            }
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your birth year: ");
            int birthYear = input.nextInt();

            getAge(birthYear);

        }

    }

