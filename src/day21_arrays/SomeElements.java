package day21_arrays;

public class SomeElements {

    // declare and assign number values to try array {3.5.7.8}
/*
    declare and assign number values to the array
        {3, 5, 7, 8}

        sum up all the values and print the total: 23

 */
    public class SumElements {
        public static void main(String[] args) {

            int [] nums =  {3, 5, 7, 8};
            int sum = 0;

            // Need to get each element one by one
            //    I can add each of them and store it into a new variable

            for (int i = 0; i < nums.length; i++) {
                //System.out.println(nums[i]);
                sum += nums[i];  // sum = sum + nums[i];
            }

            System.out.println("Sum of total: " + sum);

        }

    }
}
