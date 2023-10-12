package day19_nested_loop;

public class NestedLoopExample3 {

    public static void main(String[] args) {
        // Outer Loop
        for (int i = 0; i < 5; i++) {           // i=0 ; 0 < 5  | i=1; 1 < 5 | i=2; 2 < 5 | 3 < 5 | 4 < 5

            System.out.print("A" + i);          // A0A1B0A2B0B1A3B0B1B2A4B0B1B2B3

            //Inner loop
            for (int j = 0; j < i; j++) {       // j=0 ; 0 < 0 | 0 < 1 - 1 < 1 | 0 < 2 - 1 < 2 | 2 < 2 | 0 < 3 - 1 < 3 - 2 < 3 - 3 < 3 | 0 < 4 -- > 1 < 4-- > 2 < 4 -- > 3 < 4 --- > 4 < 4

                System.out.print("B" + j);      // B0 - B0B1 - B0B1B2 - B0B1B2B3

            }

        }


    }

}


