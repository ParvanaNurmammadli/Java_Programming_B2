package day23_multidimensionalarrays;
import java.util.Arrays;


import java.util.Arrays;

/*
    Arrays.toString(arrName);
    Arrays.equals(arr1, arr2);
    Arrays.sort(arrName);
    Arrays.copyOf(arrName, anySize);

    String str = "java";
        str.toCharArray();
        str.split("str");
    String.join("", arrName)
    String.join("anyValue", arrName)

    String str = new String(charArrName);
 */
public class CopyExample {
    public static void main(String[] args) {

        int  []  a = {1, 2, 3 };
        int [] b = a;  // 'b' is another array reference/name but the array is the same as the one 'a' is pointing


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        a[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));  // Since 'b' is still pointing to 'a', it will have the updated values as well.

        System.out.println();

        // Arrays.copyOf(arrName, size);
        // This is a completely new Array
        int [] z = Arrays.copyOf(a, a.length);  // 3
        System.out.println(Arrays.toString(z));

        z[0] = 500;

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(z));


        System.out.println();
        int [] x = Arrays.copyOf(z, z.length+2);  // 5
        System.out.println(Arrays.toString(x));


        System.out.println();
        int [] y = Arrays.copyOf(z, z.length-1);
        System.out.println(Arrays.toString(y));

    }

}






