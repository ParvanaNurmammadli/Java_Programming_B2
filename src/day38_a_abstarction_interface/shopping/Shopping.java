package day38_a_abstarction_interface.shopping;


// Abstract class - cannot instantiate
// can have abstract method
// cant have all the other instance and static members.
// can have constructor
public abstract class Shopping {

    public double price;

    public abstract void buyItem();


    public abstract void returnItem ();
}