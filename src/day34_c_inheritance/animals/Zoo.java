package day34_c_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {
        Animal animalOne = new Animal();
        animalOne.species = "Generic Animal";
        animalOne.numberOfLegs = 0;
        animalOne.walk();


        Dog dogOne = new Dog();
        dogOne.species = "Golden Retriever";
        dogOne.numberOfLegs = 4;
        dogOne.walk();
        dogOne.bark();
        //dogOne.roar();  NO direct IS-A relation
        // I cannot say DOg IS-A LION



        Lion lionOne = new Lion();
        lionOne.species = "White Lion";
        lionOne.numberOfLegs = 4;
        lionOne.walk();
        lionOne.roar();


    }

}


