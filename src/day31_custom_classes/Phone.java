package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;


    public Phone( String name) {
        this.name = name;
    }

    public Phone (String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    public Phone (String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }
        @Override
        public String toString() {
            return "Phone" +
                    "\n\tName: " + name +
                    "\n\tBrand: " + brand +
                    "\n\tMemory: " + memory +
                    "\n\tVersion: " + version;
        }
    }


