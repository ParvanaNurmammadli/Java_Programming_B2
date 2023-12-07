package day42_maps.collection;



import java.util.ArrayList;
import java.util.Iterator;

    public class UsingIterator {
        public static void main(String[] args) {

            ArrayList <String> names= new ArrayList<>();
            names.add("Ievgeniia");
            names.add("Caglar");
            names.add("Aliksandr");
            names.add("Iryna");
            names.add("Eyad");
            names.add("Zahid");
            names.add("Majd");
            names.add("Parvana");
            names.add("Sofia");
            names.add("Aslan");
            names.add("Maya");

            System.out.println(names);

            Iterator<String> iterator = names.iterator();
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());

            //System.out.println(iterator.next()); // NoSuchElementException -> because there is no element after Maya

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


            Iterator <String> iterator2 = names.iterator();  // Now you made a new iterator which starts form beginning.



        }
    }



