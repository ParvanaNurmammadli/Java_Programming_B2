package day06_b_unary_operators;


    public class IncrementExample {
        public static void main(String[] args) {

            int x = 0;
            System.out.println(x);  // 0


            x = x + 1; // take the value of x, which is 0 and add 1 --- > 0 + 1 --- > 1
            System.out.println(x);  // 1

            // In Java there is a shorter way to write x+1 in two options: POST-INCREMENT and PRE-INCREMENT
            // POST-INCREMENT
            x++;  // this will increase the value by 1 --- >  x = x + 1;  -- > 1 + 1 = 2
            System.out.println(x); // 2

            x++;
            System.out.println(x); //3



            //PRE-INCREMENT
            ++x; // this will increase the value by 1 --- >  x = x + 1;  -- > 3 + 1 = 4
            System.out.println(x);
            System.out.println();

            // Q: Then what is the difference? Why do we two version?
            System.out.println(++x); // PRE-INCREMENT - it will update the x first and then print

            System.out.println(x++); // POST-INCREMENT -it prints first and then update the x

            System.out.println(x); // 6





        }
    }

