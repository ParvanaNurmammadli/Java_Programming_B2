package day12_switch_statement;

public class NumberWords {
    public static void main(String[] args) {

        int n = 2; // Number must be between 1 and 5 (inclusive)

        // elf-if statement ---- Number must be between 1 and 5 (inclusive)
        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number");
        }
        System.out.println("----------------------");


        // switch statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
//            case 1:   // Exact values CANNOT be duplicate - this will give COMPILE ERROR
//                System.out.println("Two");
//                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
                break;
            case 4:
                System.out.println("Four");
                break;
        }



        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
                break;
        }



        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
        }




        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 2:
            case 3:  // in if statement: ---- >  if (n == 1) {
                System.out.println("ONumber is equal ot 2 or 3");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
        }
    }

}


