package day23_multidimensionalarrays;



    public class AWS {
        public static void main(String[] args) {

            String zones = "us-east1, us-west1, us-south1, us-north1";
            String app = "Etsy";

            // Required Output: "$app is deploying on $us-east1"

            // I need to first get each zone - I can use .split method to separate each zone and store all of them into an array
            String [] zoneArr = zones.split(", ");  //["us-east1", "us-west1", .......] -- > size: 4


            // with foreach loop
            for ( String each  :   zoneArr ) {
                System.out.println(app + " is deploying on " + each);
            }
            System.out.println("----------------");


            // With traditional loop / fori loop
            for (int i = 0; i < zoneArr.length; i++) {
                System.out.println(app + " is deploying on " + zoneArr[i]);
            }











        }
    }

