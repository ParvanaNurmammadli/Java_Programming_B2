package day45_stream.functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {

        Consumer<Integer> printToN = n -> {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }
        };

        // Since I am calling that Functional Interface reference FROM SAME CLASS
        // I do NOT need to use the Class Name
        printToN.accept(5);

        System.out.println("----------------------");
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Winter", "Holiday", "Season"));
        // .forEach() method comes from Iterable Interface -- > List Interface --- > ArrayLis Class  -- > which accepts Consumer as parameter
        list.forEach(each -> System.out.println(each));

        System.out.println();
        // print out each words FIRST and LAST character
        list.forEach(each -> System.out.println(each.charAt(0) + " " + each.charAt(each.length() - 1)));

        System.out.println();
        // Print all the words which 6 or mor letters
        list.forEach(each -> {
            if (each.length() >= 6) {
                System.out.println(each);
            }
        });


    }}