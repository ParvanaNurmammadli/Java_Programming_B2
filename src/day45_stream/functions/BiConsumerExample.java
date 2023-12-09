package day45_stream.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer <String, Integer> printNTimes = (str, num) -> {
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        };

        printNTimes.accept ("loop", 4);
        printNTimes.accept ("hello", 2);

        System.out.println("--------------------------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);


        // .keySey()
        // .values()
        // .entrySet()

        // this is another way that we can loop through the MAP and get pair,  or just the key, or just the value depending on your task
        map.forEach (
                (key, value) -> {
                    System.out.println(key + " " + value);
                }
        );



    }
}