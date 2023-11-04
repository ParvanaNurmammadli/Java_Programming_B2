package day30_b_custom_classes;

public class App {
    String name;
    double version;
    boolean isFree;


    // My custom method with no return
    public void run () {
        System.out.println(name + " is running...");
    }


    public void update () {
        System.out.println(name + " updating...");
        version++;
    }


}



