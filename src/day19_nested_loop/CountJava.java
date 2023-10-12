package day19_nested_loop;

public class CountJava {




        /**
         * This is the another way to count words in String
         * This time we used fori loop and some string methods
         * Made by: @yourName
         */
        public static void main(String[] args) {

            String str = "java is a java language java"; // length - > 23
            //            0123456789............22-23
            System.out.println(str.length());
            //
            int counter = 0;
            //           22
            for (int i = 0; i < str.length()-3; i++) {
                //                              22, 22 + 4
                String everyFour = str.substring(i, i + 4);   // java  --- first cycle --- > i = 0 - str.substring(0, 0 + 4)

                if (everyFour.equals("java")){
                    counter++;
                }

            }

            System.out.println(counter);




        }

    }