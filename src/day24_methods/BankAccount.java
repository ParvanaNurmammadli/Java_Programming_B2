package day24_methods;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    /*
        0 - full name
        1 - account type
        2 - account number
        3 - balance
     */
    public static void main(String[] args) {
        // Ask a user to enter how many account there will be
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many account are there: ");
        int numOfAcc = input.nextInt(); // 2
        String [][] allAccounts = new String[ numOfAcc ][4]; //
        System.out.println(Arrays.deepToString(allAccounts)); // [ [null, null, null, null],   [null, null, null, null] ]

        String [] questions = {"Name: ", "Account Type: ", "Account Number: ", "Balance $: "};
        input.nextLine();


        for (int i = 0; i < allAccounts.length; i++) {  // OUTER LOOP: I am going through 2D array

            for (int j = 0; j < allAccounts[i].length; j++) { // 4

                System.out.println(questions[j]);
                allAccounts[i][j] = input.nextLine();  // 00 -- name | 01 --
            }

        }


        System.out.println();
        System.out.println(Arrays.deepToString(allAccounts));
        for ( String [] eachArr : allAccounts){

            System.out.println(Arrays.toString(eachArr));

        }


        System.out.println("--------------------------------------------");
        // The code below is just a smaple makeing a single dimensional array and storing values into it.
        String [] bankAcc1 = {"Tom Jerry", "Saving", "1111-2222-3333", "100,000"};
        System.out.println("Number of elements: " + bankAcc1.length); // 4
        System.out.println("Whole Array: " + Arrays.toString(bankAcc1));
        System.out.println("Name: " + bankAcc1[0]);
        System.out.println("Account Type: " + bankAcc1[1]);
        System.out.println("Account Number: " + bankAcc1[2]);
        System.out.println("Balance $: " + bankAcc1[3]);


    }
}
