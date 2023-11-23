package day22_array;

public class ReverseSentences {


    /*
        today is java

        java is today
 */
    public class ReverseSentence {
        public static void main(String[] args) {

            String sentence  = "today is java";

            // I need get each word and concatenate it starting from end.
            String [] words = sentence.split(" ");  //[today, is, java]
            System.out.println(words.length); //


            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }

            System.out.println("--------------------");
            String result = "";
            for (int i = words.length-1; i >=0 ; i--) {

                result += words[i] + " ";
                //System.out.println(words[i]);

            }

            System.out.println(result.trim());

        }
    }
}
