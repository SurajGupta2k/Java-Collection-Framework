package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();
        
        // Adding key-value pairs
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 50);
        fruitPrices.put("Orange", 80);
        
        // Displaying all entries
        System.out.println("Fruit Prices: " + fruitPrices);
        
        // Accessing value by key
        System.out.println("Price of Apple: " + fruitPrices.get("Apple"));
        
        // Checking if key exists
        System.out.println("Contains Mango? " + fruitPrices.containsKey("Mango"));
        
        // Checking if value exists
        System.out.println("Contains price 50? " + fruitPrices.containsValue(50));
        
        // Updating value
        fruitPrices.put("Apple", 120); // Updates existing value
        System.out.println("Updated price of Apple: " + fruitPrices.get("Apple"));
        
        // Removing entry
        fruitPrices.remove("Banana");
        System.out.println("After removing Banana: " + fruitPrices);
        
        // Iterating through entries
        System.out.println("\nIterating through entries:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Getting all keys
        System.out.println("\nAll fruits: " + fruitPrices.keySet());
        
        // Getting all values
        System.out.println("All prices: " + fruitPrices.values());
    }
}
