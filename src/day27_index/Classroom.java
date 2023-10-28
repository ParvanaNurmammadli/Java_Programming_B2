package day27_index;



import java.util.ArrayList;

    public class Classroom {
        public static void main(String[] args) {
            ArrayList <String> group = new ArrayList<>(); // Declared an ArrayList
            System.out.println(group.size()); //

            group.add("Ulvi");
            group.add("Iryna");
            group.add("Majd");
            group.add("Oleksandr");
            group.add("Ievgeniia");
            group.add("Aslan");

            System.out.println(group);
            System.out.println(group.size());


            System.out.println("First Name: " + group.get(0));
            System.out.println("Second Name: " + group.get(1));
            System.out.println("Third Name: " + group.get(2));
            System.out.println("Fourth Name: " + group.get(3));
            System.out.println("Fifth Name: " + group.get(4));
            System.out.println("Sixth Name: " + group.get(5));
            //System.out.println("First Name: " + group.get(6)); //IndexOutOfBoundsException

            System.out.println();

            // With Traditional loop
            for (int i = 0; i < group.size(); i++) {
                System.out.println(  (i+1) +  " name: " + group.get(i)    );
            }

            System.out.println();
            // with FOREACH loop
            for (String eachElem : group) {
                System.out.println("Name: " + eachElem);
            }

            System.out.println();
            for ( String each : group) {
                for (int i = 0; i < each.length(); i++) {
                    System.out.println("Each Character: " + each.charAt(i));
                }
                System.out.println("---------------");
            }

        }
    }


