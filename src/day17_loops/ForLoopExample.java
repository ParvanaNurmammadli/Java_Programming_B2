package day17_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        //1-initialization ;   2-condition ;    4-iteration
        for (int i = 1;         i <= 10;             i++) {
            //3-code body
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("---------");
        }

        /*
            for loop execution flow

            1) initialization: the loop executes the initialization part which declares int i and assigns initial value 0
                -in out ex: int i = 0;
                -initialization runs ONLY ONCE at the beginning of the for loop

            2) condition: it is boolean expression, boolean condition, termination condition.
                -in our example: i < 10;
                    -If the boolean is TRUE (do number 3): the loop will execute the statements in the body -- > { }
                    -If the boolean is FALSE (do number 5):  the loop will stop

            3) code body: The statements in the code body are executed TOP to BOTTOM
                   -in out example:
                            System.out.println(i);
                            System.out.println("Hello");
                            System.out.println("Bye");
                            System.out.println("---------");

            4) iteration: update happens here. This is kind of end of EACH cycle / iteration
                    -in our example: i++
                    - go back to number 2


            5) End the loop



         */


        // This will do the same thing aas the code above. But we used WHILE loop here.
        int z = 1;
        while (z <= 10) {
            System.out.println(z);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("---------");
            z++;
        }




        // This will do the same thing as the code above. But we used DO WHILE loop here.
        int k = 1;
        do {
            System.out.println(k);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("---------");
            k++;
        } while (k <=10);





    }
}
