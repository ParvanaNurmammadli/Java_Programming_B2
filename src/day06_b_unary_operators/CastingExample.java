package day06_b_unary_operators;

public class CastingExample {

        public static void main(String[] args) {

            short numOne = 40;
            float numTwo = numOne; // short is smaller than float, so implicit casting happens.
            System.out.println(numOne);
            System.out.println(numTwo);
            System.out.println();


            float num3 = 100.5F;
            short num4 = (short)num3;  // float is bigger, so we must EXPLICITLY CAST it.NARROWING CASTING
            System.out.println(num3);
            System.out.println(num4);
            System.out.println();

            float num5 = 300;
            byte num6 = (byte)num5;
            short num7 = (short)num5;
            System.out.println(num5);  //300.0
            System.out.println(num6);  // range -128 ---> 127
            System.out.println(num7);  // range
            System.out.println();


            char letter = 'A';
            int letterInt = letter;
            System.out.println(letter);
            System.out.println(letterInt);

            System.out.println( (int) letter);

            int let2= 66;
            char let3 = (char)let2;
            System.out.println(let3);
            System.out.println((char)66);  // this is the same thing as above, But we directly casted it in the print statement.

            System.out.println((int)'&');


        }
    }

