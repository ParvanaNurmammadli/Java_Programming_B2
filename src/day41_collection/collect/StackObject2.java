package day41_collection.collect;

import java.util.Stack;

    public class StackObject2 {
        public static void main(String[] args) {

            Stack <Integer> stack = new Stack<>();
            stack.push(40);
            stack.add(20);
            stack.add(100);
            stack.push(30);


            System.out.println(stack);
            System.out.println(stack.peek()); // return the element which is at the top

            System.out.println(stack.pop());  // remove the top element and returns what was removed
            System.out.println(stack.pop());
            System.out.println(stack);

            System.out.println(stack.peek());



        }

    }
