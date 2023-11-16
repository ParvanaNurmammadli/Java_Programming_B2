package day34_a_static.computer;

public class Computer {


    // ACCESS MODIF for these 3 fields: default
    // DEFAULT VALUES: brand = null, price = 0.0, color = null
    String brand;
    double price;
    String color;


    //static boolean hasScreen, hasBattery, hasMemory;
    // ACCESS MODIF for these 3 static variables: default
    // DEFAULT VALUES: hasScreen = false, hasBattery = false, hasMemory = false;
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;


    static {
        System.out.println("Static block run.");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    /**
     * The following is to explain when o use STATIC or NON-STATIC methods
     */
    // create a method that prints $brand and $hasMemory info
    // STATIC accepts only STATIC
    // Since my task requires me to use INSTANCE variable and STATIC variable and I know that STATIC accepts only STATIC. So, I need to use NON-STATIC method to be able to have access to instance variables inside of that method as well.

    public void test () {
        System.out.println("Brnad: " + brand);
        System.out.println("Memory: " + hasMemory);
    }

    public static void test2 () {
        //System.out.println("Brnad: " + brand);
        System.out.println("Memory: " + hasMemory);
    }}







