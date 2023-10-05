package day09_a__scanner;


public class IfElseExample {
    /*
        int score = 60;
        if (score >= 75){  // false
            System.out.println("You passed the exam!");
        }

        if (score < 75) {  // true
            System.out.println("You failed!");
        }
     */
    public static void main(String[] args) {

        int score = 60;

        if (score >= 75) {  // check if this line TRUE, execute the if body,

            System.out.println("Passing!");

        } else {
            System.out.println("Failing!");
        }





        /*
                int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        }

        // any single if statement does NOT depend on another statement
        if (!isLockdown) {
            System.out.println("Party");
            System.out.println("This is not a normal party. It is a Java Party");
            System.out.println("Travel");
        }
         */
        System.out.println();
        int year = 2024;
        boolean isLockdown = year == 2020 || year == 2021;

        //  false
        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        }else {
            System.out.println("Party");
            System.out.println("This is not a normal party. It is a Java Party");
            System.out.println("Travel");
        }

    }

}

