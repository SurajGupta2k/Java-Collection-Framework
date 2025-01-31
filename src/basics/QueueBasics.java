package basics;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Queue Interface in Java:
 * - Designed for holding elements prior to processing
 * - Typically follows FIFO (First-In-First-Out) order
 * - Some implementations provide different ordering
 */
public class QueueBasics {
    public static void main(String[] args) {
        System.out.println("=== Queue Interface Examples ===\n");

        // Regular Queue (using ArrayDeque implementation)
        System.out.println("1. Regular Queue Example:");
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("First");  // Add elements
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());  // Removes and returns first element
        System.out.println("Peek at next: " + queue.peek());  // Views but doesn't remove
        System.out.println("Queue after operations: " + queue);
        System.out.println();

        // PriorityQueue - Elements are processed according to priority
        System.out.println("2. PriorityQueue Example:");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Removed: " + priorityQueue.poll());  // Removes smallest element
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println();

        // Deque - Double-ended queue
        System.out.println("3. Deque Example:");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.addFirst("New Front");
        System.out.println("Deque: " + deque);
        System.out.println("Remove from front: " + deque.removeFirst());
        System.out.println("Remove from back: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        System.out.println("\nKey Points about Queue:");
        System.out.println("- Regular Queue: FIFO order");
        System.out.println("- PriorityQueue: Natural ordering or custom comparator");
        System.out.println("- Deque: Can add/remove from both ends");
        System.out.println("- offer/poll/peek are preferred over add/remove/element");
    }
}
