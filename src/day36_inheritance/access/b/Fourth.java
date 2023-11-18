package day36_inheritance.access.b;

    import day36_inheritance.access.a.First;

    //DIFFERNT CLASS, DIFFERENT PACKAGE
    public class Fourth extends First {
        public static void main(String[] args) {

            First obj = new First();
            System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

            Fourth obj2 = new Fourth();
            System.out.println(obj2.one);
            System.out.println(obj2.two);  // THIS LINE
//        System.out.println(obj2.three);
//        System.out.println(obj2.four);
        }


    }

