package day18_loops;

public class RemoveDuplicates {
    /*
    intput: abcabcd
    output: abcd
 */

        public static void main(String[] args) {

            String original = "abcabcabd";
            String unique = "";

        /*
            loop through to get each character
                put that character into another container if that container does not have it
         */

            for (int i = 0; i < original.length(); i++) {
                if (!unique.contains("" + original.charAt(i))) {
                    unique += original.charAt(i);
                }
            }

            System.out.println("With duplicates: " + original);
            System.out.println("With NO duplicates: " + unique);



        }
    }

