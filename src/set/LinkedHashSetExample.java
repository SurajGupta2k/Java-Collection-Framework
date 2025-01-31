package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> fruits = new LinkedHashSet<>();

        // Add elements (maintains insertion order)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("LinkedHashSet: " + fruits);

        // Try to add duplicate element
        boolean added = fruits.add("Apple");
        System.out.println("Was Apple added again? " + added);
        System.out.println("LinkedHashSet after trying to add duplicate: " + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Size of set
        System.out.println("Size of set: " + fruits.size());

        // Iterate through elements (order is maintained)
        System.out.println("\nIterating through elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create another set for demonstration
        Set<String> moreFruits = new LinkedHashSet<>();
        moreFruits.add("Grape");
        moreFruits.add("Apple"); // Duplicate with first set
        moreFruits.add("Pear");

        // Add all elements from another set
        fruits.addAll(moreFruits);
        System.out.println("\nAfter adding more fruits: " + fruits);

        // Clear the set
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
