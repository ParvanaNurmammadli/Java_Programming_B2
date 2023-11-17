package day35_inheritance.book;

public class AudioBook extends Book{
    double duration; // mins

    String narrator;

    public void listen() {
        System.out.println("Listening to " + title + " narrated by " + narrator);
    }


}

