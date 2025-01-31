package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Displaying elements
        System.out.println("Fruits list: " + fruits);
        
        // Adding element at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding Mango: " + fruits);
        
        // Removing element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        
        // Checking if element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        
        // Getting element at index
        System.out.println("Element at index 1: " + fruits.get(1));
        
        // Size of ArrayList
        System.out.println("Number of elements: " + fruits.size());
        
        // Iterating using for-each loop
        System.out.println("\nIterating through elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
