package day_22array;
import java.util.Arrays;

public class SortExample {




        public static void main(String[] args) {

            int [] nums = {3, 5, 7, 3243, 8,23, 23};

            System.out.println(Arrays.toString(nums));


            // .sort()
            Arrays.sort(nums); // [3, 5, 7, 8, 23, 23, 3243]
            System.out.println(Arrays.toString(nums));


            // Find the min
            System.out.println(nums[0]);
            // Find the max
            System.out.println(nums[nums.length-1]);

        }

    }

