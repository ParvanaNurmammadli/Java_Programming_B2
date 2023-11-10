package day32_custom_classes;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;

    // create a constructor with two parameters - name & jobTitle
    public Employee (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    // create a constructor with four parameters - name, jobTitle, id, salary


    public Employee (String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    // create a method that say $name is going into meeting.
    public void goToMeeting() {
        System.out.println(name + " is going into meeting.");
    }

    @Override
    public String toString () {
        String result = "Info about the employee: " + name +
                "\n\tId:\t\t\t" + id +
                "\n\tJob Title:\t" + jobTitle +
                "\n\tSalary:\t\t$" + salary;

        return result;
    }
}

