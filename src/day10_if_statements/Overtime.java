package day10_if_statements;

import java.util.Scanner;

public class Overtime {
    /*

    create a double variable for your hourly rate
    create a double variable for the number of hours worked

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("How many hours you worked: ");
        double numHours = input.nextDouble();
        double netPay;
        double overtimeHours;
        String message;

        /*
            if numHours > 40 {
                overtimeHours = numHours - 40;  // 42 -40
                netPay = (hourlyRate * 40)  + (overtimeHours * hourlyRate * 1.5);  //
                message = You worked 42 hours at a rate of $60, but 2 of the hours were overtime, so you got an additional pay for those hours. Your net pay is $netPay

           }else {
                netPay = (hourlyRate * numHours);  //
                message = You worked 42 hours at a rate of $60, but 2 of the hours were overtime, so you got an additional pay for those hours. Your net pay is $netPay
            }
            System.out.print(message)

         */
        if (numHours > 40) {
            overtimeHours = numHours - 40;
            netPay = (hourlyRate * 40)  + (overtimeHours * hourlyRate * 1.5);
            message = "You worked "  + numHours + " hours at a rate of $" + hourlyRate + ", but " + overtimeHours + " of the hours were overtime, so you got an additional pay for those hours. Your net pay is $" + netPay;
        } else {
            netPay = (hourlyRate * numHours);
            message = "You worked "  + numHours + " hours at a rate of $" + hourlyRate + " Your net pay is $" + netPay;
        }


        System.out.println(message);



    }}




