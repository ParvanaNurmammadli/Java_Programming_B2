package day08_scanner_logical_operators;

public class OperatorPractise {


        public static void main(String[] args) {
            // int w = 78 / 2 * 2 + 3 - (5) % 5;
            int w = 78 / 2 * 2 + (3) - 5 % 5;
        /*
                39     * 2 + 3 - 5 % 5
                78         + 3 - 5 % 5
                78         + 3 - 0
                81             - 0
                81
         */
            System.out.println(w);
            System.out.println("-------------------");


            int a = 8; // a = 7;
            int b = a--;  // b = 8;
            System.out.println(a); // 7
            System.out.println(b); // 8
            System.out.println("-------------------");


            int l = 50;  // 49, 50, 49, 50
            int p = --l + l++ + l-- + l++;
            //       49 + 49  + 50  + 49 ==== > 197
            System.out.println(l); //50
            System.out.println(p); //197
            System.out.println("-------------------");


            int r = 20; // 19, 20, 19, 18
            int k = -r-- + r++ + --r * r-- % 2;
        /*      -20  + 19  + 19  * 19  % 2
                -20  + 19  +    361    % 2
                -20  + 19  +       1
                   -1      +       1
                   0

         */
            System.out.println(r);
            System.out.println(k);




        }


    }

