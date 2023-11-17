package day35_inheritance.computer;

public class Computer { String os;
    int memory;
    public Computer (String os, int memory) {
        this.os = os;
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "Computer Info" +
                "\n\tOperating System: " + os +
                "\n\tMemory: " + memory;
    }
}


