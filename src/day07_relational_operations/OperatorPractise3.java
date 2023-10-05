package day07_relational_operations;

public class OperatorPractise3 {

    public class OperatorPractice3 {
        public static void main (String [] args) {
            int h = 5; // I declared an int variable called h and assign a value 5 to it.
            int p = h; // I declared an int variable called p and assigned a value from variable h

            h++;  // post-increment - no other code | Just increase by 1
            System.out.println("h: " + h); //Output: 6
            System.out.println("p: "+ p); //Output: 5

            int k = h++;  //
            System.out.println("h: " + h);  // 7
            System.out.println("k: " + k);  // 6


            int g = ++h;
            System.out.println("h: " + h);
            System.out.println("g: " + g);




        }
    }
}
