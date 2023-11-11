package day33_a_static;

    public class BestBuy {

        String location; // instance variable


        static String headQuarter = "Minnesota, US";

        static String day = "Saturday";


        public BestBuy (String location){
            this.location = location;
        }
// Every object has its OWN copy of INSTANCE variables.
//  instance variables CANNOT be called by Class Name


// Every object has the SAME copy of STATIC variables
//  Static variable can be called by Class name and object reference name (but do not use obj ref name)

//------------------------------------------------------------------------

        // Instance method
        // They CANNOT be called by the class name
        // Instance method can ACCEPT - INSTANCE variable and STATIC variable
        // Instance CAN accept STATIC and INSTANCE
        public void openStore () {
            System.out.println("Opening " + location);
            System.out.println("Headquarter is " + headQuarter );
            //countStock();
        }


        // Static mehtod
        // Static methods can be called by Class (Use this always) and Object refer (But do not do it )
        // Static method can ONLY accept STATIC variables
        // STATIC ONLY ACCEPTS STATIC
        public static void countStock () {
            //openStore();
            //System.out.println("Counting stock in " + location);
            System.out.println("Headquarter is " + headQuarter );
        }




    }

