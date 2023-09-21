package day10_if_statements;

public class DayOfWeek {
    /*
            Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday
     */
    public static void main(String[] args) {
        int day = 8;

        // Until the FIRST TRUE condition is reached, the rest will be skipped
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not valid number of week day");
        }

        System.out.println("---------------");

        // Since we have multi SINGLE IF statement, no matter of the condition of each if statement, every single one will be checked separately
        if (day == 1) {
            System.out.println("Monday");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        }

        if (day == 3) {
            System.out.println("Wednesday");
        }

        if (day == 4) {
            System.out.println("Thursday");
        }

        if (day == 5) {
            System.out.println("Friday");
        }

        if (day == 6) {
            System.out.println("Saturday");
        }

        if (day == 7) {
            System.out.println("Sunday");
        }


        System.out.println("----------------");

        // The code below is multiple IF-ELSE statements.
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not valid number of week day");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Not valid number of week day");
        }

    }

}
