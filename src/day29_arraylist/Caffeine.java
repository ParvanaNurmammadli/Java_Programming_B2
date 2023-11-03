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
     */
    public class Caffeine {
        public static void main(String[] args) {
            ArrayList <String> drinks = new ArrayList<>();
            System.out.println(drinks.size());

            // We just called this method from different class but in the same package. So, no need to import the package
            //ShoppingList.showListItems(drinks);


            drinks.add("coffee");
            drinks.add("tea");
            drinks.add("energy drink");
            drinks.add("soda");
            System.out.println(drinks);

            ArrayList <String> drinks2 = new ArrayList<>(drinks);
            System.out.println(drinks2);

            String [] allDrinks = {"cola", "monster", "red bull", "sarikiz"};
            //ArrayList <String> drinks4 = new ArrayList<>( allDrinks );  // This is NOT OK. Because array is not a VALID argument
            ArrayList <String> drinks3 = new ArrayList<>( Arrays.asList(allDrinks) ); // Here is OK. We converted Array into ArrayList - which Collection data type
            System.out.println(drinks3);


            ArrayList <String> drinks5 = new ArrayList<>( Arrays.asList( "Water", "Dovga", "Ayran" ));
            System.out.println(drinks5);


            drinks.addAll(Arrays.asList("Water", "Su", "Voda"));
            System.out.println(drinks);


            drinks.addAll(0, Arrays.asList("Virgin Drink", "Fanta", "Sprite"));
            System.out.println(drinks);

            ShoppingList.showListItems(drinks);

            System.out.println(drinks);//ShoppingList.removeItem(drinks, 0);



        }
    }


