package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Remove Countries

    Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
    @param nums - The given ArrayList of numbers @return - ArrayList of numbers
    Ex:
    Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
    Output: "Japan", "Korea", "Turkey", "Canada"
 */
public class RemoveCountries {
    public static ArrayList <String> removeCountries (ArrayList <String> countries) {
        ArrayList <String> updateCountries = new ArrayList<>(countries);

        updateCountries.removeIf( eachCountry -> eachCountry.length() > 7);

        return updateCountries;
    }


    public static void main(String[] args) {
        ArrayList <String> countries = new ArrayList<>(Arrays.asList( "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));

        System.out.println("Original Country List: " + countries);
        System.out.println( "Updated Country List: " + removeCountries(countries));

    }
}


