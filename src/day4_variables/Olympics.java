package day4_variables;

public class Olympics {

    /*
        class name Olympics

            create a variable for the year
            print the country and year for next couple events
            reassign year value each time. Country name is hard coded

            data:

                China 2022
                France 2026
                Italy 2030

            Look forward to the year $year for the Olympics to be in $location

     */

    public static void main (String [] args) {
        int year;

        System.out.println("The Olympics will be in these locations for the coming years:");

        year = 2022;
        System.out.println("In the year of " + year + ", the Olympic will happen in China");


        year = 2026;
        System.out.println("In the year of " + year + ", the Olympic will happen in France");

        year = 2030;
        System.out.println("In the year of " + year + ", the Olympic will happen in Italy");


    }
}