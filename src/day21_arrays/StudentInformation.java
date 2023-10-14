package day21_arrays;
import java.util.Arrays;
import java.util.Scanner;




    /*
            0 - id
            1 - firstName
            2 - lastName
            3 - batchNumber
         */
    public class StudentInformation {
        public static void main(String[] args) {
            String [] studentOne = {"001", "Tom", "Jerry", "Batch#2"};
            System.out.println(Arrays.toString(studentOne));

            String [] studentTwo = new String[4];
            System.out.println(Arrays.toString(studentTwo)); //
            studentTwo[0] = "002";
            studentTwo[1] = "Mickey";
            studentTwo[2] = "Mouse";
            studentTwo[3] = "Batch#2";
            //studentTwo[4] =  --- > ArrayIndexOutOfBoundException
            System.out.println(Arrays.toString(studentTwo));


            Scanner input = new Scanner(System.in);
            String []  studentThree = new String[4];
            System.out.print("Enter id: ");
            studentThree[0] = input.next(); // "003"
            System.out.print("Enter name: ");
            studentThree[1] = input.next();
            System.out.print("Enter lastname: ");
            studentThree[2] = input.next();
            System.out.print("Enter batch number: ");
            studentThree[3] = input.next();

            System.out.println(Arrays.toString(studentThree));


            System.out.println("_____________________________________-");
            String [] questions = {"Enter id: ", "Enter name: ", "Enter lastname: ", "Enter batch number: "};
            //                         0              1                 2                       3
            String [] studentFour = new String[4];
            for (int i = 0; i < questions.length; i++) {
                System.out.println ( questions[i] );
                studentFour[i] = input.next();

            }
            System.out.println(Arrays.toString(studentFour));





        }
    }

