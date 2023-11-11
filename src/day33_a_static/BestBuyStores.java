package day33_a_static;



    import java.util.Scanner;

    public class BestBuyStores {
        public static void main(String[] args) {

            BestBuy store1 = new BestBuy("Fairfax");
            BestBuy store2 = new BestBuy("McLean");
            BestBuy store3 = new BestBuy("Falls Church");

            System.out.println(store1.location);
            System.out.println(store2.location);
            System.out.println(store3.location);

            System.out.println();
            store1.location = "Alexandria";
            System.out.println(store1.location);
            System.out.println(store2.location);
            System.out.println(store3.location);



            System.out.println();
            System.out.println(store1.headQuarter);
            System.out.println(store2.headQuarter);
            System.out.println(store3.headQuarter);

            System.out.println();
            store1.headQuarter = "Texas, US";
            System.out.println(store1.headQuarter);
            System.out.println(store2.headQuarter);
            System.out.println(store3.headQuarter);

            System.out.println(BestBuy.headQuarter);


            System.out.println();
            System.out.println(store1.day);
            System.out.println(store2.day);
            System.out.println(store3.day);

            System.out.println();
            BestBuy.day = "Sunday";
            System.out.println(store1.day);
            System.out.println(store2.day);
            System.out.println(store3.day);


            System.out.println();
            store1.day = "Weekend";
            store2.day = "Weekday";
            System.out.println(store1.day);
            System.out.println(store2.day);
            System.out.println(store3.day);
            System.out.println(BestBuy.day); //

//------------------------------------------------------------------------

            System.out.println();
            //BestBuy.openStore();
            store1.openStore();
            store2.openStore();
            store3.openStore();

            System.out.println();
            store1.countStock();  // NOT RECOMMENDED
            store2.countStock();
            store3.countStock();
            BestBuy.countStock(); // Use class name to call static method


        }
    }









