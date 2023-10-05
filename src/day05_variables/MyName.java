package day05_variables;

public class MyName {
        /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */


    public static void main (String [] args) {
        char first = 'F';
        char second = 'e';
        char three = 'y';
        char four = 'r';
        char five = 'u';
        char six = 'z';


        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

        System.out.println(first + second + three + four + five + six);
        System.out.println("My name is: " + first + second + three + four + five + six);

        String myName = "" + first + second + three + four + five + six;
        System.out.println("My name is: " + myName);

    }

}
