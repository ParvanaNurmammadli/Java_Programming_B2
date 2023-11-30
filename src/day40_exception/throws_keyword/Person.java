package day40_exception.throws_keyword;
public class Person {

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty() || name == null) {
            //System.out.println("You cannot assign empty string");
            throw new Exception("You cannot assign empty string");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120 ){
            throw new IllegalArgumentException("Age should be more than 0 or less than 120");
        }
        this.age = age;
    }
}




