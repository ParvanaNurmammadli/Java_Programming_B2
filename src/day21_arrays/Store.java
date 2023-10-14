package day21_arrays;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String []  items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPhones"};
        boolean hasJacket = false;
        // Do we have a Jacket in the store?

        // Here we just did simple String method chaining and check if it contains.
        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket"));


        // With loop
        //{"Shoes", "Jackets", "Gloves", "Airpods", "IPhones"};
        for ( String each : items) {

            if (each.equalsIgnoreCase("gloves")) {
                hasJacket = true;
                break;
            }
        }

        if (hasJacket) {
            System.out.println("We have it");
        } else {
            System.out.println("We do not have it");
        }

        System.out.println(hasJacket ? "We have it" : "We do not have it" );

        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket") ? "We have it" : "We do not have it");




        // As a user to give you how many items are in stock
        // Then store those item names into String array by asking items name to the user
        // Then ask a user which item they are looking for.
        // If it exist, print --- > Item is in stock
        // if not, print --- >  item is not in stock






    }
}

