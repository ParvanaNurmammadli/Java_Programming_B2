package day26_methodsclass;


    import java.util.Arrays;

    public class MinNumberInArray {

        public static void main(String[] args) {

            int [] arr = {1, 45, 23, -10,  56, 87, 56};


        }


        //Create a method that find a minimum number in the array and returns that
        public static int minInArray1 (int [] arr) {
            Arrays.sort(arr);
            return arr[0];
        }

        public static int minInArray2 (int [] arr) {

            int min = arr[0];

            for ( int eachElem : arr) {
                if( eachElem < min) {
                    min = eachElem;
                }
            }
            return min;
        }



    }


