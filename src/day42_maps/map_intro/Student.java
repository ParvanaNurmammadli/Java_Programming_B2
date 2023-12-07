package day42_maps.map_intro;

public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student Info: " +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tId:" + id;
    }
}