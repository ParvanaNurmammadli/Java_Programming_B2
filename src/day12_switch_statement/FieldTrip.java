package day12_switch_statement;

/*
Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

declare and assign the grade level variable

    only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
        so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location -  Zoo
        number of groups - 2
        teacher in charge - Ms. Tom
 */
public class FieldTrip {
    public static void main(String[] args) {

        int gradeLevel = 8;  // input.nextInt();
        String location = ""; // empty string
        int numOfGroups = 0;
        String teacher = "";


        /*
                if grade ---- > 1 => grade <= 6

                else ------ > "Grade must be between 1-6"
         */

        if (gradeLevel >= 1 && gradeLevel <= 6) {



            if (gradeLevel == 1) {
                location = "Apple orchard";
                numOfGroups = 2;
                teacher = "Ms. Smith";

            } else if (gradeLevel == 2) {
                location = "Zoo";
                numOfGroups = 3;
                teacher = "Ms. Tom";

            } else if (gradeLevel == 3) {
                location = "Aquarium";
                numOfGroups = 4;
                teacher = "Ms. Jerry";

            } else if (gradeLevel == 4) {
                location = "Movie";
                numOfGroups = 2;
                teacher = "Ms. VinniePu";

            } else if (gradeLevel == 5) {
                location = "Museum";
                numOfGroups = 3;
                teacher = "Ms. Carl";

            } else { // gradeLevel = 6;
                location = "Loopcamp";
                numOfGroups = 3;
                teacher = "Ms. Academy";
            }

            System.out.println("Field trip information for grade " + gradeLevel );
            System.out.println("\tLocation: " + location);
            System.out.println("\tNumber of groups: " + numOfGroups);
            System.out.println("\tTeacher in charge: " + teacher);



        } else {
            System.out.println("Grade must be between 1-6");
        }




    }


}
