package day13_string;

public class StringMemory {
    public static void main(String[] args) {
        int num = 4;
        byte num2 = 5;
        char letter = 'f';
        boolean result = true;
        double num3 = 34.5;
        //double num4 = new double(4);  // This is not valid. Cannot do this with PRIMITIVE data types
        String str = "Hello"; // Creating a String by LITERALS
        String str2 = new String("Hello"); // Creating a String by 'new' keyword







        String zero = "Java";
        String first = "java";                       // 1) String literal ------ > Stored --- > Heap String Pool
        String second = new String("java");  //  2) String object (String by new keyword) ---- > Stored --- > Not in Pool, DIRECTLY in the Heap
        String third = "java";
        String fourth = new String("java");



        // == (relational operator)  with String compares the memory location
        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == fourth);
        System.out.println(zero == first);









    }
}
