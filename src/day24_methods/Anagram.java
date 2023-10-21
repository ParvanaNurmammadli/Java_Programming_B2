package day24_methods;


    import java.util.Arrays;

    public class Anagram {
        public static void main(String[] args) {
            //Palindrome - if the word is same from beginning and end
            //Anagram - if the 2 words has the same letters
            String str1 = "loop"; // [l o o p]
            String str2 = "pool"; // [l o o p]

            System.out.println(str1.equals(str2)); //

            char []  arr1 = str1.toCharArray();  // String [] arr1 = str1.split("")
            char []  arr2 = str2.toCharArray();  // String [] arr2 = str2.split("")

            System.out.println(  Arrays.equals(arr1, arr2)  );

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            System.out.println(  Arrays.equals(arr1, arr2)  );

        }
    }

