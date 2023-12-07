package day43_map.map_recap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*

    Given a String count how many times each character is in the String
    For example:
            apple
            a - 1
            p - 2
            l - 1
            e - 1
 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {

        frequency("Apple");
        frequency("Hello");
        frequency("Loopcamp");
    }


    // make a methof that will accept a String and prints all the map with the couning each char
    public static void frequency (String word){

        Map<Character, Integer> counter = new LinkedHashMap<>();

        /*
            I need to loop through 'apple' to get each character
                put each character into map, and put the value
         */

        //String word = "aaapple";
        //Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            //System.out.println(each);
            //Character ch = each; // AUTOBOXING - auto conversion happens here: from primitive to non-primitive/object

            if (!counter.containsKey(each)) {
                counter.put(each, 1);
                //check is character is among the KEYS of counter map
                // If it is not then add the KEY (Character) and VALUE(1)
                // Why 1 - because since it is not there, it is the first time, I want it to be 1.
            } else {
                counter.put( each,   counter.get(each)  + 1      );
                // if the character is among the KEYS, then UPDATE the KEY, with the +1 value
                // use the .get(key); method to get the VALUE and add 1
            }

//            This is doing exact same thing as above
//            if (counter.containsKey(each)) {
//                counter.put( each,   counter.get(each)  + 1      );
//            } else {
//                counter.put(each, 1);
//            }

            //counter.put(each, 1);
        }

        System.out.println(counter);

    }
}
