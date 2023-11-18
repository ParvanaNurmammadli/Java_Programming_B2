package day36_inheritance.hiding;

public class Person {
    String name = "Tom Jerry";
}

class Child extends Person {

    // Similar to static, all the variables inherited to child class and child class
    // has variable with the same name, it will hide the one from parent.
    String name = "Micky Mouse";
}

class Runner {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);

        System.out.println();

        Child child = new Child();
        System.out.println(child.name);
    }

}
