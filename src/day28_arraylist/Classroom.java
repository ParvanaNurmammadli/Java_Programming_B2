package day28_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {
        ArrayList <String> group = new ArrayList<>();

        group.add("Yusuf");
        group.add("Gular");
        System.out.println(group);

        group.add(0, "Elturk");
        System.out.println(group);

        System.out.println(group.get(0));
        System.out.println(group.get(2));

        group.add ("Anna");
        System.out.println(group);

        group.add(1, "Sevil");
        System.out.println(group);

    }
}

