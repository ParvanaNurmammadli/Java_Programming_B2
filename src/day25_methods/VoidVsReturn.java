package day25_methods;



    public class VoidVsReturn {

        public static void main(String[] args) {
            hello();
            bye(); // Once we call this method, it returns a data to us but in this line, we have not used it as part of any code.
            System.out.println(bye());

            String str = bye();
            System.out.println(str);

        }

        public static void hello () {
            System.out.println("Hello");
        }


        public static String bye () {
            return "Bye";
        }

    }

