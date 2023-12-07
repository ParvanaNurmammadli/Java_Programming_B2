package day42_maps.map_intro;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // - order is random, - null KEY is ok
        map.put("feyruz", "java");
        map.put("hello", "world");
        map.put("tom", "jerry");
        map.put("nadir", "sofskills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);


        Map<String, String> linked = new LinkedHashMap<>(); // -insertion order kept, -null KEY is ok
        linked.put("feyruz", "java");
        linked.put("hello", "world");
        linked.put("tom", "jerry");
        linked.put("nadir", "sofskills");
        linked.put("username", "password");
        linked.put(null, "nothing");
        System.out.println(linked);


        Map <String, String> treeMap = new TreeMap<>();// - KEYS are in SORTED order, - null is NOT ok
        treeMap.put("feyruz", "java");
        treeMap.put("hello", "world");
        treeMap.put("tom", "jerry");
        treeMap.put("nadir", "sofskills");
        treeMap.put("username", "password");
        //treeMap.put(null, "nothing");    // null is not ok as KEY
        System.out.println(treeMap);



        Map <String, String> hashtable = new Hashtable<>();    // - Order is not guaranteed, - null is NOT ok as KEY, - null is NOT ok as VALUE
        hashtable.put("feyruz", "java");
        hashtable.put("hello", "world");
        hashtable.put("tom", "jerry");
        hashtable.put("nadir", "sofskills");
        hashtable.put("username", "password");
        //hashtable.put(null, "nothing");    // nul is NOT ok as KEY
        //hashtable.put("test", null);   // null is NOT ok as VALUE
        System.out.println(hashtable);



    }

}
