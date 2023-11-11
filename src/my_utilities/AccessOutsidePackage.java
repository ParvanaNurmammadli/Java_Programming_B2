package my_utilities;


import day33_b_encapsulation.accsess_modifiers.AccessModifier;
import day33_b_encapsulation.accsess_modifiers.AccessModifier;

public class AccessOutsidePackage {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);  // CAN ACCESS
        //System.out.println(obj.b);  // CANNOT  ACCESS
        //System.out.println(obj.c);  // CANNOT ACCESS


        System.out.println(AccessModifier.x); // CAN ACCESS
        //System.out.println(AccessModifier.y); // CANNOT ACCESS
        //System.out.println(AccessModifier.z); // CANNOT ACCESS

        // 'c' and 'z' are NOT ACCESSIBLE out-side of the class.
        //Because they have PRIVATE modifiers**
        //'b' and 'y' are NOT ACCESSIBLE out-side of the package
        //Because they have DEFAULT modifiers*/
        //
        //
        //
        //


    }

}