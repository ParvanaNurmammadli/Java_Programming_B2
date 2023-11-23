package day38_a_abstarction_interface.interface_methods;

// Interface - > cannot be instantiated / cannot create object
// inst variables are - > CONSTANTS / public static final
// all methods with return type and name and with no body -- >  is public abstract methods.
public interface Mac {

    String NAME = "Mac"; //public static final

    String OS = "IOS";

    void turnOn();  // public abstract

    // Q: Is there a way to have a method in interface which has a body?
    // A: yes, there 2 options.


    //Option 1: is "public static" method
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release in November");
    }


    //Option 2: is "public default" method
    // NOTE: the "default" here is NOT the access modifier "default"
    public default void facetime() {
        System.out.println("Opening facetime");
        System.out.println("Calling facetime");
    }}