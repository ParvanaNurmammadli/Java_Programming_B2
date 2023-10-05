package day06_b_unary_operators;

public class IncrementExample2 {

        public static void main(String[] args) {

            int age = 20;
            System.out.println(age); // 20
            System.out.println(age++); // -- > 20  |   x = 21
            System.out.println(age); // 21

            //                 21  +   2
            System.out.println(age++ + 2); // 23  | age = 22;
            System.out.println(age); // 22

            //                  23  + 2
            System.out.println(++age + 2); // age = 23 |  25
            System.out.println(age); // 23

            //                  24      25     2
            System.out.println(++age + ++age + 2);  // age = 25;
            //                  25      26
            System.out.println(age++ + age++ + 2);


        }
}
