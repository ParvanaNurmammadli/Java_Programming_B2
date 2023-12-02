package day41_collection.collect;


    import java.util.Stack;

    public class StackObjects {
        public static void main(String[] args) {
            Stack <Character> stack = new Stack<>();
            stack.push('a');
            stack.push('b');
            stack.push('c');
            stack.push('d');
            System.out.println(stack);

            System.out.println("Top of the stack: " + stack.peek()); //returns what is at the top of my stack - > last element

            // how can you remove top element
            stack.pop(); // removes the element at the top of the stack and returns it
            System.out.println(stack);

            System.out.println("Top of the stack: " + stack.peek()); //returns what is at the top of my stack - > last element

            System.out.println(stack.pop());  // C
            System.out.println(stack);    // [a,b]


            System.out.println(stack.remove(0));  //
            // Since Stack can have the inheritance from List, Collection as well, we can use the remove(index) method as well
            // But this will not make us to use the specific character of the Stack class.
            // The Specific character of the Stack class is: LIFO -- > Last In First Out
            System.out.println(stack);


        }

    }


