package day25_methods;


    /*
Algorithm to drive the car.
    unlock the car
    open the door
    sit in the car
    close the door
    put the seatbelt
    start the engine
    put into drive mode and go
 */
    public class Car {

        // create a method the unlocks the door
        public static void unlockCar () {  // non-parameterized void method - > meaning nothing inside parenthesis
            System.out.println("Unlocking the car.");
        }

        public static void openDoor () {
            System.out.println("Opening the door");
        }

        public static void sitInCar () {
            System.out.println("Sitting in the car");
            System.out.println("Closing the door");
        }

        public static void getReadyToGo () {
            System.out.println("Putting on seatbelt");
            System.out.println("Check the mirrors");
            System.out.println("Put music on");
            System.out.println("Put the navigation on");
        }

        public static void driveAndGo () {
            System.out.println("Put into drive mode");
            System.out.println("And go.....");
        }

        public static void startCar () {
            System.out.println("Starting the car");
        }


        // I am in a hurry. So, need to do only few methods
        public static void driveInRush () {
            unlockCar(); // calling a method. - This is not a method declaration.
            sitInCar();
            startCar();
            driveAndGo();
        }

        public static void main(String[] args) {

            unlockCar();  // calling a method. - THis is not a method declaration.
            //unlockCar();
            openDoor();
            sitInCar();
            startCar();
            getReadyToGo();
            driveAndGo();


            System.out.println();
            driveInRush();
            driveInRush();

        }

    }



