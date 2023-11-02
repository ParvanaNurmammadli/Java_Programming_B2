package day28_arraylist;



    import java.util.ArrayList;
import java.util.Arrays;

    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns Element / And removes the given index if exist
        .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
        .size()
        .contains (parameter) - > if the given parameter exists in the Arraylist, it returns true. If not, it returns false
        .isEmpty () - > checks if the ArrayList has elements or not. If it does, it returns FALSE otherwise, it returns TRUE
        .clear() - > It will remove all the elements from the Arraylist and make it empty
        .set ( index, parameter )  - > It will fins the given index and UPDATE the value on that index. If idex is not in the range, it will throw IndexOutOfBoundsException
        .indexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index. If nothing matched, -1 will be returned
        .lastIndexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index from the END. If nothing matched, -1 will be returned
        Arrays.asList( arr ) - > this will help to either convert the array into arraylist. Or, declare ArrayList with values directly.

     */
    public class ConvertArrayToList {
        public static void main(String[] args) {
            // We made Integer array (not int array)
            // Array can work with PRIMITIVE and NON-PRIMITIVE data types
            Integer [] arr = {1, 2, 3};
            System.out.println(Arrays.toString(arr));

            Arrays.asList(arr);

            ArrayList <Integer> nums = new ArrayList<>( Arrays.asList(arr)  );
            System.out.println( nums);

            ArrayList <Integer> nums2 = new ArrayList<>( Arrays.asList( 12, 23, 4, 5, 6  )  );
            System.out.println(nums2);

            ArrayList<Integer> nums3 = new ArrayList<>( Arrays.asList(100, 200, 300, 400, 800, 1000));
            // Instead of adding one by one, We can add all in declarion.
//        nums.add(100);
//        nums.add(200);
//        nums.add(300);
//        nums.add(400);
//        nums.add(800);
//        nums.add(100);

            nums3.add(4000);
            System.out.println(nums3);

        }
    }

