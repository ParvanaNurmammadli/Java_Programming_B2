package day27_index;




    import java.util.Scanner;

    public class ParseNumbers {
        public static void main(String[] args) {

            String strYear = "2023";

            int year1 = 2023;
            Integer year2 = 2023;  // Autoboxing from - > int - > Integer
            Integer year3 = year1; // Autoboxing from - > int - > Integer

            System.out.println("Current year: " + year1);  // 2024
            System.out.println("Next year: " + (year1 + 1) );  // 2024

            System.out.println("------------------");
            System.out.println("Current year: " + strYear);  // 20231
            System.out.println("Next year: " + (strYear + 1) );  // 20231


            System.out.println("------------------");
            // Convert a String number into int
            int numYear = Integer.parseInt(strYear); // String --- > int
            System.out.println("Current year: " + numYear);  // 20231
            System.out.println("Next year: " + (numYear + 1) );  // 20231


            //System.out.println("------------------");
            //String strNum = "2023YY";
            //int num2 = Integer.parseInt(strNum);  //NumberFormatException -- You CANNOT convert non-numerical letters into number
            //System.out.println(num2 + 2);


            System.out.println("-----------------------");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter you message: I am x years old");
            String response = input.nextLine(); // "I am 5 years old"

            // I can split it " " and assign it into array, then get the index of 2.
            //response.split(" ");  // [I, am, 5, years, old]
            String ageStr = response.split(" ")[2];  // 5
            int age = Integer.parseInt(ageStr);

            System.out.println("In five year, you will be " + (age + 5) + " years old.");


        }
    }

