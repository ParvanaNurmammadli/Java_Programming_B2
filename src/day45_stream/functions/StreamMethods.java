package day45_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Creating streams

        // streams work with data structures
        // 1. Array
        // 2. Collection


        // 1. Array
        int [] arr = {1, 2, 3, 4, 5};
        // In order to create a stream of array, Array itself does not have a method that we can use
        // But we have Arrays utility class which has the method called stream() that can be used to take the array and make stream

        Arrays.stream(arr);  // This as it is not doing anything. We just converted array into stream



        // 2. Collection
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        list.stream(); // With collection we can use Collection reference name directly to convert it to stream


        // Now lets look at the methods that wee can use from stream.


        //#1 - .distinct(); --- > to remove the duplicates
        // with Collection
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8));
        System.out.println("Distinct method applied: "  +  list2.stream().distinct()   );  //This as it is just doing some action. It will show some memory location.

        System.out.println("Distinct method applied and converted to Collection: "  +  list2.stream().distinct().collect(Collectors.toList())   );
        // .collect() --- > it takes what changes were made by stream and converts it back to List (you can convert it to other Collection types as well.)
        /*
            stream()    -- > converts the list to stream
            distinct()  -- > remove duplicates
            collect(Collectors.toList()) -- > convert the stream back to lust
         */

        System.out.println("Original: " + list2); // Original list is still same. NOT CHANGED
        list2 = list2.stream().distinct().collect(Collectors.toList()); //reassigning
        System.out.println("Reassinged: " + list2);



        // with Array
        int [] arr2 = {1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8};
        System.out.println("Original: "  +   Arrays.toString(arr2) );
        System.out.println("Chagned: "   +  Arrays.toString(  Arrays.stream(arr2).distinct().toArray()    ) );

        System.out.println("Original: "  +   Arrays.toString(arr2) );
        arr2 =  Arrays.stream(arr2).distinct().toArray();
        System.out.println("Reassigned: " + Arrays.toString(arr2));


        System.out.println();
        // skip() -- skips the number of element that was provided in. It will skip fir 'n' element
        List <Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(   list3.stream().skip(4)    ); // here we just converted array yo stream and applied skip method. We still need to convert back to collection
        System.out.println("Original: " + list3); // Original is not changed.
        System.out.println("After skip: " + list3.stream().skip(4).collect(Collectors.toList())    );
        System.out.println("Original: " + list3); // Original is not changed.
        System.out.println("After skip: " + list3.stream().skip(7).collect(Collectors.toList())    );

        String [] arr3 = {"java", "hello", "world", "loop", "computer"};
        System.out.println( Arrays.toString(Arrays.stream(arr3).skip(2).toArray()) );


        System.out.println();
        // limit () --> keeps the first 'n' elements starting from beginning
        List <Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream().limit(6).skip(3).collect(Collectors.toList())); // method chaning.



    }
}
