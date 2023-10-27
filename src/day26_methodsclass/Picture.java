package day26_methodsclass;

public class Picture {
    // Method Overloading.
    // When we have same method name and different parameters (different amount, different datatype)

    public static void draw () {
        System.out.println("Trying to draw...");
    }
    // Being void or return type does not matter
//    public static boolean draw () {
//        System.out.println("Trying to draw...");
//        return false;
//    }

    public static void draw (String color) { // Single param
        System.out.println("Trying to draw with " + color);
    }

    public static void draw (int size) { // Single param
        System.out.println("Trying to draw with size of " + size);
    }

//    You CANNOT have same method name and same exact parameter in the same class
//    public static void draw (int size) { // Single param
//        System.out.println("Trying to draw with size of " + size);
//    }

    public static void draw (String color, String color2) {
        System.out.println("Trying to draw with colors: " + color + " and " + color2);
    }


    public  static void  draw (String color, int size) {
        System.out.println("Drawing with " + color + " in size of " + size);
    }


    public  static void  draw (int size, String color ) {
        System.out.println("Drawing with " + color + " in size of " + size);
    }


    // Type promotion:  If the method exist with the matching data type, it call that one.
    // If it does not exist, it will check the one higher one.
    // int > long > float > double
    public static void test (double d) {
        System.out.println("Testing method with double: " + d);
    }


//    public static void test (int d) {
//        System.out.println("Testing method with double: " + d);
//    }






}




