package day34_b_encapsulation.pizza;

public class PizzaStore { public static void main(String[] args) {

    Pizza pizzaOne = new Pizza("Tall", -3);

    //System.out.println(pizzaOne.size);
    //System.out.println(pizzaOne.numberOfToppings);

    System.out.println(pizzaOne.getSize());
    System.out.println(pizzaOne.getNumberOfToppings());



    Pizza pizzaTwo = new Pizza("small", 3);
    System.out.println(pizzaTwo.getSize());
    System.out.println(pizzaTwo.getNumberOfToppings());

    pizzaTwo.calculatePrice();
    System.out.println(pizzaTwo);



}
}




