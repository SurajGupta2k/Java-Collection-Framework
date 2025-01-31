package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap (maintains insertion order)
        Map<String, Integer> scores = new LinkedHashMap<>();

        // Add entries
        scores.put("John", 90);
        scores.put("Alice", 85);
        scores.put("Bob", 95);
        System.out.println("Scores: " + scores);

        // Access a value
        System.out.println("John's score: " + scores.get("John"));

        // Update a value
        scores.put("Alice", 88);
        System.out.println("Alice's updated score: " + scores.get("Alice"));

        // Remove an entry
        scores.remove("Bob");
        System.out.println("After removing Bob: " + scores);

        // Check if key exists
        System.out.println("Contains John? " + scores.containsKey("John"));

        // Check if value exists
        System.out.println("Contains score 88? " + scores.containsValue(88));

        // Get all keys
        System.out.println("All students: " + scores.keySet());

        // Get all values
        System.out.println("All scores: " + scores.values());

        // Iterate through entries (order is maintained)
        System.out.println("\nIterating through entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create a LinkedHashMap with access order
        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("A", 1);
        accessOrderMap.put("B", 2);
        accessOrderMap.put("C", 3);
        System.out.println("\nInitial order: " + accessOrderMap);

        // Access some entries
        accessOrderMap.get("A");
        accessOrderMap.get("C");
        System.out.println("Order after accessing A and C: " + accessOrderMap);

        // Clear the map
        scores.clear();
        System.out.println("\nAfter clearing: " + scores);
        System.out.println("Is empty? " + scores.isEmpty());
    }
}
