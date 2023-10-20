package day_22array;

public class LongestPalindrome {

    /*
            [IQ] Longest Palindrome
                Given a String array. Find the longest Palindrome String in your array.
                Ex:
                Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
                Output: racecar
                Ex:
                Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                Output: No palindrome

 */

        public static void main (String [] args){
            String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
            String longestPalindrome = "";
            // I need to loop through to get each of them
            //      Then reverse
            //      Then compare if them match
            //            Then compare which one is longest


            for (int i = 0; i < arr.length; i++) {   // With this OUTER loop, I am getting each element of the arrays

                String eachWord = arr[i];  // On each cycle, here I am assigning the values of the specific index of array to String eachWord
                String reversed = ""; // On each cycle, I am declaring a new String reversed with and "" -empty value.

                for (int j = eachWord.length()-1; j >= 0 ; j--) { // On each OUT loop cycle, amd also creating a new loop
                    // With thi INNER Loop, I am getting each character of eachWord starting from end
                    reversed += "" + eachWord.charAt(j);      // I am adding each character into this String reversed

                }

                if ( eachWord.equals(reversed) ) {  // On each cycle of OUTER loop, I am comparing if eachWord is equal to the reversed to see if it is POLINDROME
                    if (eachWord.length() > longestPalindrome.length()) {  // If it PALINDROME, I am comparing the length of the longestPalindrome with the eachWord
                        longestPalindrome = eachWord; // if eachWord length is bigger, then re-assign it to the longestPalindrome
                    }

                }
            }

            System.out.println(longestPalindrome);


        }
    }

