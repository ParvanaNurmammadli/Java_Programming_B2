package day18_loops;

public class BranchingExamples {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
        }


        System.out.println();
        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
            break;
        }


        System.out.println();
        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }


        System.out.println();
        for (int i = 0; i <= 10 ; i++) {

            if (i == 5) {

                //System.out.println("Hello");  // This one here before break; is OK
                break;
                //System.out.println("Hello"); // Since anything after break is not going to be printed, we can not do statement here in the same body.
            }

            System.out.print(i + " ");
        }


        System.out.println("\n----------------------------");


        for (int i = 0; i <= 10 ; i++) {

            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }


        System.out.println();
        for (int i = 0; i <= 100 ; i++) {

            if (i % 2 == 1) {
                continue;
            }

            System.out.print(i + " ");
        }


    }
}
