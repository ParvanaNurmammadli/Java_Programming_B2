package day45_stream.functions;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate <Integer [], Integer> contains = (arr, num) -> {

            //boolean result = false;
            for ( Integer each : arr){
                if (each == num) {
                    //result = true;
                    return true;
                }
            }
            //return result;
            return false;
        };



        Integer [] arr = {1, 2, 4, 5,67, 23 };
        System.out.println(  contains.test(arr, 4)    );
        System.out.println(  contains.test(arr, 43)    );
        System.out.println(  contains.test(arr, 23)    );


        System.out.println();
        // anagram --- ? listen == silent
        BiPredicate <String, String> anagram = (str1, str2) -> {
            String [] arr1 = str1.split("");
            String [] arr2 = str2.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println(anagram.test("listen", "silent"));
        System.out.println(anagram.test("listen", "silend"));

    }
}