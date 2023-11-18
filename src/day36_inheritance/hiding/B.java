package day36_inheritance.hiding;

public class B  extends  A {
    @Override
    public void instanceMethod () {
        staticMethod();
    }


    public static void staticMethod () {
        System.out.println("Static from CHILD");
    }
}

