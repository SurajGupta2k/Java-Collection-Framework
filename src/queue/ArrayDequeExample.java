package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Using as a Queue (FIFO)
        System.out.println("Queue operations:");
        deque.offer("First");
        deque.offer("Second");
        deque.offer("Third");
        System.out.println("Deque: " + deque);

        // Remove and return the first element (Queue operation)
        String first = deque.poll();
        System.out.println("Polled (first) element: " + first);
        System.out.println("After poll: " + deque);

        // Using as a Stack (LIFO)
        System.out.println("\nStack operations:");
        deque.push("Top");
        System.out.println("After push: " + deque);

        // Remove and return the first element (Stack operation)
        String top = deque.pop();
        System.out.println("Popped element: " + top);
        System.out.println("After pop: " + deque);

        // Add elements at both ends
        System.out.println("\nDeque operations:");
        deque.addFirst("Start");
        deque.addLast("End");
        System.out.println("After adding at both ends: " + deque);

        // Peek at elements from both ends
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("After removing from both ends: " + deque);

        // Check if element exists
        System.out.println("\nContains 'Second'? " + deque.contains("Second"));

        // Size
        System.out.println("Size: " + deque.size());

        // Clear the deque
        deque.clear();
        System.out.println("After clearing: " + deque);
        System.out.println("Is empty? " + deque.isEmpty());
    }
}
