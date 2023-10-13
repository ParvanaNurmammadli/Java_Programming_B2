package day06_arithmetic_operators;

public class House {

        /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */
        public static void main (String [] args){
            String houseType = "Single House";
            int numberOfBedroom = 5;
            int numberOfBathroom = 3;
            int numberOfKitchen = 2;
            boolean hasBasement = true;
            boolean hasAttic = false;
            boolean isOnSale = false;
            double price = 9_999_999.99; // 9,999,999.99
            String address = "123 Central Park, NY";
            int zipcode = 12321;
            boolean hasPark = true;
            double rating = 4.9;

            String result = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + price + ". \nThe " + houseType + " has " + numberOfBedroom + " bedrooms, has " + numberOfBathroom + " bathrooms, and has " + numberOfKitchen + " kitchen. \nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic + " and, has a park: " + hasPark + ", is on sale: " + isOnSale + "\nThe schools in the area have a rating of " + rating;


            System.out.println(result);



        }



    }


