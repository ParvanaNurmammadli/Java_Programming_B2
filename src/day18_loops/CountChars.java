package day18_loops;



    /*
       input: 2juMp41EEkd4s4

       output
            3 uppercase
            6 lowercase
            5 numbers

 */
    public class CountChars {
        public static void main(String[] args) {
        /*
            loop through all the characters
              get each character
                - if character is uppercase -- > increase count for uppercase
                - if character is lowercase -- > increase count for lowercase
                - if character is number ----- > increase count for numbers
         */
            String str = "2juMp41EEkd4s466&&";
            int countUpper = 0;
            int countLower = 0;
            int countNum = 0;
            int countSpecial = 0;

            for (int i = 0; i < str.length(); i++) {

                char eachLetter = str.charAt(i); // get the character at the index number i

                //if character is uppercase -- eachLetter >= 'A' && eachLetter <= 'Z'
                if (eachLetter >= 'A' && eachLetter <= 'Z'){
                    countUpper++;
                } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                    countLower++;
                } else if (eachLetter >= '0' && eachLetter <= '9') {
                    countNum++;
                } else {
                    countSpecial++;
                }

            }

            // THe purpose of the loop was to check every character and see if it is uppercase, lowercase, number or special character.
            // Once the loop finished, then I am printing out the updated counters for each.


            System.out.println("Uppercase character count: " + countUpper);
            System.out.println("Lowercase character count: " + countLower);
            System.out.println("Number character count: " + countNum);
            System.out.println("Special character count: " + countSpecial);


            System.out.println("--------------------------------------");


            // Here we used Character class which has some reusable methods to check if it is UPPER case or LOWER case or DIGIT
            // Also, we did not declare new variables to count it, so, that is why on the print out, it shows doubled.
            for (int i = 0; i < str.length(); i++) {

                char eachLetter = str.charAt(i); // get the character at the index number i

                //if character is uppercase -- eachLetter >= 'A' && eachLetter <= 'Z'
                if (Character.isUpperCase(str.charAt(i))){
                    countUpper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                } else if (Character.isDigit(str.charAt(i))) {
                    countNum++;
                } else {
                    countSpecial++;
                }

            }

            System.out.println("Uppercase character count: " + countUpper);
            System.out.println("Lowercase character count: " + countLower);
            System.out.println("Number character count: " + countNum);
            System.out.println("Special character count: " + countSpecial);




        }

    }

