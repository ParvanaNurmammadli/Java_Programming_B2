package day18_loops;
// input:  "java is a java language.java"
// output: 3
public class CountJava {
    public static void main(String[] args) {
        /*
            "java is a java language.java"
             if contains
                  - > count increase by 1
                  - >  is a java language.java

         */
        String str = "java is a java language.java";
        int count = 0;


        while (str.contains("java")) {
            str = str.replaceFirst("java", "*");
            //  *is a java language.java
            //  *is a * language.java
            //  *is a * language.*
            count++;
            System.out.println(str);
        }


        System.out.println();
        System.out.println(count);
        System.out.println(str);



    }
}