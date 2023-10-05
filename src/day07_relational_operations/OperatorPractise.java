package day07_relational_operations;

public class OperatorPractise {
    public class OperatorPractice {
        public static void main (String [] args) {

            int num = 10;
            num++;  //post-increment | no other code, just incremented by 1 |
            System.out.println(num); // 11

            num--; // post-decrement
            System.out.println(num);  // 10

            System.out.println(num++);// post-increment -- > we get/print the value first, then we update it. --- 10  | num = 11;
            System.out.println(num++); // output -- > 11   |  num = 12;
            System.out.println(++num); // pre-increment --- > we update first, then user it --- > num = 13; | print - 13



        }

    }
}
