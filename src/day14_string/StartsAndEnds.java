package day14_string;
/*
    .equals(String)
    .equalIgnoreCase(String)
    .length()
    .toUpperCase()
    .toLowerCase
 */
public class StartsAndEnds {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App")); //
        System.out.println(str.startsWith("app")); //

        System.out.println(str.startsWith("Apples")); //
        System.out.println(str.startsWith("A")); //



        String str2 = "App";
        System.out.println(str.startsWith(str2)); //

        System.out.println("-------------------");
        System.out.println(str.startsWith("     App")); //String str = "Apples";
        System.out.println(str.startsWith(     "App")); //String str = "Apples";


        System.out.println("----------------");

        String sentence = "It is a good day";
        System.out.println(sentence.startsWith(" a good day"));
        System.out.println(sentence.endsWith(" a good day"));
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("d day"));
        System.out.println(sentence.endsWith("It is a good day"));
        System.out.println(sentence.endsWith("dd day")); // "It is a good day";











    }
}
