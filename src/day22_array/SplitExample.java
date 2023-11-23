package day22_array;



    import java.util.Arrays;

    public class SplitExample {
        public static void main(String[] args) {

            String str = "monday,tuesday,wednesday,thursday,friday";
            String [] days = str.split(",");
            for ( String eachElem : days) {
                System.out.println(eachElem);
            }
            System.out.println();

            String [] days2 = str.split("day");
            for ( String each : days2) {
                System.out.println(each);
            }


            System.out.println("----------------------------------------");
            String months = "jan-feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
            // Can you get the each month/
            // The code below is going to be a really long code which is NOT useful
            String month1 = months.substring(0, months.indexOf("-"));
            System.out.println(month1);
            months = months.replaceFirst(month1+"-", "*" );
            System.out.println(months);
            String month2 = months.substring(0, months.indexOf("-"));
            System.out.println(month2);

            // We can use split() method
            String [] allMonth = months.split("-");
            for (String eachMonth : allMonth) {
                System.out.println(eachMonth);
            }


            //"*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
            String [] arr2 = months.split("y-");
            for ( String eachPart : arr2) {
                System.out.println(eachPart);
            }
            System.out.println(Arrays.toString(arr2)); //["*feb-mar-apr-ma", "jun-jul-avg-sep-nov-oct-dec"]


            //"*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
            System.out.println("-----------------");
            String [] arr3 = months.split(""); // ["*", "f", "e", "b", "-", "m".............]
            for (String eachElem : arr3) {
                System.out.println(eachElem);
            }



            //"*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
            System.out.println("-----------------");
            String [] arr4 = months.split("java");
            for ( String each : arr4) {
                System.out.println(each);
            }
            System.out.println(arr4.length);
            System.out.println(Arrays.toString(arr4)); // ["*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec"]
            System.out.println(arr4[0]);




        }
    }

