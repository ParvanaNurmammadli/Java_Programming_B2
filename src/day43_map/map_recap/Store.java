package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        // declare a HashMap with the reference being Map and ENTRY (key-value pair) will be String, Double
        Map <String, Double> store = new HashMap<>();

        store.put("Water", 1.9);  // Map <String, Double> map1 = new HashMap<>();
        store.put("Coffee", 2.9);
        store.put("Apples", 0.99);
        store.put("Bread", 3.99);
        store.put("Banana", 1.99);

        System.out.println(store);

        // how can I get the price of Apples?
        // If you want to get a VALUE which is related to a specific KEY we use mapName.get(keyName);
        System.out.println(  store.get("Apples")  );



        // loop through the store and give me the items.


        //Option 1 - with the help of .keySet(); --- >  it will return us all the KEYS
        // Set <Integer> setOfKey = new HashSet<>();
        //Set <String> setOfKeys = store.keySet();  // it will return us all the KEYS as Set
        System.out.println("Store Inventory");
        for (String each : store.keySet() ) {
            System.out.print("\t" + each);
            System.out.println("\t" + store.get(each));
        }

        System.out.println("---------------------------------");
        //loop through and get me the prices for Apples and Water
        for ( String each : store.keySet()) {
            if (each.equals("Apples") || each.equals("Water")) {
                System.out.println(each);
                System.out.println(store.get(each));
            }
        }


        System.out.println("*********************************");
        // Option 2 - with the help .values(); --- > it will return us all the VALUES
        System.out.println(store.values());
        for (Double each : store.values()) {
            System.out.println("Price of each item in store: " + each);
        }


        System.out.println("##########################################");
        // Option 3 - with the help  .entrySet(); --- > it will return us all the ENTRIES - every single KEY-VALUE pair is returned as a single Map on each cycle.
        for (  Map.Entry<String, Double>  each :  store.entrySet() ) {
            System.out.println("Item Name: " + each.getKey()); // this will return me the KEY side of the ENTRY
            System.out.println("Value of " + each.getKey() + " is $" + each.getValue()); // .getValue will return the VALUE side of ENTRY
        }


        // This is put here just to explain who the entrySet logic works.
        Map <String, Double> map1 = new HashMap<>();
        map1.put("Apples", 0.99);
        Map <String, Double> map2 = new HashMap<>();
        Map <String, Double> map3 = new HashMap<>();

        Map <Integer, Map<String, Double> > allMaps = new HashMap<>();
        allMaps.put(1, map1);



        //Use scanner to ask what item they want to get.
        Scanner input = new Scanner(System.in);
        System.out.print("What item do you want to check: ");
        String userItem = input.nextLine();




        // Check if item is in the store. If i it tell the info about item.

        String result = store.containsKey(userItem) ? userItem + " is in stock and price is " + store.get(userItem) : "Not available in Store";
        System.out.println(result);













    }
}