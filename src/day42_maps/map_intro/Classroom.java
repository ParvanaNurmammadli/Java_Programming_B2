package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student studentOne = new Student("Tom", 25, 234);
        map.put(1, studentOne);

        System.out.println(map.get(1));


        map.put(2, new Student("Mickie", 26, 556));
        System.out.println(map.get(2));

        map.put(3, new Student("Winnie", 30, 999));
        map.put(4, new Student("James", 45, 777));

        System.out.println();


        System.out.println(map);

        System.out.println();
        // How can I get the name of the person who is paired with the KEY 3
        System.out.println(map.get(3).name);

        //-----------------------------------------------
        System.out.println();
        // Looping through map

        System.out.println(map.keySet()); // this will return the Set of the KEYS - all keys


        for (Integer each : map.keySet()) {
            System.out.println("KEY: " + each);
            System.out.println("VALUE: " + map.get(each));
            System.out.println();
        }


        System.out.println();
        // Can you loop though the map and find me the Student who id is 777
        for (Integer each : map.keySet()) {
            if (map.get(each).id == 777) {
                System.out.println(map.get(each));
            }
        }


        System.out.println();
        System.out.println(map.values()); // This will return the group of VALUES
        // Can you loop though the map and find me the Student who id is 777
        for ( Student each : map.values()){
            if (each.id == 777) {
                System.out.println(each);
            }
        }


        System.out.println("---------------------");
        // Another way to loop through map
        for (  Map.Entry <Integer, Student> each : map.entrySet() ) {

            System.out.println("Each KEY: " + each.getKey());
            System.out.println("Each VALUE: " + each.getValue());
        }






    }
}
