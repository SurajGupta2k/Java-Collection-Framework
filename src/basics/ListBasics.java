package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

/**
 * List Interface in Java:
 * - An ordered collection (sequence of elements)
 * - Elements can be accessed by their index
 * - Allows duplicate elements
 * - Maintains insertion order
 */
public class ListBasics {
    public static void main(String[] args) {
        System.out.println("=== List Interface Examples ===\n");

        // ArrayList - Dynamic array implementation
        System.out.println("1. ArrayList Example:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Second"); // Allows duplicates
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println();

        // LinkedList - Doubly linked list implementation
        System.out.println("2. LinkedList Example:");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println("LinkedList: " + linkedList);
        linkedList.add(1, "Inserted"); // Efficient for insertions
        System.out.println("After insertion: " + linkedList);
        System.out.println();

        // Vector - Thread-safe dynamic array
        System.out.println("3. Vector Example:");
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println();

        // Stack - LIFO data structure
        System.out.println("4. Stack Example:");
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("\nKey Points about List:");
        System.out.println("- Maintains insertion order");
        System.out.println("- Allows duplicate elements");
        System.out.println("- Allows null elements");
        System.out.println("- Supports index-based access");
    }
}
