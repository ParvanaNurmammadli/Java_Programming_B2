package day36_inheritance.access.a;

public class First {
    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;
    public static void main(String[] args) {
        First obj = new First();
        // how many instance variables obj has access to? - > 4
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        System.out.println(obj.four);
    }


}

