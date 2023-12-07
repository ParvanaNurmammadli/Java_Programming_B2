package day42_maps.collection;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue <Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.offer(10);
        queue.add(8);
        queue.offer(1);
        queue.add(1);
        try{
            queue.add(null); // NullPointerException - > Does NOT allow null
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        //queue.get(2); Does not work with get() method.

        System.out.println(queue);


        queue.remove(3); // Since there is no Matching object in queue Collection it did not remove
        System.out.println(queue.remove(3)); //Since it also returns the boolean, once there is matching object, it will return true. Otherwise, false
        System.out.println(queue.remove(1)); // It removes the first matching one.
        System.out.println(queue);

        queue.poll(); // It removed the elements from beginning since it works with the FIFO
        System.out.println(queue);
        System.out.println(queue.poll()); // It returns whatever was removed.
        System.out.println(queue);
        System.out.println(queue.remove()); // It will also remove but from the end if not parameter used in method.


        //System.out.println(new PriorityQueue<>().remove()); //NoSuchElementException
        // If the Collection of PriorityQueue is empty and remove() method is used, it will throw Exception
        System.out.println(new PriorityQueue<>().poll()); // null
        // If the Collection of PriorityQueue is empty and poll() method is used, it will return null - no exception

    }
}