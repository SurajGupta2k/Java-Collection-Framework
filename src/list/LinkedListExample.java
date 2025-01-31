package list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.addFirst("Start");
        linkedList.addLast("End");

        System.out.println("LinkedList: " + linkedList);

        // Adding at specific position
        linkedList.add(2, "Middle");
        System.out.println("After adding 'Middle': " + linkedList);

        // Get first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Remove first and last elements
        System.out.println("Removed first: " + linkedList.removeFirst());
        System.out.println("Removed last: " + linkedList.removeLast());
        System.out.println("After removing: " + linkedList);

        // Using as a Queue
        linkedList.offer("New Element"); // Add to end
        System.out.println("After offer: " + linkedList);
        System.out.println("Peek first: " + linkedList.peek()); // View first element
        System.out.println("Poll: " + linkedList.poll()); // Remove and return first element
        
        // Using as a Stack
        linkedList.push("Top");
        System.out.println("After push: " + linkedList);
        System.out.println("Pop: " + linkedList.pop());

        // Check if element exists
        System.out.println("Contains 'Middle'? " + linkedList.contains("Middle"));

        // Get element at index
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Set element at index
        linkedList.set(0, "Updated");
        System.out.println("After updating first element: " + linkedList);

        // Clear the list
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
        System.out.println("Is empty? " + linkedList.isEmpty());
    }
}
