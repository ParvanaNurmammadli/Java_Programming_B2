package day19_nested_loop;

public class NestedLoopExample {




        public static void main(String[] args) {

            //outer loop
            for (int week = 1; week <= 4; week++) {

                System.out.println("Week: " + week);

                // inner loop
                for ( int day = 1; day <= 7 ; day++) {  // day = 8;
                    System.out.println("Day " + day);
                }

                System.out.println();
            }


        }
    }
