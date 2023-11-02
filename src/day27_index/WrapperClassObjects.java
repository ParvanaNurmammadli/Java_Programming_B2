package day27_index;



    import java.util.Scanner;

    public class WrapperClassObjects {

        public static void main(String[] args) {

            int a = 5;
            // We can assign a new value / reassign
            // a.method() --- ? we CANNOT do this



            //Scanner input = new Scanner(System.in);  // input is a object reference
            Integer a1 = new Integer(10);  // This will make it an object direclt.
            // How can I convert this primitive data type into and object type

            Integer a2 = 20;  // a2 is a Object reference
            // Every whole numbers in Java in
            // Line 18 - takes the int 20 and AUTOBOXES it into Integer Wrapper class


            // The below example is to explain the same logic behind CASTING which similar to AUTOBOXING
            //double d = 10;
            //.out.println(d); //10.0


            int a3 = a2; // UNBOXING - > converting Integer into int


            byte b = 4;
            Byte b1 = b;   // AUTOBOXING
            Byte b2 = 20;  // AUTOBOXING

        }
    }

