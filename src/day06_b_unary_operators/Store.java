package day_06_b_unary_operators;

public class Store {

        public static void main(String[] args) {

            String store = "Target";
            int numOfTv = 100;


            System.out.println("Person comes into the store and they bought a TV");
            //numOfTv = numOfTv - 1;
            System.out.println("Number of TV now: " + --numOfTv );

            System.out.println("Another person came and bough 1 more TV");
            System.out.println("Number of TV now: " + --numOfTv);

            System.out.println("In report, it shows that we have total: " + numOfTv);

            System.out.println("First person has returned a TV");
            System.out.println("Number of TV now: " + ++numOfTv);





        }

    }