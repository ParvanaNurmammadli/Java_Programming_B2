package day36_inheritance.final_example;


    //public class UseFinalExample extends FinalExample {
//This is not valid because FinalExample class is final which means we CANNOT inherit
    public class UseFinalExample  {
        public static void main(String[] args) {

            FinalExample obj = new FinalExample();
            System.out.println(obj.a);
            //obj.a = 10; // since a is final instance variable, we CANNOT change the value.
            System.out.println(obj.a);


            System.out.println();
            FinalExample obj2 = new FinalExample(20);
            System.out.println(obj2.a);
            System.out.println(obj2.b);


            System.out.println();
            System.out.println(FinalExample.PLANET);
            //FinalExample.PLANET = "Mars"; // since PLANET is final, we cannot change the value.
            System.out.println(FinalExample.PLANET);




        }


    }

