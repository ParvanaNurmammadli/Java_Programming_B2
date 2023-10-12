package day19_nested_loop;

public class BiggestString {
    /*
    Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddee Output: ccccc
 */

        public static void main(String[] args) {
            //Find the longest same characters
        /*
            loop through and get each character
                store that into a new String --  aaa
         */

            String str = "aaabbbcccddddeeee"; // abcd
            //            0123456789.......
            String sub = "";  // default initial value
            String biggest = "";

            for (int i = 0; i < str.length()-1; i++) {

                sub += str.charAt(i);  // sub = "aaa"; --- >  sub = "bbb";

                if ( str.charAt(i) != str.charAt(i+1)) {



                    if (biggest.length() < sub.length() ) {
                        biggest = sub;  // aaa  --  bbb
                    }

                    sub = "";

                }



            }

            System.out.println(biggest);



        /*
            This is in case we have the longest at the end.
            We can apply the if condition, but need to check where in execution to put

            if (i == str.length()-2){
              if(biggest.contains("" + str.charAt(str.length()-1))) {
                biggest+=str.charAt(str.length()-1);
              }
            }
         */

        }




    }

