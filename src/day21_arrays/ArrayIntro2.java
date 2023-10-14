package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        // When you make an array with 'new' keyword, you mUST give the size of it.
        // each element will have a default values depending on the data type of array
        double [] arr = new double[4];  // There will be total 4 elements in this array
        System.out.println(arr.length);  // 4
        System.out.println(Arrays.toString(arr));


        // How can I assign 30.99 to index 0
        arr [0] = 30.99;
        System.out.println(Arrays.toString(arr));

        arr [1] = 12.55;
        arr [2] = 10.20;
        arr [3] = 4;
        System.out.println(Arrays.toString(arr));
        //arr [4] = 45; // Since index 4 is not in the range, it will throw EXCEPTION


        // We said that we CANNOT change the size of the array
        // But can we change the value of the specific indexed element?
        arr[2] = 200.0;  // We RE-ASSIGNED the value at index 2
        System.out.println(Arrays.toString(arr));



        arr = new double[4]; //This creates a new array with 4 elements
        // And arr references to the new object
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);


        String [] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));

        // null and emptyString --> they are not SAME


        // 3rd but very RARE DECLARATION
        char [] arr2 = new char[]{1, 4, 5, 8};
        System.out.println(arr2.length);  //  4


    }
}

