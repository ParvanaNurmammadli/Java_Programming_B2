package day36_inheritance.final_example;

public class Main {
    public static void main(String[] args) {

//        Parent p = new Parent();
//        p.walk();
        new Parent().walk();
        new Child().walk(); //


    }
}


class Parent{

    public final void walk () {
        System.out.println("You are walking in Parent class" );
    }

}

class Child extends Parent {


//    @Override
//    public void walk () {
//        System.out.println("You are walking in Child class");
//    }


    // Here we are just OVERLOADING THE FINAL WALK METHOD
    public void walk (String name) {
        System.out.println("You are walking in Child class");
    }

}
