package day17_loops;
import java.util.Scanner;

/*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items

        at the end show the full shopping list

 */
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping List";
        String addMore= "";

        do {

            System.out.print("Enter the name of the item: ");
            String itemName = input.nextLine();
            list = list + "\n\t" + itemName;

            System.out.print("Do you want to add more to your shopping list? ");
            addMore = input.nextLine();


        } while (addMore.equalsIgnoreCase("yes"));  // If user types "yes" or "YES" --- > continue adding. Anything other than 'yes' will end the loop


        System.out.println(list);

    }
}