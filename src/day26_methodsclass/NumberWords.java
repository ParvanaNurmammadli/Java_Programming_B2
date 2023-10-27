package day26_methodsclass;

public class NumberWords {



        // Return the correct word for the given number (numbers should be only 1 - 10)
        public static String numberAsWord (int num) {

            String [] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
            //                   0      1       2        3        4      5       6       7        8      9

            if ( num >= 1 && num <= 10) {
                return words [num-1];
            } else {
                return "Not valid number";
            }

        }

        public static void main(String[] args) {

            System.out.println(numberAsWord(11));
            System.out.println(numberAsWord(-1));
            System.out.println(numberAsWord(7));

        }

    }

