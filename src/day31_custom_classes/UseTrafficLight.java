package day31_custom_classes;



    public class UseTrafficLight {
        public static void main(String[] args) {


            // Object reference = actual Object
            //                    new constructor;
            TrafficLight light1 = new TrafficLight("yellow");
            System.out.println(light1.light);

            TrafficLight light2 = new TrafficLight("red");
            System.out.println(light2.light);


            // light2.light = "red";


        }

    }

