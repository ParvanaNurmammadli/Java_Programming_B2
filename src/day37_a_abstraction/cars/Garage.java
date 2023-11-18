package day37_a_abstraction.cars;

public class Garage { public static void main(String[] args) {
    //Car obj = new Car ();
    // Car class is abstract
    // That is why cannot have object.

    Toyota obj2 = new Toyota();
    obj2.start();

    System.out.println();

    Honda obj3 = new Honda();
    obj3.start();


    // The first NON-ABSTRACT CHILD classes are called
    // CONCRETE classes

    System.out.println();
    Tesla obj4 = new Tesla();
    obj4.start(); // defined in Car class
    obj4.charge(); // defined in ElectricClass

    // Tesla is first NON-ABSTRACT class which has to implement
    // all the abstract methods that is coming from parent or grandparent
    // and In Tesla, we MUST override all those abstract methods.

}

}

