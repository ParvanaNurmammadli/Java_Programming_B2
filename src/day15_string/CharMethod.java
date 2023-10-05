package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123   ----- > indexes in String starts from 0 (zero)

        System.out.println(s.length());  // 4 -- > number of the total characters

        System.out.println(s.charAt(0)); // j --- > dataType will be char
        System.out.println(s.charAt(1)); // a --- > dataType will be char
        System.out.println(s.charAt(2)); // v --- > dataType will be char
        System.out.println(s.charAt(3)); // a --- > dataType will be char


        //System.out.println(s.charAt(4)); // There is no INDEX 4 - > RUN TIME EXCEPTION (ERRORS)
        //The code will wun up until the code line above. Nothing will run after that.

        //System.out.println(s.charAt("4")); // Accepts only number - > COMPILE TIME EXCEPTION (ERRORS) - SYNTAX
        //If we have this, the code will not run at all. Because the code cannot be compiled.


        System.out.println("------------------");
        String s1 = "cake";
        //           0123
        //length -- > 4

        String s2 = "apples";
        //           012345
        // length -- > 6

        String s3 = "softskill";
        //           012345678
        //length --- > 9

        // How can you get the last character --- > .charAt(index)
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(s1.length() - 1));

        System.out.println(s2.charAt(5));
        System.out.println(s2.charAt(s2.length()-1));

        System.out.println(s3.charAt(8));
        System.out.println(s3.charAt(s3.length()-1));


        System.out.println("--------------");
        // how do you get the last character
        String s4 = "loopcamp123423535l;ksdfjs;lk";
        //           012345678
        int lastIndex = s4.length()-1; // dynamically
        System.out.println(s4.charAt(lastIndex));


        int sendToLastIndex = s4.length() - 2;
        System.out.println("Second to the last character is :" + s4.charAt(sendToLastIndex));





    }
}