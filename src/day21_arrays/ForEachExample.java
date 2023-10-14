package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30, 12, 150, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional fori loop: " + nums[i]);
        }

        System.out.println();


        // For each loop:
        // {30, 12, 150, 12};
        for (int each : nums) { // 1st cycle -> int each = 30  |  2nd cycle - > int each = 12 .......

            System.out.println("ForEach loop: " + each);

            // Change the value of the 3rd element in array

        }

        // It is better to usi FORI if we need to work with INDEX
        for (int i = 0; i < nums.length; i++) {

            if (i == 2) {
                nums[i] = 34;
            }

        }


        System.out.println("------------------------------------");
        String [] classes = {"java", "soft skills", "api", "db", "selenium"};

        // if I want to use foreach loop
        for ( String eachElem  : classes ) {
            System.out.println("For Each Loop: " + eachElem);
        }

        // Traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional: "+ classes[i]);
        }

        System.out.println("------------------------------------");


        double [] prices = {2.3, 45.7, 34, 21.2};

        for (double eachNum : prices) {
            System.out.println("Each: $" + eachNum);
        }



    }
}

