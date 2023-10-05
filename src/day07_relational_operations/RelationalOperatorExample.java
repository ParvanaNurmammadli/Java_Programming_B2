package day07_relational_operations;



    public class RelationalOperatorExample {

        public static void main (String []  args) {
            System.out.println(10 > 5);  // true
            System.out.println(10 < 5);  // false

            int a = 5;
            int b = 3;

            System.out.println(a > b); // true
            System.out.println(a < b); // false

            boolean result1 = a > b;
            System.out.println(result1); // true
            boolean result2 = a < b;
            System.out.println(result2);  // false


            System.out.println(6 >= 6); // true
            System.out.println(10 == 10); // true
            System.out.println(12 != 12);  // false

            System.out.println(a == b); //  false

            System.out.println('f' == 'g'); // false - here we are comparing the ASCII table numbers of the characters
            System.out.println('f' == 'f');





        }
    }

