package day45_stream.functions;
import java.util.Arrays;
import java.util.function.Predicate;

public class UserPredicate {

    public static Predicate <String> isPalindrome = (str) -> {
//        String r = "";
//        for (int i = str.length()-1; i >= 0; i--) {
//            r+= str.charAt(i);
//        }
        String reversed = new StringBuilder(str).reverse().toString();
//        boolean res;
//        if (str.equals(reversed)){
//            res = true;
//        } else {
//            res = false;
//        }
        return str.equals(reversed);
    };



    public static Predicate <Integer> isPrime = number -> {
        int count  = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    };



//    public static void main(String[] args) {
//        String str = new String("Hello");
//        str.length();
//    }
}