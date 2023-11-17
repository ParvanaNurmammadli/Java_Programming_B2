package day35_inheritance.person;

public class Runner {
    public static void main(String[] args) {

        Person objOne = new Person();
        objOne.name = "Eyad";
        objOne.age = 25;
        objOne.favoriteHobby = "Java";
        objOne.talk();
        //objOne.study();
        // .study() method is in CHILD class and nothing inherits from CHILD to PARENT. Since I am trying to reach it with Parent class object, not able to.


        Student studentOne = new Student();
        studentOne.name = "Valentina";
        studentOne.age = 23;
        studentOne.favoriteHobby = "Of course Java";
        studentOne.talk();
        studentOne.study();
        studentOne.grades = 'A';
        System.out.println(studentOne.grades);



    }
}
