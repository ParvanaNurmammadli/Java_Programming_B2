package day36_inheritance.access.a;
// DIFFERENT class but SAME package
public class Second {
    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four);
        // four is not accessible because it is private
        // private make is visible ONLY in the SAME CLASS

//        Second sec = new Second();
//
//        System.out.println(sec.one);
//        System.out.println(sec.two);
//        System.out.println(sec.three);
//        System.out.println(sec.four);

    }

}