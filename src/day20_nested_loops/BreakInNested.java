package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("i " + i);

//            break; // If you uncomment, the code will give an error saying basically that any code after this break is NOT REACHABLE
//            if (i == 3) {  // Here, there is possibilities that we will be able to run some code after break statement.
//                break;
//            }

            for (int j = 0; j < 2; j++) {

                System.out.println("j " + j);
                //break;  // Once the break statement is REACHED it end the LOOP which is have that break statement directly inside itself


            }
            break;



        }


    }
}

/*
        i 0
        j 0
        j 1
        i 1
        j 0
        j 1
        i 3
        j 0
        j 1
        .
        .
        i 4
        j 0
        j 1
 */


