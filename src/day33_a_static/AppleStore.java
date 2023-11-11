package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Iphone 14", 999.99);
        Iphone phone2 = new Iphone("Iphone 15", 1099.99);

        System.out.println(phone1);
        System.out.println(phone2);

        //System.out.println(Iphone.company);
        //System.out.println(phone1.company);
        //System.out.println(phone2.company);

        System.out.println(Iphone.company); // Apple
        System.out.println(Iphone.os);

        System.out.println(Iphone.appleDay);


    }

}



