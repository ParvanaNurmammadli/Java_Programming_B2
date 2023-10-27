package day26_methodsclass;


    import my_utilities.ArrayUtil;

    public class SumOfElements {
        public static void main(String[] args) {

            int [] arr = { 1, 5, 6, 2};
            // since I am using the method from same class, I can call it with just the method name
            System.out.println(  sumOfArray( arr )  );

            // since I am using the method from different package,
            // I need to import the package first, then use the class name to call method which is inside of the class
            System.out.println(  ArrayUtil.sumOfArray(arr) );

            System.out.println(  sumOfArray( 4, 5, 6, 7 ) );




        }

        // Create a method that sums up all the elements of an int array - return the total
//    public static int sumOfArray ( int [] arr) {
//        int sum = 0;
//
//        for ( int eachNum : arr) {
//            sum += eachNum;
//        }
//      return sum;
//    }


        // This parameter is called VAR ARGS -- > which is the same data type of elements - > same as array
        public static int sumOfArray ( int ... arr) {
            int sum = 0;

            for ( int eachNum : arr) {
                sum += eachNum;
            }
            return sum;
        }


    }

