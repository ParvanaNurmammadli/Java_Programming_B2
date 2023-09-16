package day05_variables;

public class CarDriverInfo {

    public static void main(String [] args){

        // Task:
        //            add new class CarDriverInfo
        //            add main method
        //
        //            carModel    -> String
        //            driverName  -> String
        //            licenseNum  -> String
        //            speed       -> short    // mph
        //            isAutomatic -> boolean
        //            licenseClass-> char//


        String carModel="Toyoto Carolla";
        String driverName="java";
        String licenseNum= "java91";
        short speed= 150;
        boolean isAutomatic=true;
        char licenseClass='D';

        System.out.println("My car is:"+carModel+"\nDriver Name: "+ driverName+ "\n License number:"+licenseNum+ "\nSpeed:"
                + speed +"\nIt is Automatic:"+isAutomatic +"\nlicense Class: "+ licenseClass);


    }

}
