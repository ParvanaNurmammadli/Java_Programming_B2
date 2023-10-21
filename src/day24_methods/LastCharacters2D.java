package day24_methods;

public class LastCharacters2D {

        public static void main(String[] args) {
            String [][] words = {
                    {"Java", "is", "fun"},   // asn
                    {"Softskills", "ehhh"},  // sh
                    {"Loops", "are", "getting", "easier"}  // segr
            };

            //System.out.println(words.length); // 3
            //System.out.println(words[2].length); // 4


            // With Traditional Loop / Fori
            for (int j = 0; j < words.length; j++) {

                for (int i = 0; i < words[j].length; i++) {
                    String eachWord = words[j][i];
                    System.out.print(eachWord.charAt(eachWord.length()-1));
                }
                System.out.println();

            }

            System.out.println("---------------------------------------------");
            // with FOREACH
            for ( String [] eachArr : words) {  // OUTER LOOP: cycling through 2D array, getting each single array

                for ( String eachElement : eachArr) {  // INNER LOOP: cycling through eachArr, getting each String
                    System.out.print(eachElement.charAt(eachElement.length()-1));
                }
                System.out.println();
            }

        }
    }


