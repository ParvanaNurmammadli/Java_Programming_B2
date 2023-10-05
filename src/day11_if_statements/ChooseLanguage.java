package day11_if_statements;



import java.util.Scanner;

    public class ChooseLanguage {
        /*
            ask the user to enter a number based on the language they wanted to use.
            1 - English
            2 - Spanish
            3 - Turkish
            4 - Russian
            5 - French
            6 - Azerbaijan

            based on the number they picked print a message:

            1 : "hello, thanks for your call"
            2 : "hola, gracias para llamar"
            3 : "merhaba, aradiginiz icin tesekkurler"
            4 : "privet, spasibo za vash zvonok"
            5 : "Merci ,pour votre appel"
            6 : "salam, zeng etdiyiniz ucun mennatdariq"
            any other number: "We will use English by default"
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please choose option below: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian \n\t5 - French\n\t6 - Azerbaijan\n\n\tYour choice: ");

            int userOption = input.nextInt(); // 9

            String message = "";

            if (userOption == 1) {
                message = "hello, thanks for your call";
            } else if (userOption == 2) {
                message = "hola, gracias para llamar";
            } else if (userOption == 3) {
                message = "merhaba, aradiginiz icin tesekkurler";
            } else if (userOption == 4) {
                message = "privet, spasibo za vash zvonok";
            } else if (userOption == 5) {
                message = "Merci ,pour votre appel";
            } else if (userOption == 6) {
                message = "salam, zeng ettiginiz ucun mennatdariq";
            } else {
                message = "No valid option";
            }

            System.out.println("\n\t" + message);



        }
    }

