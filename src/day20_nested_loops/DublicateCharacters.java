package day20_nested_loops;

public class DublicateCharacters {
    public static void main(String[] args) {
        String str = "AABXXDEEF"; // AXE
        String str2 = "AABXXDEEF";
        // if the character is in the String 2 or more times.

        String duplicates = "";


        for (int i = 0; i < str.length(); i++) {      // A
            char eachOuterLetter = str.charAt(i);
            int count = 0;

            if (duplicates.contains("" + eachOuterLetter)) {
                continue;
            }

            for (int j = 0; j < str2.length(); j++) {
                char eachInnerLetter = str2.charAt(j);   // A
                if (eachOuterLetter == eachInnerLetter) {
                    count++;
                }
            }

            if (count > 1) {
                duplicates = duplicates + eachOuterLetter;
            }


        }


        System.out.println(duplicates);

    }

}


