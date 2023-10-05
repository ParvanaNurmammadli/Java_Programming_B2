package day4_variables;

public class Fruits {


        public static void main (String [] args) {


            int apples = 50;
            int grapes = 100;
            int bananas = 150;


            //int  apples = 50, grapes = 100, bananas = 150; //-- > You can declare in this way as well if all these THREE variables have SAME DATA TYPE

            System.out.println("This is how many apples we have " + apples);
            // + ---- > plus sign here is not ADDITION.
            // Ii is called CONCATENATION -- > [KON - KATI - NEYSHIN]

            System.out.println("Grapes: " + grapes);
            System.out.println("Bananas: " + bananas);


            System.out.println("I sold some apples - 10 apples sold");
            apples = 30;
            System.out.println("Apples after I sold: " + apples);

            int price = 150;
            System.out.println("The price of my 30 apple is 150"); // Hard coded.
            System.out.println("The price of my " + apples + " apple is " + price);  // Dynamic

            System.out.println(apples);




        }
    }

