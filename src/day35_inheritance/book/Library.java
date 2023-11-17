package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book();
        // b1 has access to 5 instance variables
        // b1.title = "Lord of the Rings";


        AudioBook ab1 = new AudioBook();
        // ab1 has access to 8 instance variables (6 from SUPER class and 2 from its own class)
        //ab1.title = new String( "The Lion");//"The Lion";
        ab1.title = "The Lion";
        ab1.duration = 100;
        ab1.narrator = "Tom Jerry";
        // Create an object of Author class and assigned it instance variable of ab1 object which is Author author.
        ab1.author = new Author("Micky Mouse", 40);
        // ab1 has access to 1 instance method which is in its own class
        ab1.listen();


        EBook eb1 = new EBook();
        // eb1 has access to 7 instance variables (6 from SUPER class and 1 from its own class)
        eb1.title = "Softskills";
        eb1.pages = 100;
        // eb1 has access to 1 instance method which is in its own class
        eb1.read();
        //eb1.listen();


        // Here I create object of Author class and assigned it to Author a1 reference
        Author a1 = new Author("Winnie Pooh", -10);
        System.out.println(a1.getAge()); // 0






    }
}



