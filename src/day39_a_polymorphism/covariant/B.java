package day39_a_polymorphism.covariant;


    import java.util.ArrayList;

    public class B extends A {

        //A method that returns A can be overridden as a method that return B since B is a A
        @Override
        public B test() {
            return new B();
        }


        @Override
        public void test2() {
            System.out.println("Overrided in child");
        }


        // The code below if to show that we can store different objects under SAME reference
        public static void main(String[] args) {

            A[] arr = {new A(), new B()};
            // A obj1 = new A();
            // A obj2 = new B();

            ArrayList<A> list = new ArrayList<>();
            list.add(new A());
            list.add(new B());

        }
    }
