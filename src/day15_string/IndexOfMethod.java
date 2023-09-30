package day15_string;
/*
    .charAt(index);
    .indexOf("")
 */
public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "pen";

        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));



        System.out.println(str.indexOf("x"));


        // The following 2 if statements will do the same thing.
        if (str.indexOf("x") == -1) {
            System.out.println("x is not in the word ");
        }

        if (!str.contains("x")) {
            System.out.println("x is not in the word");
        }

        System.out.println("-----------");
        String str2 = "pencpil";
        System.out.println(str2.indexOf("p")); // It will look for the "p" and will return the index of the FIRST match
        str2 = "encpil";
        System.out.println(str2.indexOf("p")); // It will look for the "p" and will return the index of the FIRST match

        System.out.println("-----------");
        String str3 = "loopcamp";
        //             01234567
        System.out.println(str3.indexOf("pc")); // 3
        System.out.println(str3.indexOf("camp")); // 4
        System.out.println(str3.indexOf("camping")); // -1
        System.out.println(str3.indexOf("loo")); // 0
        System.out.println(str3.indexOf("look")); // -1


    }
}
