package day08_scanner_logical_operators;

public class OrPractise {


    public class OrPractice {
        public static void main(String[] args) {

            int apples = 5;
            int oranges = 10;

            //                   true     ||   false  --- > true
            System.out.println(apples > 1 || oranges < 5);
            //                    false    ||   true  --- > true
            System.out.println(apples > 10 || oranges == 10);
            //                    false    &&    true  ---- >  false
            System.out.println(apples > 10 && oranges == 10);


            // Discount are available:  On WEEKEND AND TEACHER || DOCTOR



        }




    }
}
