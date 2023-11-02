package day28_arraylist;



    import java.util.ArrayList;

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

     */
    public class IndexOfMethod {
        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(100);
            nums.add(200);
            nums.add(300);
            nums.add(400);
            nums.add(800);
            nums.add(100);

            System.out.println( nums.indexOf(100) );  // first matched elements index

            System.out.println( nums.indexOf(700));  //

            int ind = nums.indexOf(200);
            System.out.println( ind);


            System.out.println( nums.lastIndexOf( 100 ));
            System.out.println( nums.lastIndexOf( 5000 ));


            // how can I get the last element ?
            System.out.println(  nums.get (nums.size() - 1)   );


            nums.set( nums.indexOf(100), 0  );  // nums.set(0,0);
            System.out.println(nums);


            nums.set( nums.indexOf(100), 0  );  // nums.set(5,0);
            System.out.println(nums);

            //[0, 200, 300, 400, 800, 0]
            //nums.set( nums.indexOf(100), 0  );  // nums.set(-1,0);
            //System.out.println(nums);

        }

    }

