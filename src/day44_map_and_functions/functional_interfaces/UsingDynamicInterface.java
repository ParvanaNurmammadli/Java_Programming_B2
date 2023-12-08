package day44_map_and_functions.functional_interfaces;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (word) -> {
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };

        printEachChar.test("Hello Functional Interface");

//----------------------------------------------------------------------


        System.out.println();
        DynamicInterface <Integer> printUpUntil = (num) -> {

            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }

        };


        printUpUntil.test(5);


    }

}