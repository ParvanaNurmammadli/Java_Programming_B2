package day29_arraylist;



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
        .addAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be added to the end of the list
        .addAll (index, Collection ) - >Collection - > Arrays.asList(arg) - > All will be added starting from the given INDEX
        .removeAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be removed from the list
        .retainAll (Collection) - > Collection - > Arrays.asList(arg) - > All the matching ones will be kept from the list and rest will be removed
        .containsAll (Collection) - > Collection - > Arrays.asList(arg) - >If ALL the Collection exist in the list - return TRUE if not return FALSE

     */
    public class SeparateParts {
        public static void main(String[] args) {

            String s = "ABCD123$%#@&456EFG!";

            // How can I store all the Characters into and arraylist
            ArrayList <String> list = new ArrayList<>(Arrays.asList( s.split(""))  );
            System.out.println(list);

            // Thi is doing same thing as above
//        for (int i = 0; i < s.length(); i++) {
//            list.add( "" + s.charAt(i));
//        }


            // Create a new ArrayList that will have only the numbers
            ArrayList <String> numbers = new ArrayList<>(list); // I made a copy of the list into numbers
            numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8","9"));
            System.out.println(numbers);


            // Create a new ArrayList that will have only the SPECIAL CHARACTERS
            ArrayList <String> special = new ArrayList<>(list); // I made a copy of the list into special
            special.retainAll( Arrays.asList("!", "@", "#", "$","%", "^", "&", "*", "(", ")") );
            System.out.println(special);

            ArrayList <String> letters = new ArrayList<>(list); // I made a copy of the list into letters
            letters.removeAll(numbers);
            letters.removeAll(special);
            System.out.println(letters);


        }

    }

