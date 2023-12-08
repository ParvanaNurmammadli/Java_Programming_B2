package day44_map_and_functions.string_builder_buffer;
public class StringBuilderStringBuffer {
    public static void main(String[] args) {

        // 1. String Class
        //  IMMUTABLE - we cannot change
        String str1 = "loopcamp";                       // Stored in String Pool in Heap
        String str2 = new String("loopcamp");    // Stored directly in Heap
        str1 = str1 + " course";                        // IMMUTABLE - we cannot change -- > here we made a new String


        // 2. StringBuilder Class
        //  It is in java.lang package
        //  MUTABLE - once object create we can change
        //  It is NOT Synchronized
        //  It can be ONLY created by 'new' keyword
        StringBuilder str3 = new StringBuilder("loopcamp");  // Stored directly in Heap
        System.out.println(str3);
        str3.append(" course");
        System.out.println(str3);



        System.out.println();
        // 3. StringBuffer Class
        //  It is in java.lang package
        //  MUTABLE - once object create we can change
        //  It IS Synchronized
        //  It can be ONLY created by 'new' keyword
        StringBuffer str4 = new StringBuffer("loopcamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);





    }
}