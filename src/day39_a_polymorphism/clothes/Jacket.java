package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {

    @Override
    public void wear () {
        System.out.println("Wearing a jacket");
    }


    @Override
    public void putOnHood () {
        System.out.println("Putting on the jacket hood");
    }




}
