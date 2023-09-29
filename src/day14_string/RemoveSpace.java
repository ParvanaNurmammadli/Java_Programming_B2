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
 */
public class RemoveSpace {
    public static void main(String[] args) {

        String s = "      Thursday     ";
        System.out.println(s);
        System.out.println(s.length());


        System.out.println(s.trim());   // This method will remove the BLANK? spaces from BEGINNING and from END only.
        System.out.println(s.length());

        s = s.trim();   //"      Thursday     " ------ >   "Thursday"
        System.out.println(s.length());

        System.out.println("---------");
        System.out.println(s.startsWith("Thu"));  //"Thursday"


        String str = "     java is fun     ";
        System.out.println(str.endsWith(" fun"));

        str.trim();
        System.out.println(str.endsWith(" fun")); //

        str = str.trim();  // "java is fun";
        System.out.println(str.endsWith(" fun")); //










    }

}