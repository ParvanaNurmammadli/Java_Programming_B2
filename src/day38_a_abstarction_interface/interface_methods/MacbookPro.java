package day38_a_abstarction_interface.interface_methods;


    public class MacbookPro implements Mac{
        public void turnOn() {
            System.out.println("Macbook is turning on");
        }
    }


    class Runner {
        public static void main(String[] args) {

            System.out.println(Mac.NAME);
            System.out.println(Mac.OS);

            System.out.println(MacbookPro.NAME);
            System.out.println(MacbookPro.OS);
            // You can do this, meaning you can call interface public static final variable
            // with the class name which implements that interface.
            // But it is NOT GOOD PRACTIVE
            // If those variables belongs to interface, use the interface name to call them.

            System.out.println();

            MacbookPro obj = new MacbookPro();
            obj.turnOn();
            obj.facetime();
            //obj.company();
            // this is static method in INTERFACE
            // and static method in interface, do NOT get inherited.
            // They can be accessed only by the interface name
            Mac.company();

        }
    }


