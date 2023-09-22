package day11_if_statements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1234
            ssn: 8213

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

            when the pincode was not correct print:
                incorrect pin code

            when the ssn is not correct print:
                invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {

        int myPincode = 1234;
        int mySSN = 8213;


        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to ATM! \n\tPlease, enter your pin-code: ");
        int enteredPincode = input.nextInt();

        System.out.print("\tPlease, enter last 4 digits of your SSN: ");
        int enteredSSN = input.nextInt();

        String message = "";
        if (enteredPincode == myPincode && enteredSSN == mySSN) {
            message = "\n\tAuthentication successful";
            //System.out.println("\n\tAuthentication successful");
        } else {
            message = "\n\tAuthentication failed";
            //System.out.println("\n\tAuthentication failed");

            if (enteredPincode != myPincode) {
                message = message + "\t\tInvalid Pincode";
                //System.out.println("\t\tInvalid Pincode");
            }

            if (enteredSSN != mySSN){
                message =  message + "\t\tInvalid Pincode";
                //System.out.println("\t\tInvalid SSN");
            }
            System.out.println(message);

        }









    }

}