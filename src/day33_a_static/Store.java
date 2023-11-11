package day33_a_static;



    import java.util.ArrayList;

    public class Store {
        public static void main(String[] args) {
            Food f1 = new Food("Apples");
            Food f2 = new Food("Grapes");
            System.out.println(f1);
            System.out.println();
            System.out.println(f2);
            Food f3 = new Food( "Banana", 10, 0.99);
            Food f4 = new Food("Chips", 5, 1.99);
            Food f5 = new Food("Chicken", 2, 3.99);
            System.out.println(f5);
            System.out.println("F5 total: " +  f5.totalPrice);


            System.out.println("-----------------------");
            ArrayList <Food> foodList = new ArrayList<>();
            foodList.add(f1);
            foodList.add(f2);
            foodList.add(f3);
            foodList.add(f4);
            foodList.add(f5);
            System.out.println(foodList);

            System.out.println();
            for (Food each : foodList) {
                System.out.println(each);
                System.out.println();
            }

            System.out.println("**************");
            for (Food each : foodList) {
                if (each.quantity > 5) {
                    System.out.println(each);
                }
            }


            System.out.println("############################");
            // Can you make a new ArrayList that holds ony the Food which has unit price more than 0
            ArrayList<Food> foodPriceNotZero = new ArrayList<>(foodList);
            System.out.println(foodPriceNotZero);
            System.out.println("*****");
            foodPriceNotZero.removeIf(each -> each.totalPrice == 0.0);
            for ( Food eachObj : foodPriceNotZero) {
                System.out.println(eachObj);
            }



        }
    }




