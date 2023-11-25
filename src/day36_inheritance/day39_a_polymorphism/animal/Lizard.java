package day36_inheritance.day39_a_polymorphism.animal;

public class Lizard extends Animal {

    public int numberOfClaws;
    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD IS EATING");
    }
}
