package day44_map_and_functions.map_recap;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        Map <String, Double > map = new HashMap<>();
        map.put("Alina", 1_200_000.00);
        map.put("Sergii", 200_000.00);
        map.put("Anna", 150_000.00);
        map.put("Davyd", 210_000.00);
        map.put("Denys", 140_000.00);
        map.put("Ramiz", 290_000.00);

        System.out.println(map);

        //1.1 who has the maximum salary?
        //1.2 who has the minimum salary?

        String nameForHighest = "";
        double highestSalary = 0.0;  // Double.MIN_VALUE; //// Lowest possible number to get started

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE; // Biggest possible number to get started

        for ( String eachKEY : map.keySet()) {

            double value = map.get(eachKEY);  // map.get("Alina"); --- > 1_200_000.00

            if (value > highestSalary) {
                nameForHighest = eachKEY;
                highestSalary = value;
            }

            if (value < lowestSalary) {
                nameForLowest = eachKEY;
                lowestSalary = value;
            }

        }

        System.out.println("Highest Salary: $" + highestSalary + " for " + nameForHighest);
        System.out.println("Lowest Salary: $" + lowestSalary + " for " + nameForLowest);


     /*

        // [12, 4, 5, 77, 85, 1, 23]
        // int lowest = Integer.MAX_VALUE;     --- >   100_000
        //      if (12 < lowest)        if (4 < lowest)              if (5 < lowest)
        //      if (12 < 100_000){      if (4 < 12){                 if (5 < 4){
        //          lowest = 12;            lowest = 4;                  lowest = 5;
        //      }                       }                            }

        // [12, 4, 5, 77, 85, 1, 23]
        // int highest = Integer.MIN_VALUE;    --- >   -100_000
        //      if (12 > highest)       if (4 > highest)            if (5 > highest)
        //      if (12 > -100_000){     if (4 > 12){                if (5 > 12){
        //          lowest = 12;            lowest = 4;                  lowest = 3;
        //      }                       }                            }


        */

        System.out.println("-------------------------------------");
        //  how many employees has the salary between 120k ~ 200K?
        int counter = 0;
        for (Double eachValue : map.values()) {
            if (eachValue >= 120_000 && eachValue <= 200_000) {
                counter++;
            }
        }

        System.out.println("Number of the people who makes more than 120K inclusive and less than 200K inclusive: " + counter);



        System.out.println("-------------------------------------");
        //display the names of the employees who are making less than 170k?
        for ( String eachKEY: map.keySet()) {
            if(map.get(eachKEY) < 170_000) {
                System.out.println(eachKEY);
            }
        }


        System.out.println("-------------------------------------");
        //increase the salary of each employee by 10K
        System.out.println(map);
        for (  String eachKEY :  map.keySet()) {
            map.put( eachKEY, map.get(eachKEY) + 10_000  );
        }
        System.out.println(map);


        System.out.println("-------------------------------------");
        // 2nd way to do it.
        System.out.println(map);
        for (Map.Entry<String,Double> each : map.entrySet()){
            map.put(each.getKey(), each.getValue() + 20_000);
        }
        System.out.println(map);

    }
}
/*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */