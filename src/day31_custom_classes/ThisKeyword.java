package day31_custom_classes;

public class ThisKeyword {

    int num = 100;

    public ThisKeyword (int num) { // PARAMETERIZED CONSTRUCTOR | int num = 200;
        //System.out.println(num);
        num = 400;  // num = 400;
        //System.out.println(num);

        //System.out.println("-----");
        //System.out.println(this.num);

        this.num = num;
    }

    /**
     * To differentiate the INSTANCE variable from LOCAL variable, we use 'this' keyword
     */



}

