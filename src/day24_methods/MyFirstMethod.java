package day24_methods;


    import java.util.Arrays;

    public class MyFirstMethod {



        public static void helloWorld () { // void method: DOES the action. DOES NOT RETURN anything back.
            System.out.println("Hello World!");
        }

//    // In the same class we can NOT have two same method names with exact same parenthesis
//    public static void helloWorld (){
//    }

        public static void helloWorld50 () {
            for (int i = 0; i <50; i++) {
                //System.out.println("Hello World");
                helloWorld();
            }
        }


        public static void main (String[] args) {
            helloWorld();  // I am calling the method with its name
            helloWorld();
            System.out.println("----------------");

            helloWorld50();
            helloWorld50();

        }




    }

