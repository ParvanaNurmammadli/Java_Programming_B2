package day26_methodsclass;



    /*
    Create a method that accepts a string and a character
    Then check how many times that character appears in that String
    Then return total number of times.
    Ex:    apple, p -- > 2
    Ex:    apple, c -- > 0
 */
    public class FrequencyOfCharacters {


        public static void main(String[] args) {
            System.out.println( frequencyOfCharacters("apple", 'p') );
            System.out.println( frequencyOfCharacters("apple", 'm') );
        }


        public static int frequencyOfCharacters (String word, char letter) {
            int count = 0;

            for (int i = 0; i < word.length(); i++) {

                if ( word.charAt(i) == letter) {
                    count++;
                }

            }

            return count;
        }


    }

