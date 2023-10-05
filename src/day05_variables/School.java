package day05_variables;

public class School {

    /*
            class name: School

            declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5

            total number of students in your school

            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]

            print all of the variables with unique messages

    */
    public static void main (String [] args){
        int numberOfStudentsInGrade1 = 32;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 26;
        int numberOfStudentsInGrade4 = 14;
        int numberOfStudentsInGrade5 = 48;

        // How can I calculate the total number of students ?
        //int totalNumberOfStudents =  31 + 40 + 26 + 10 + 38;
        int totalNumberOfStudents =  numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;


        double numberOfDaysInAYear = 100.5;
        double numberOfSnowDaysInAYear = 10;
        double averageGPAInSchool = 3.5;


        System.out.println("Number of Students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of Students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of Students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of Students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of Students in Grade 5: " + numberOfStudentsInGrade5);

        // System.out.println("Total Number of Students: " + numberOfStudentsInGrade1 + numberOfStudentsInGrade2); // This will concatenate
        System.out.println("Total Number of Students: " + totalNumberOfStudents);

        System.out.println("Number of Dats in a Year:" + numberOfDaysInAYear);

        // variableName.sout
        //System.out.println(numberOfSnowDaysInAYear);
        // variableName.soutv
        System.out.println("Number Of Snow Days In A Year: " + numberOfSnowDaysInAYear);

        System.out.println("Average GPA In School: " + averageGPAInSchool);


    }


}