package day26_methodsclass;

public class CountNumbers {


    // Create a method that calculates the sum of all numbers up to itsef: 3 - > 1+2+3 -- > 6
    public static void count (int number) { // 5 -- > 0+1+2+3+4+5 -- > 15
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Total is: " + sum);
    }

    // can you write the same method to return the sum
    public static int getSum (int number) { // 5 -- > 0+1+2+3+4+5 -- > 15
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        count(5);
        count(6);
        count(10);
        System.out.println("--------");
        System.out.println("From Return Type Method. Sum is: " + getSum(5));  // 15
        System.out.println("From Return Type Method. Sum after adding 5 is: " + (getSum(5) + 5) );  // 20
    }
}

