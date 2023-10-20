package day23_multidimensionalarrays;



   import java.util.Arrays;

    /*
        Arrays.toString(arrName);
        Arrays.equals(arr1, arr2);
        Arrays.sort(arrName);
        Arrays.copyOf(arrName, anySize);
        Arrays.binarySearch(arrName, value);  (It works when all elements are SORTED)

        String str = "java";
            str.toCharArray();
            str.split("str");
        String.join("", arrName)
        String.join("anyValue", arrName)

        String str = new String(charArrName);
     */
    public class BinerySearch {
        public static void main(String[] args) {

            int [] nums = { 4, 10, 30, 20, 100};
            //              0   1   2   3

            // For this .binarySearch method to work -- > all elements have to SORTED
            System.out.println(Arrays.binarySearch(nums, 4));
            System.out.println(Arrays.binarySearch(nums, 10));
            System.out.println(Arrays.binarySearch(nums, 100));
            System.out.println(Arrays.binarySearch(nums, 20));
            System.out.println(Arrays.binarySearch(nums, 200)); // would be in p0sition 4, so 4 + 1 = 5 and negative because it is not in array, so -5




        }
    }




