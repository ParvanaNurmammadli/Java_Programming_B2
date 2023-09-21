package day10_if_statements;

import java.util.Scanner;

public class BiggestNumber {
    /*

    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");


        int num1 = scan.nextInt();  // num1 >= num2 and num1 > num3
        int num2 = scan.nextInt();  // num2 > num1 and num2 > num3
        int num3 = scan.nextInt();  // num3 > num1 and num3 > num2


        if(num1 >= num2 && num1 >= num3){   // if num1 is bigger than other two, print ....
            System.out.println(num1 + " is the biggest one");
        } else if (num2 >= num1 && num2 >= num3) {  // if num2 is bigger than other two, print.....
            System.out.println(num2 + " is the biggest one");
        } else  {
            System.out.println(num3 + " is the biggest one");
        }


    }
}
