package day38_a_abstarction_interface.shopping;

public interface AllowUserToSell {
    // We are passing the methods from Shipping and AllowUserToSell interfaces to the ConsumerApp interface

    // going (inheriting) from interface to interface, we use "extends".
// NOte: Remember these are interface, they do not follow the smae rules as classes
// We CAN extend multiple interface
    public interface ConsumerApp extends AllowUserToSell, Shipping {

    }


    // Here we are implementing two interface to a class: AllowUserToSell, Shipping
    abstract class TestA implements AllowUserToSell, Shipping {

    }

    // Here I am implementing ConsumerApp interface which also inherits from interfaces called: AllowUserToSell, Shipping
    abstract class TestB implements ConsumerApp {

    }


// interface can "extends" multiple interface
// class can "extends" ONE class
// class can "implements" multiple interfaces
}
