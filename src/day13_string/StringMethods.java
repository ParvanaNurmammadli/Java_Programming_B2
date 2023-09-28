package day13_string;

//import java.lang.String; // You do not have to import it. Java by default imports this PACKAGE

public class StringMethods {
    public static void main(String[] args) {

        String str = "loopcamp"; // IMMUTABLE -- > IM- MYU - TIBIL
        str = str + " is nice."; // Here, we made a completely new String


        String name = "Valentina";
        System.out.println(name == "valentina");  // NEVER YOU relational operator to compare the Strings
        System.out.println(name == new String ("Valentina"));


        System.out.println(name.equals("Valentina")); // Here, I am comparing the values NOT the memory location.
        System.out.println(name.equals("Parvana"));  //

        boolean result = name.equals("Loopcamp");
        System.out.println(result);


        System.out.println(name.equalsIgnoreCase("VaLenTINA")); // Valentina


        System.out.println("-----------------------------------------");
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b); // Here, we are comparing the memory location and SINCE both were made using the 'new' keyword, both of them in a different location in the HEAP memory
        System.out.println(a.equals(b)); // Here, we are comparing the VALUE itself. No matter what the location is in the memory, I am comparing the values.


        System.out.println(a.length());  // .lenght(); returns the number of characters




        /*
          .equals("");
          .equalIgnoreCase("")
          .length();
         */


    }
}
