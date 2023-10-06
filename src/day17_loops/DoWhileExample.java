package day17_loops;

public class DoWhileExample {

        public static void main(String[] args) {

            int a = 1;

            do {
                // everything between curly brackets / braces are in the loop
                System.out.println(a);
                a++;

            } while (a <= 10);




            // This loop has a boolean of 'false' but it still runs through the code body ONE time because it is a DO WHILE loop
            int a2 = 0;

            do {
                System.out.println(a2); // 0
                ++a; // a = 1;
            } while (a2 == 10); // 1 == 10 --- > false



            // this is a WHILE LOOP which almost same as DO WHILE LOOP, nothing will print from the code body since the condition is FALSE. In this example, loop body never executes.
            int a3 = 0;
            while (a3 == 10) {
                System.out.println(a3);
                a3++;
            }



        }

    }

