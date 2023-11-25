package day39_a_polymorphism.clothes;

public class Store {

    public static void main(String[] args) {
        // ALL POSSIBLE REFERENCES for TShirt

        // #1 - reference ITSELF
        TShirt tShirt1 = new TShirt();
        tShirt1.wear();


        // #2 - reference is SUPER (which is abstract class)
        Clothes tShirt2 = new TShirt();
        tShirt2.wear();


        // Object class
        Object tShirt3 = new TShirt();
        // tShirt3.wear();
        // Object class does not have reference to the wear() method


        // HasHood tShirt4 = new TShirt();
        // TShirt class does NOT implement HasHood interface.
        // That is why it canNOT a reference

        // -------------------------------------------------------
        System.out.println("--------------------------");


        // All possible references for Jacket

        //#1 - Itself
        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();


        //#2 - Super class
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //jacket2.putOnHood();
        //Clothes reference does NOT have access to putOnHood(); method.


        //#3 - Interface
        HasHood jacket3 = new Jacket();
        //jacket3.wear();
        // HasHood reference does NOT have access/visibility to wear();

        jacket3.putOnHood();


        Object jacket4 = new Jacket();
        //jacket4.wear();
        //jacket4.putOnHood();
        //Object class does NOT have reference to wear() and putOnHood() methods

        System.out.println();
        buy(tShirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());

    }


    public static void buy(Clothes clothes){

        if (clothes instanceof TShirt) {
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket){
            System.out.println("Bough Jacket");
        }

    }




}



