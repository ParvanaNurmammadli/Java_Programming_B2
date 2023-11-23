package day38_a_abstarction_interface.shopping;

public abstract class OnlineShopping extends Shopping implements Shipping {

    public abstract void viewCart ();

}


// If i have a child class which is CONCRETE, how many method it has to implement