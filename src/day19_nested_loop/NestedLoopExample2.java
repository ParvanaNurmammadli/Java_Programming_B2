package day19_nested_loop;

public class NestedLoopExample2 {


        public static void main(String[] args) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe");

            for (int i = 0; i < 5 ; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe");

            for (int i = 0; i < 5 ; i++) {
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe");


            System.out.println("------------------------------");


            for (int i = 1; i <= 3; i++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println("Hello World");
                }
                System.out.println("Hello Universe");

            }

        }
    }

