package day09_a__scanner;
import java.util.Scanner;

public class Angels {
    /*
          Write a program that asks the user to enter 3 angle numbers ( can be floating numbers/decimal )
          Determine if the angles make a triangle, which means the angles add to 180.0
          and
          Determine if the angles make a circle, which means the angles add to 360.0
       */
    public static void main(String[] args) {
        System.out.println("Enter three angle degree/number: ");

        Scanner input = new Scanner(System.in);
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double total = angleOne + angleTwo + angleThree;

        boolean isTriangle = total == 180;
        boolean isCircle = total == 360;

        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);



        /*
          if the number is divisable by 2

          13 -- ?

          13 / 2 = 6
          13 % 2 = 1 == 0

         */


    }


}





