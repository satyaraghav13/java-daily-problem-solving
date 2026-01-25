import java.util.LinkedList;
import java.util.Queue;

public class Solution01 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Mango");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);

        // Remove element (FIFO)
        System.out.println("Removed: " + queue.poll());

        // Peek element
        System.out.println("Front Element: " + queue.peek());

        System.out.println("Queue after operations: " + queue);
    }
}
