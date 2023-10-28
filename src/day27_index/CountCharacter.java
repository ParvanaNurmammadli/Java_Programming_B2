package day27_index;

public class CountCharacter {

    public class CountCharacters {

    /*
        "sef23LENF#$234sdf"
     */

        public static void main(String[] args) {
            String str ="sef23LENF#$234sdf";
            int upperCount = 0;
            int lowerCount = 0;
            int digit = 0;
            int others =0;

            for (int i = 0; i < str.length(); i++) {

                char eachLetter = str.charAt(i);

                if (Character.isUpperCase(eachLetter)) {
                    upperCount++;
                } else if (Character.isLowerCase(eachLetter)) {
                    lowerCount++;
                } else if (Character.isDigit(eachLetter)) {
                    digit++;
                } else {
                    others++;
                }

            }

            System.out.println(upperCount);
            System.out.println(lowerCount);
            System.out.println(digit);
            System.out.println(others);
        }

    }
}
