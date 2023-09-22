package day11_if_statements;

public class NestedExample {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = false;

        if (a) {

            System.out.println(1.1);

            if (b) {
                System.out.println(1.2);
            }

        } else {

            System.out.println(2.1);

            if (c) {
                System.out.println(2.2);
            } else {
                System.out.println(2.3);
            }

        }



        if (a) {
            System.out.println("Hello");

            if (b) {
                System.out.println("Hello 2");
            }
        }



    }

}
