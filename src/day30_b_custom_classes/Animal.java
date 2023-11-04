package day30_b_custom_classes;

public class Animal {
    String species;

    long population;


    // If you right click > generate > click OK
    /*
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", population=" + population +
                '}';
    }
     */

    public String toString() {
        return "Animal species " + species +
                "\npopulation: " + population;
    }
}




