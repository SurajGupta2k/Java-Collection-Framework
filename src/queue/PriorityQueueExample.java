package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        Queue<Integer> numbers = new PriorityQueue<>();
        
        // Adding elements
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(3);
        numbers.offer(2);
        numbers.offer(4);
        
        System.out.println("PriorityQueue: " + numbers);
        
        // Peek at the head of queue (minimum element)
        System.out.println("Head of queue: " + numbers.peek());
        
        // Remove and return the head of queue
        System.out.println("Removed element: " + numbers.poll());
        System.out.println("After removal: " + numbers);
        
        // Add element
        numbers.offer(0);
        System.out.println("After adding 0: " + numbers);
        
        // Size of queue
        System.out.println("Queue size: " + numbers.size());
        
        // Remove all elements
        System.out.println("\nRemoving all elements:");
        while (!numbers.isEmpty()) {
            System.out.println("Removed: " + numbers.poll());
        }
        
        System.out.println("Is queue empty? " + numbers.isEmpty());
    }
}
