package day35_inheritance.book;

public class Author {

    private String name;
    private int age;


    public Author (String name, int age){
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 ) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }
}

