package day24_methods;

public class AvarageOfEach {

    public class AverageOfEach {
        public static void main(String[] args) {
            int [][] nums = {
                    {3, 4, 5, 6},
                    {5, 2, 6},
                    {10, 20, 30}
            };
            //System.out.println(nums.length); // 3
            //System.out.println(nums[2].length); // 3

            // can you average of total
            // average: totalSum / totalLength
            int sum = 0;
            int totalLength =0;
            for ( int [] eachArr : nums) {
                // The commented code below is if we want to get average of each single array
                //int eachSum = 0;
                for ( int eachNum : eachArr){
                    sum += eachNum;
                    // The commented code below is if we want to get average of each single array
                    //eachSum+= eachNum;

                }

                totalLength+= eachArr.length;  // 4 + 3 + 3 = 10

                // The commented code below is if we want to get average of each single array
                //System.out.println("Sum after each cycle: " + eachSum);
                //System.out.println("Average of each: " + (eachSum / eachArr.length));
            }

            System.out.println("Total Sum: " + sum);
            int average = sum / totalLength;

            System.out.println("Average: " + ( sum / totalLength) );
            System.out.println("Average: " + average );


        }
    }

}
