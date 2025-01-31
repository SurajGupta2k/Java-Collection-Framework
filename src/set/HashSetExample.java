package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> colors = new HashSet<>();
        
        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate element - will not be added
        
        // Displaying elements
        System.out.println("Colors Set: " + colors);
        
        // Checking if element exists
        System.out.println("Contains Red? " + colors.contains("Red"));
        
        // Removing element
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
        
        // Size of HashSet
        System.out.println("Number of elements: " + colors.size());
        
        // Iterating through elements
        System.out.println("\nIterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }
        
        // Clear the set
        colors.clear();
        System.out.println("After clearing: " + colors);
    }
}
