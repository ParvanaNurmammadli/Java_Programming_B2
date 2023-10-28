package day27_index;

public class ParseVsValue {

        public static void main(String[] args) {
            String str = "30";

            int num1 = Integer.parseInt(str); // converts String -- > int primitive data type
            Integer num2 = Integer.valueOf(str); // converts String -- > Integer wrapper class object


            int num3 =  Integer.valueOf(str);  // You still can do this but not recommended  //30
        /*
            First:  I convert the String --- >  Integer wrapper class object
            Second: Then I convert Integer -- > int ---- > UNBOXING
         */

            Integer num4 = Integer.parseInt(str);  //YOu still can do this but not recommended
        /*
            First:  I convert the String --- > int primitive data type
            Second: I convert int primitive -- > Integer wrapper class object --- > AUTOBOXING
         */


            // Converting String (boolean value) into Wrapper Class Object boolean
            String boolValue = "234true12";
            Boolean isTrue = Boolean.valueOf(boolValue);
            System.out.println(isTrue);


        }
    }



