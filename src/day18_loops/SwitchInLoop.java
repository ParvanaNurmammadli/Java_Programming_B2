package day18_loops;

public class SwitchInLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i--) {

            switch (i) {

                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6: // since loop continues until i = 5 --- > i never reached 6. That is why case 6 will never run/reached
                    System.out.println("Six");

            }
            System.out.println();
        }


    }
}