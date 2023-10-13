package day20_nested_loops;
import java.util.Scanner;
public class FinRaInRange {


    /*
        Similar to FizzBuzz

        number
            % 3 --> fin
            % 5 --> ra
            both --> finra
            neither --> number

        repeated up to some number

     */

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            // 12


            for (int i = 1; i <= num; i++) {
                String result = "";

                if (i % 3 == 0) {
                    result += "fin";
                }

                if ( i % 5 == 0) {
                    result += "ra";
                }


                System.out.println(result.isEmpty() ? i : result);



            }




        }

    }

