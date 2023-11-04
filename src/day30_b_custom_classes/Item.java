package day30_b_custom_classes;

public class Item {
    String name;
    double price;


    @Override
    public String toString() {
        return "Item name: " + name +
                "\nPrice: " + price ;
    }
}


