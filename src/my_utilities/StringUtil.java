package my_utilities;



public class StringUtil {

    /**
     * This method reverses the given String.
     *
     * @return reversed version.
     */
    public static String reverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    /**
     * This method is finding how many times given character exist in given String.
     *
     * @return the amount of the existence.
     * Made by @Feyruz.
     */
    public static int frequencyOfCharacters(String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method fixes the format of the given String.
     * Making the first letter upper case and rest in lowercase.
     *
     * @return fixed format.
     */
    public static String fixFormat(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    /**
     * This method checks if given String is palindrome.
     *
     * @return True if it is or False if it is not.
     */
    public static boolean isPalindrome(String word) { // anna

        String reversed = ""; //

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // a + v = av + a = ava + j = avaj
        }

        return word.equals(reversed);
    }
    /**
     * This method check for the unique characters in the given String.
     *
     * @return only the unique characters.
     */
    public static String uniqueCharacters(String str) {

        String uniques = "";

        for (int i = 0; i < str.length(); i++) {

            char eachOuterLetter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char eachInnerLetter = str.charAt(j);

                if (eachOuterLetter == eachInnerLetter) {
                    count++;
                }
            }

            // This condition check if the letter is in the String ONLY 1 time. If TRUE, add it into the new String container called 'uniques'.
            if (count == 1) {
                uniques += ("" + eachOuterLetter); // uniques = uniques + ("" + eachOuterLetter);
            }
        }

        return uniques;
    }
}


