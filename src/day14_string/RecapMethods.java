public class RecapMethods {
    public static void main (String [] args) {

        String s = "pen"; // s is a String literal, si it is in the String Pool
        String s2 = new String ("pen");  // s2 is object in the heap, because we used 'new' keyword


        System.out.println("Compare with == " + (s == s2) );  // == ---- > compares the memory location. So, it will be false
        System.out.println("Compare with .equals(String) " + (s.equals("pen")) );  // == ---- > compares the values to be EXACT same. So, it will be true


        System.out.println("Compare with .equals(String) " + (s.equals("Pen")) );  // == ---- > compares the values to be EXACT same. So, it will be false
        s = "Pen";
        System.out.println("Compare with .equals(String) " + (s.equals("Pen")) );  // == ---- > compares the values to be EXACT same. So, it will be true
        String ss = "Pen";
        System.out.println("Compare with .equals(String) " + (s.equals(ss)) );  // == ---- > compares the values to be EXACT same. So, it will be true

        s= "PEN";
        ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss);  // This will compare two objecs value by ignoring the CASE SENSITIVENESS
        System.out.println(isSame);// true

        if(isSame) {
            System.out.println("Hello");
        }

        ss = "PENN";

        if(s.equalsIgnoreCase(ss)) {  // PEN <---> PENN    |    pen <----> penn
            System.out.println("Hello");
        } else  {
            System.out.println("Bye");
        }


        System.out.println("-------------");
        // s  --- > PEN
        // ss --- > PENN
        System.out.println(s.length()); // 3
        System.out.println(ss.length()); // 4

        int a = s.length(); // 3
        int b = ss.length(); // 4



        if (s.length() < 4) {  // 3 < 4
            System.out.println("Short word");
        }


        if (a < 4) {  // 3 < 4
            System.out.println("Short word");
        }


        System.out.println("----------------");
        System.out.println("aaaaaa".length()); // 6
        System.out.println("a    a".length()); // 6
        System.out.println("".length()); // 0
        System.out.println(""); // This is just an empty String


    }
}
