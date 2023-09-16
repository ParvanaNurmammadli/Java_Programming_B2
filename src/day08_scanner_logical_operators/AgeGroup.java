package day08_scanner_logical_operators;

public class AgeGroup {

   public static void main(String []args){

      int age=10; // we have initialized the age variable and assign value 10 to it

       //age=<13;

      boolean isKid= age <=13;
      boolean isSenior=age >=65;

      System.out.println("You are a kid: "+ isKid);
      System.out.println("You are a senior:" + isSenior);
   }
}
