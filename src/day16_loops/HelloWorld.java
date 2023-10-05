package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("--------------");

        int num = 1;  // initial value -- >  first value given

        while (num <= 100) {
            System.out.println(num + ": Hello World");
            num++;
        }
        System.out.println("--------------");



        int z = 1;

        while (z <= 50) {
            System.out.println("Hello Loopcamp: " + z);
            z++;
        }
        /*
            flow of the one above
            z = 1;

            z <= 50 --- > true -- > goes into the body of the while loop
            runs code:  from top to bottom
                   - print statement-- Hello Loopcamp: 1
                   - post increment -- > z = 2


            z = 2;
            2 <= 50 --- > true -- > goes into the body of the while loop
            runs code:  from top to bottom
                   - print statement-- Hello Loopcamp: 2
                   - post increment -- > z = 3

            .......



            z = 51
            51 <= 50 --- > false ---- >  it ends the while loop.

         */

/*
        // INFINITE LOOP
        System.out.println("--------------");
        while (true) {
            System.out.println("Loopcamp");
        }

 */


    }
}
