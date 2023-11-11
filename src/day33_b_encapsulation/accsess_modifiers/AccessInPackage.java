package day33_b_encapsulation.accsess_modifiers;

public class AccessInPackage {
    /**
     * In the SAME PACKAGE but In the DIFFERENT CLASS
     */
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);  // CAN ACCESS
        System.out.println(obj.b);  // CAN ACCESS
        //System.out.println(obj.c);  // CAN NOT ACCESS

        System.out.println(AccessModifier.x); // CAN ACCESS
        System.out.println(AccessModifier.y); // CAN ACCESS
        //System.out.println(AccessModifier.z); // CANNOT ACCESS


        /**
         * 'c' and 'z' are NOT ACCESSIBLE out-side of the class.
         * Because they have PRIVATE modifiers
         */

    }



}

