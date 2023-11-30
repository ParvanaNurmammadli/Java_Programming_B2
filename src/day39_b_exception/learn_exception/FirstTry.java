package day39_b_exception.learn_exception;

import java.util.Scanner;

    public class FirstTry {
        public static void main(String[] args) {

            System.out.println("First Line");

            try {
                //Scanner input = new Scanner(System.in);
                //String word = input.next();
                String word = "word";
                System.out.println(word.charAt(4));
            } catch (Exception e) {
                System.out.println("Exception message: Exception Happened. Come back and check");
                e.printStackTrace();
                //System.out.println(e.getMessage());
            }

            System.out.println("Last Line");

        }
    }

