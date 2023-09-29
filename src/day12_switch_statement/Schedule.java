package day12_switch_statement;



import java.util.Scanner;

/*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("What day of week is it and what is it about? ");
        String day = input.next();
        String result = "";

        switch (day) {

            case "Monday":
                result = "No classes for now, but it will soon start.\nIt will be mentor sessions from 7pm-10pm EST.\nMentor sessions will not be recorded. ";
                break;
            case "Tuesday":
                result = "No classes. Champions league doing Java task.";
                break;
            case "Wednesday":  case "Wed": case "WEDNESDAY":
            case "Thursday": case "Thu": case "THURSDAY":
            case "Saturday": case "Sat": case "SATURDAY": case "SAT":
                result = "We are having Java classes with Feyruz";
                break;
            case "Friday":
                result = "No classes but get ready for Saturday long hours";
                break;
            case "Sunday":
            case "SUnday, SUNDAY, SUn": // This will not match if you provide just 'SUn'. It will match it you provide the entire String "SUnday, SUNDAY, SUn"
                result = "It is kind of no class.But still important.";
                break;
            default:
                result = "Not valid day of week";
                break;
        }

        System.out.println(result);






    }

}
