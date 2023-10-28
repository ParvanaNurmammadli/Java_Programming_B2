package day27_index;




    import java.util.ArrayList;
    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns true and removes first match if multiple exists
        .remove(parameter)
        .size()
     */
    public class RemoveExample {
        public static void main(String[] args) {

            ArrayList <String> list = new ArrayList<>();
            list.add("water");
            list.add("bread");
            list.add("apple");
            list.add("butter");

            System.out.println(list);

            list.add(1, "cherry");
            System.out.println(list);


            // How can I get the last element in the arrayList
            System.out.println( list.get( list.size() - 1 ));


            System.out.println("-----------------------");
            list.remove(0);  // [water, cherry, bread, apple, butter]
            System.out.println(list);

            list.remove(list.size()-1);
            System.out.println(list);


            list.remove("bread");
            System.out.println(list);

            list.remove("banana");
            System.out.println( list.remove("banana") );
            System.out.println(list);

            System.out.println(  list.remove("apple") ); // true
            System.out.println(list);

            list.add("light");
            list.add("light");
            System.out.println(list);

            list.remove("light");
            System.out.println(list);










        }
    }

