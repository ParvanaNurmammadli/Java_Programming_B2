package day32_custom_classes;

public class Company {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alina", "Secret Agent");
        //System.out.println(emp1.name); //
        //System.out.println(emp1.jobTitle); //
        System.out.println(emp1);


        System.out.println();
        Employee emp2 = new Employee("Nadir", 101, "SDET", 100_000);
        System.out.println(emp2);


        System.out.println();
        emp1.goToMeeting();
        emp2.goToMeeting();

    }


}


