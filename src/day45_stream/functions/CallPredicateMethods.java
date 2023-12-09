package day45_stream.functions;



    public class CallPredicateMethods {
        public static void main(String[] args) {

            boolean result = UserPredicate.isPalindrome.test("anna");
            System.out.println(result);
            System.out.println(  UserPredicate.isPalindrome.test("hello")   );

            System.out.println();
            System.out.println(UserPredicate.isPrime.test(5));
            System.out.println(UserPredicate.isPrime.test(6));



        }
    }
