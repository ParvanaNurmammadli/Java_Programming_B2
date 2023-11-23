package day38_a_abstarction_interface.shopping;


    //This is the first NON_ABSTRACT class / CONCRETE class
// We must override/implement all the abstract methods coming from parent classes
    public class Target extends Shopping {

        @Override
        public void buyItem() {
            System.out.println("Buying from Target");
        }

        @Override
        public void returnItem() {
            System.out.println("Returning item to Target");
        }



    }


