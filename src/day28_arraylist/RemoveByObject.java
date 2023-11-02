package day28_arraylist;


    import my_utilities.ArrayUtil;
import my_utilities.StringUtil;

import java.util.ArrayList;

    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns Element / And removes the given index if exist
        .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
        .size()
     */
    public class RemoveByObject {
        public static void main(String[] args) {
            ArrayList <Integer> nums = new ArrayList<>();

            nums.add(100);  // 0
            nums.add(200);
            nums.add(300);
            nums.add(400);
            nums.add(10);   // OBJECT 10
            nums.add(600);
            nums.add(700);
            nums.add(800);
            nums.add(900);
            nums.add(4000);  // 9
            nums.add(10);  // index 10

            //System.out.println(nums.remove(0));
            System.out.println(nums); // [100, 200, 300, 400, 500]

            nums.remove(10);
            System.out.println(nums);

            nums.remove(Integer.valueOf(10));
            System.out.println(nums);

            Integer i = 200;
            nums.remove(i);
            System.out.println(nums);



            nums.remove((Integer)300);  // We cast int into Integer
            System.out.println(nums);

        }

    }

