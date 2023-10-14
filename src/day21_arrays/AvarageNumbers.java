package day21_arrays;

public class AvarageNumbers {
    /*
         Average Number from Array
         Given an int array calculate the average number -> Make it flexible so it will work with any array size
         Examples:
         [1,2,3] -> average: 2
         [10, 15, 5, 6] -> average: 9
         [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
  */
    public class AverageNumbers {
        public static void main(String[] args) {
            int [] arr = {2, 4, 6, 12, 45, 67, 87, 23, 34, 87, 34};
            int sum = 0;
            // Need to loop through to get each element
            //      Then sum up all

            // To get the average we divide the total to the size

            for (  int each : arr) {
                sum += each;
            }

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum/arr.length));


            System.out.println("------------------");
            // This is doing the same thing but with FORI loop
            int sum2 = 0;
            for (int i = 0; i < arr.length; i++) {
                sum2 += arr[i];
            }
            System.out.println("Average: " + (sum2/arr.length));


        }
    }

}
