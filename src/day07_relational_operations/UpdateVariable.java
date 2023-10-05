package day07_relational_operations;



    public class UpdateVariable {
        public static void main(String[] args) {
            // how many different way we can add 1
            int a = 10;
            a = 10 + 1;
            a = 12;
            a++;   // with the help pf pre-increment or post-increment
            a = a + 1;


            // how can I add 10?
            int b = 4;
            b = 4 + 10;  // 14
            b = b + 10; // we read the value from b, then adds 10 on top of it. b = 14 + 10
            b += 10; // same as this one --- > b = b + 10;


            int count = 0;
            count += 5; // count = count + 5; --- > count = 5;
            System.out.println(count);

            count -= 10;  // count = count - 10; ---> count = 5 - 10;  --- > count = -5;
            System.out.println(count);

            count *= 2;  // count = count * 2; -- > count = -5 * 2; -- > count = -10;
            System.out.println(count);

            count /= 3; // count = count / 3; --- > count  = -10 / 3; --- > count = -3;
            System.out.println(count);


            count %= 2; // count = count % 2; --- > count = -3 % 2;  --- >  count = -1
            System.out.println(count);





        }
    }

