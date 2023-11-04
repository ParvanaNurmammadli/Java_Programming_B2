package day30_b_custom_classes;

public class UsingItem {

    public static void main(String[] args) {
        Item itemOne = new Item();
        itemOne.name = "Apples";
        itemOne.price = 5.9;

        System.out.println(itemOne);


        Item itemTwo = new Item();
        itemTwo.name = "Water";
        itemTwo.price = 1.99;
        System.out.println(itemTwo);



    }
}

