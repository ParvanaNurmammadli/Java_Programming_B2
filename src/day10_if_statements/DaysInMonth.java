package day10_if_statements;

public class DaysInMonth {
    /*
        31 Days --- > 1, 3, 5, 7, 8, 10, 12
        30 Days --- > 4, 6, 9, 11
        28 Days --- > 2,
     */
    public static void main(String[] args) {

        int month = 1; // 1- January

        boolean is31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean is30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean is28 = month == 2;

        if (is31) {
            System.out.println("This month has 31 days");
        }

        if (is30) {
            System.out.println("This month has 30 days");
        }

        if (is28) {
            System.out.println("This month ahs 28 days");
        }


        System.out.println("------------------------------");

        if (is31) {
            System.out.println("This month has 31 days");
        } else if (is30) {
            System.out.println("This month has 30 days");
        } else if (is28) {
            System.out.println("This month ahs 28 days");
        }
        System.out.println("*********************************");




        char letter = 'a';
        if (letter == 'a') {
            System.out.println("hello");
        }

        if (letter == 'a') {
            System.out.println("Bye");
        }
        System.out.println("------------------------------");

        if (letter == 'a') {
            System.out.println("Hello2");
        } else if (letter == 'a') {
            System.out.println("Bye");
        }



        System.out.println("*********************************");
        int num = 0;

        // The if conditions will be checked until the first true if statement is found, and the rest will skipped if there is any
        if (num > 3) {
            System.out.println("Bigger than 1");
        } else if (num > 2) {
            System.out.println("Bigger than 2");
        } else if (num > 1) {
            System.out.println("Bigger than 3");
        }





    }



}