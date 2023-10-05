package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        // find factorial of 5! -- > 5 * 4 * 3 * 2 * 1
        // repeated action:  multiply the number by one less than itself
        // stop point: number get to be less than 1

        int num = 5;
        int result = 1;

        while ( num >= 1) {
            System.out.print("Result so far: " + result + " * " + num);
            result *= num;
            System.out.println(" = " + result);
            num--;

        }
        System.out.println(result);





    }
}
