package day09_a__scanner;

public class SingleIfExamples {

    public static void main(String[]args){

        if(true) {

         System.out.println("Hello Wordl");
        }

        System.out.println("Second line");

        if(true){ // since the condidtion is true the code inside of the if body will be executed

            System.out.println("Today is Saturday");
        }

        int score=60;
        if(score >=75){
            System.out.println("You passed the exam");

            if(score<75) {
                System.out.println("You Failed");

            }

        }
            }
}
