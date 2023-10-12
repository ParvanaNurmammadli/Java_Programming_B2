package day19_nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        //OUTTER LOOP
        for (int i = 1; i <= 10; i++) {

            //INNER LOOP
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j) );
            }
            System.out.println();
        }


    }
}


