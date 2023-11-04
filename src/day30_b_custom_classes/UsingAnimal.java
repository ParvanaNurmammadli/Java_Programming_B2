package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animalOne = new Animal();

        // Assign values to object's instance variables.
        animalOne.species = "birds";
        animalOne.population = 1_000_000_000_000L;


        // If we want to print out the object directly, we MUST declare a method called .toString() in the class
        System.out.println(animalOne);
        //System.out.println(animalOne.toString()); // This is not the way to use with this toString() method.






    }

}



