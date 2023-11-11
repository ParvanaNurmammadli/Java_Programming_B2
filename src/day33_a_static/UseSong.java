package day33_a_static;

public class UseSong {
    public static void main(String[] args) {

        Song s1 = new Song("Waka Waka");
        System.out.println(s1);
        Song s2 = new Song("Waka Waka", 3.5);
        System.out.println(s2);
        Song s3 = new Song("Waka Waka", 3.5, "Shakira");
        Song s4 = new Song("Waka Waka", 3.5, "Shakira", "Pop");


    }
}

