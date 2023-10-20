package day23_multidimensionalarrays;


    import java.util.Arrays;

    public class EqualsExample {
        public static void main(String[] args) {

            int [] a = {1, 2, 3}; // This is in one location in the memory
            int [] b = {1, 2, 3}; // This is in another location in memory
            int [] c = a;


            // DO NOT COMPARE THE ARRAYS IN THIS WAY
            System.out.println(a == b); // If you use arithmetic operator to compare, it will compare the memory location.
            System.out.println(a == c);


            System.out.println();
            // How can I compare the values of the arrays?
            System.out.println(Arrays.equals(a, b));

            //System.out.println(a.equals(b)); // We can not use just the .equals() method with arrays.


            int [] d = {3, 2, 1};
            System.out.println(Arrays.equals(a, d));
            Arrays.sort(d); // [1, 2, 3]
            System.out.println(Arrays.equals(a, d));



        }
    }

