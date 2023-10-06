package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "loop";
        //            0123
        System.out.println(str.charAt(0)); //l
        System.out.println(str.charAt(1)); //o
        System.out.println(str.charAt(2)); //o
        System.out.println(str.charAt(3)); //p


        System.out.println("\nLets do it with the loop");

        str = "loopcamp";
        //     0123 -- > length 4
        for (int i = 0; i <= str.length()-1; i++) {   //         for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }






    }
}