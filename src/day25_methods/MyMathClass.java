package day25_methods;


    public class MyMathClass {

        public static void add (int num1, int num2) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }

        public static void subtract (int num1, int num2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }

        public static void multiply (int num1, int num2) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }


        public static void divide (int num1, int num2) {
            // you can handle the divisible by 0 error with if condition
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

        public static void main(String[] args) {
            add( 4, 5);
            subtract(3, 7);
            multiply(2, 8);
            divide(4, 5);
            // divide(4, 0);

        }


    }

