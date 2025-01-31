package list;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Create a vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println("Vector: " + vector);

        // Add element at specific index
        vector.add(1, "One and Half");
        System.out.println("After adding at index 1: " + vector);

        // Get element at index
        String element = vector.get(2);
        System.out.println("Element at index 2: " + element);

        // Set element at index
        vector.set(0, "Zero");
        System.out.println("After setting index 0: " + vector);

        // Remove element
        vector.remove("Three");
        System.out.println("After removing 'Three': " + vector);

        // Remove element at index
        vector.remove(1);
        System.out.println("After removing index 1: " + vector);

        // Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // First and last elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // Check if empty
        System.out.println("Is empty? " + vector.isEmpty());

        // Clear vector
        vector.clear();
        System.out.println("After clearing: " + vector);

        // Trim capacity to size
        vector.trimToSize();
        System.out.println("Capacity after trim: " + vector.capacity());
    }
}
