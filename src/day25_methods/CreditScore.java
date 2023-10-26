package day25_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // the value is not being used.
        int score = getCreditScore();  // the value is being stored into score variable
        System.out.println(score); // score variable is being used in print statement,

        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);


        System.out.println("--------------------");
        System.out.println(isGoodCreditScore(600));
        System.out.println(isGoodCreditScore(720));

        System.out.println("---------------------");
        System.out.println(   isGoodCreditScore(  getCreditScore()  )      );

        System.out.println("----------------------");
        System.out.println( isGoodCreditScore(500) ? "Is GOOD score" : "Is NOT GOOD score");

    }

    public static int getCreditScore (){  // non-parameterized return type method
        return 800;
    }


    //create a method to check if it is a good or not
    // good if bigger or equal 700
    // not good if less
    public static boolean isGoodCreditScore (int score) {

        if (score >= 700) {
            return true;
        } else  {
            return false;
        }


        // This is doing the same as above
        // return score >= 700;

        //System.out.println("hello");  // This line will never be reached in this specific code
    }


}


