package day25_methods;



    /*
    1 - Mon
    2 - Tue
    .
    .
    .
 */
    public class MethodWithOthers {

        // In switch we did not sue the break; because once the return statement reached, the method ends.
        public static String dayInWords (int day) {

            switch (day){
                case 1:
                    return "Mon";
                case 2:
                    return "Tue";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
                default:
                    return "Invalid Number";
            }
        }

        public static void main(String[] args) {

            System.out.println( dayInWords(1) );

        }

    }

