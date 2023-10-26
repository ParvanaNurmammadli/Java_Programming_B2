package day25_methods;


import java.util.Arrays;

/*
        all will accept array argument

        create a method that will print the first element
        create a method that will print the last element
        create a method that will print the element/s
            length matters -> even there is middle, for odd there is one middle
     */
    public class OurArrayClass {


        public static void firstElem (int [] nums) {
            System.out.println("First Element: " + nums[0]);
        }

        public static void lastElem (int [] nums) {
            System.out.println("Last Element: " + nums[nums.length-1]);
        }


        public static void printArr (int [] nums) {
            System.out.println(Arrays.toString(nums));
        }

        // print midle numbers -- > if the size is EVEN take the middle two, else take the middle one
        public static void printMiddle (int [] nums) {

            if (nums.length % 2 == 0) {
                System.out.println("First middle: " + nums [ nums.length / 2 - 1  ] ); // [1, 2, 3, 4]
                System.out.println("Second middle: " + nums [nums.length / 2]);
            } else {
                System.out.println("Middle: " + nums [nums.length / 2]);
            }

        }

        public static void main(String[] args) {
            int [] numbers = {34, 1, 2, 3, 45, 56, 6, 873, 256, 56};

            firstElem(numbers);
            lastElem(numbers);
            printArr(numbers);

            printMiddle(numbers);


//        int []  n = new int[] {1, 2,34, 6 };
//        firstElem(n);
            // This is the same thing as above line 53 and 54
            firstElem(new int[] {1, 2, 34, 6 });  // Here I directly used the array when I called the method.

        }
    }

