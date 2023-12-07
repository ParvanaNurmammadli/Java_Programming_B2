package day42_maps.map_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {
        //ArrayList <String> list = new ArrayList<>();

        // KEY is __Integer__ and VALUE is __Integer__
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 400);
        System.out.println(map);

        // KEY is __Integer__ and VALUE is __String__
        Map <Integer, String> map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(3, "three");
        map2.put(10, "ten");
        map2.put(5, "five");
        //map2.put(-2, "two");
        //map2.put(null, "hello");
        System.out.println(map2); // HashMap order is not not keeping the insertion order. It is a RANDOM order (Not sorted either)


        // how do we read the key/value from map --- > get(KEY) --- > will give us the value based on the KEY
        System.out.println(map2.get(10));  // 10 is not the index --- > it is the object 10 which is the KEY

        String value = map2.get(5);
        System.out.println(value);

        map2.remove(1); // remove(KEY) -- > removes the PAIR with the matching KEY
        //System.out.println(map2.remove(1)); // remove(KEY) -- > removes the PAIR with the matching KEY also returns the removed VALUE

        System.out.println(map2);


        // How would you check if given KEY is among the KEYS
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsKey(3));


        // How would you check if given VALUE is among the VALUES
        System.out.println(map2.containsValue("Five"));
        System.out.println(map2.containsValue("five"));
        System.out.println(map2.containsValue("10"));

        map2.put(null, null);
        System.out.println(map2);

        map2.put(null, "Hello World!"); // If you provide already EXISTING KEY, the new VALUE will be assigned to the EXISTING KEY. Existing KEY's VALUE gets UPDATED
        System.out.println(map2);

        map2.put(5, "May");
        System.out.println(map2);

        map2.put(7, "May"); // We can have duplicate VALUES but not duplicate KEYs
        System.out.println(map2);


    }
}

