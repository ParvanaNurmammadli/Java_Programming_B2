package day20_nested_loops;

public class ContinueInNested {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if (i == 1 || i == 2) {
                continue;
            }

            System.out.println("i " + i);


            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    continue;
                }

                System.out.println("j " + j);

            }
            System.out.println();

        }
    }
}

