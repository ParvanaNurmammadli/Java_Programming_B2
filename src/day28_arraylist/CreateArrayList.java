package day28_arraylist;



    import java.util.ArrayList;
import java.util.Arrays;

    /*
        .add(parameter)
        .add(index, parameter)
        .get(index)
        .remove(index) - > if finds returns Element / And removes the given index if exist
        .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
        .size()
        .contains (parameter) - > if the given parameter exists in the Arraylist, it returns true. If not, it returns false
        .isEmpty () - > checks if the ArrayList has elements or not. If it does, it returns FALSE otherwise, it returns TRUE
        .clear() - > It will remove all the elements from the Arraylist and make it empty
        .set ( index, parameter )  - > It will fins the given index and UPDATE the value on that index. If idex is not in the range, it will throw IndexOutOfBoundsException
        .indexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index. If nothing matched, -1 will be returned
        .lastIndexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index from the END. If nothing matched, -1 will be returned
        Arrays.asList( arr ) - > this will help to either convert the array into arraylist. Or, declare ArrayList with values directly.

     */
    public class CreateArrayList {
        public static void main(String[] args) {

            //ArrayList <String> listOne = new ArrayList<>(Arrays.asList("hello", "bye"));
            ArrayList <String> listOne = new ArrayList<>();
            listOne.add("hello");
            listOne.add("bye");
            System.out.println(listOne);

            ArrayList <String> listTwo = new ArrayList<>( listOne );  // adds the elements from the listOne ArrayList into the listTwo
            listTwo.add("Salam");

            System.out.println("--------");
            System.out.println(listOne);
            System.out.println(listTwo);

            ArrayList <String > listThree = new ArrayList<>( Arrays.asList("hello", "bye", "three"));
            System.out.println(listThree);

            // How can I get the last element dynamically from listThree?
            System.out.println( listThree.get(  listThree.size() - 1  ) );


            // Get the last element amd make all in UPPER case and adn re-assing back ot that index
            String newUpp = listThree.get(listThree.size() - 1).toUpperCase();
            listThree.set( listThree.size()-1,  newUpp  );
            System.out.println(listThree);


        }

    }

