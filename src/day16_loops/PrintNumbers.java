package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        // print even numbers from 1-00
        int num = 2;
        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }

        System.out.println("--------------");
        // 2nd approach
        int i = 1;
        while (i <= 100) {
            if(i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            i++;
        }

        // odd number from 1 to 100
        int b = 1;
        while (b <= 100) {
            if (b % 2 != 0) {
                System.out.println(b);
            }

            b++;
        }




    }
}