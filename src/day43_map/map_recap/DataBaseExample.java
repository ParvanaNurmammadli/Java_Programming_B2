package day43_map.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {

        Map <String, String> personOne = new HashMap<>();
        personOne.put("FIRST_NAME", "Tom");
        personOne.put("LAST_NAME", "Jerry");
        personOne.put("BATCH_NUMBER", "2");


        Map <String, String> personTwo = new HashMap<>();
        personTwo.put("FIRST_NAME", "Mickie");
        personTwo.put("LAST_NAME", "Mouse");
        personTwo.put("BATCH_NUMBER", "2");

        System.out.println(personOne);
        System.out.println(personTwo);




        List <Map <String, String>> listOfPeople = new ArrayList<>();
        listOfPeople.add(personOne);
        listOfPeople.add(personTwo);
        listOfPeople.add(   makeMap("Winnie", "Pooh", "2")  );
        listOfPeople.add(   makeMap("Eyad", "Quraan", "2")  );
        listOfPeople.add(   makeMap("Maya", "Asgarli", "2")  );
        listOfPeople.add(   makeMap("Zahid", "Musayev", "2")  );

        System.out.println(listOfPeople);

        // can you loop through the list and pring the first names only
        for ( Map <String, String> each : listOfPeople ){
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println();

        // WIth Traditionla FORI loop
//        for (int i = 0; i < listOfPeople.size(); i++) {
//            System.out.println(listOfPeople.get(i).get("FIRST_NAME"));
//        }

        System.out.println();
        // how can you ge the each map?
        for (Map <String, String> each : listOfPeople) {
            System.out.println(each);
        }

        System.out.println();
        // get me the Last name of the last person in list
        System.out.println(listOfPeople.get(listOfPeople.size()-1).get("LAST_NAME"));


        System.out.println();
        // get me all the last names which has "e"
        for ( Map <String, String> each : listOfPeople) {
            if (each.get("LAST_NAME").contains("e")){
                System.out.println(each.get("LAST_NAME"));
            }
        }








    }


    // make a method that accepts three parameters (fist_name, last_name, batch_number) and returns a Map
    public static Map <String, String> makeMap (String first_name, String last_name, String batch_number){

        Map <String, String> person = new HashMap<>();

        person.put("FIRST_NAME", first_name);
        person.put("LAST_NAME", last_name);
        person.put("BATCH_NUMBER",batch_number );

        return person;

    }




    // This is the overloaded version of makeMap method but used Object data and the VALUE side
//    public static Map <String, Object> makeMap (String first_name, String last_name, Integer batch_number){
//
//        Map <String, Object> person = new HashMap<>();
//
//        person.put("FIRST_NAME", first_name);
//        person.put("LAST_NAME", last_name);
//        person.put("BATCH_NUMBER", batch_number );
//
//        return person;
//    }
}
