package day16_loops;

/*
	Given a String, write a program to display the middle character of a string
	a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
*/

public class MiddleChar {

    public static void main(String[] args) {
        /*
           java ---- > av
           apple --- > p

     */
        String str = "abcdefhij";
        //            01234567

        int mid = str.length() / 2;         // ---- >     8 / 2 --- ? 4

    /*
        if string is even
            take middle 2
        if string is not even
            take middle 1
     */

        if(str.length() % 2 == 0) {  // if the length of the String is even.
            char firstMiddleChar = str.charAt(mid - 1); //             char firstMiddleChar = str.charAt(str.length() / 2 - 1);

            char secondMiddleChar = str.charAt(mid);
            System.out.println("Middle chars: " + firstMiddleChar + secondMiddleChar);
            System.out.println("Middle chars with substring method: " + str.substring(mid-1, mid + 1) );

        } else {
            // abcde -- > 5 / 2 -- > 2
            // 01234
            char middle = str.charAt(mid);
            System.out.println("Middle char: " + middle);
            System.out.println("Middle char with substring method: " + str.substring(mid, mid +1) );


        }





    }




}