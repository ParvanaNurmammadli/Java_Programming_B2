package day14_string;
/*
    .equals(String) --- > return boolean
    .equalIgnoreCase(String) --- > return boolean
    .length() ----- > Return int
    .toUpperCase()  --- > returns new String all in UPPERCASE
    .toLowerCase()  --- > returns new String all in lowercase
    .startsWith(String) --- > return boolean
    .endsWith(String) --- > return boolean
    .contains(String) --- > return boolean
    .trim() ------- > returns new String removing spaces from BEGINNING and from END ONLY.
    .isEmpty() --- > return boolean if there is NO CHARACTER at all including space -- > "";
    .isBlank() --- > return boolean is there ONLY EMPTY SPACES inside the double quotation
 */
public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());

        str = ""; // REASSIGNED IT to "";
        System.out.println(str.isEmpty());


        str = " ";  //REASSIGNED it to " ";
        System.out.println(str.isEmpty()); // empty space is a CHARACTER. So --- > false


        str = " ";
        System.out.println(str.isBlank()); //

        str = "          ";
        System.out.println(str.isBlank()); //


        str = "        .          ";
        System.out.println(str.isBlank());





    }

}
