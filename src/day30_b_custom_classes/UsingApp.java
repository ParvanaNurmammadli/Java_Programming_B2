package day30_b_custom_classes;

public class UsingApp {


    public static void main(String[] args) {

    App appOne = new App();
    appOne.name = "Etsy";
    appOne.version = 5.7;
    appOne.isFree = true;


    appOne.run(); //Etsy is running...
    System.out.println(appOne.version); //5.7
    appOne.update();
    System.out.println(appOne.version); // 6.7
    System.out.println(appOne.isFree); //

    System.out.println(appOne);  // This will show the memory location


    //Making new object and calling the run method.
    new App().run();  // null is running

    // This is completely new object which is different that the one in Lne 22
    System.out.println(new App().name); //null
}}
