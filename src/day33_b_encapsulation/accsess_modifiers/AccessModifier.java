package day33_b_encapsulation.accsess_modifiers;

public class AccessModifier {
    public int a; // public access modifier
    int b;  // default access modifier
    private int c; // private access modifiers



    public static int x;
    static int y;
    private static int z;


    /**
     * In the SAME CLASS
     */
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);  // CAN ACCESS
        System.out.println(obj.b);  // CAN ACCESS
        System.out.println(obj.c);  // CAN ACCESS


        System.out.println(AccessModifier.x); // CAN ACCESS
        System.out.println(AccessModifier.y); // CAN ACCESS
        System.out.println(AccessModifier.z); // CAN ACCESS

        /**
         * all are accessible in the SAME class
         */



    }

}
