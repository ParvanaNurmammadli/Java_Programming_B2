package day_06_b_unary_operators;

public class IncrementExample {

    public static void main(String[] args)
    {
    int x=0;

    System.out.println(x); // 0

        x=x+1;

        x++;// this will icrease the value by 1
        System.out.println(x); //2
        x++;
        System.out.println(++x); //pre increment

        //PRE-INCREMENT
        ++x;
        System.out.println(x);

        //q what is the difference  why 2 version we have?
        System.out.println(x++); // post increment

        System.out.println(x);




    }}
