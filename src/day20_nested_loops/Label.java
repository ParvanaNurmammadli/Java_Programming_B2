package day20_nested_loops;

public class Label {

    public static void main(String[] args) {

        labelName:
        for (int i = 0; i < 3; i++) {

            System.out.println("i " + i);

            for (int j = 0; j < 2; j++) {

                if (j == 1) {
                    break labelName;  // Here we are saying, once you reach this break statement, end the loop with that specific label --- 'labelName'
                }

                System.out.println("j " + j);
            }

            System.out.println();

        }

    }

}


