package basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Hashtable;

/**
 * Map Interface in Java:
 * - Stores key-value pairs
 * - Keys must be unique
 * - Each key can map to at most one value
 * - Different implementations provide different ordering and thread-safety guarantees
 */
public class MapBasics {
    public static void main(String[] args) {
        System.out.println("=== Map Interface Examples ===\n");

        // HashMap - Most commonly used Map implementation
        System.out.println("1. HashMap Example:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("One", 11);  // Updates existing value
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for 'Two': " + hashMap.get("Two"));
        System.out.println();

        // LinkedHashMap - Maintains insertion order
        System.out.println("2. LinkedHashMap Example:");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("First", "1st");
        linkedHashMap.put("Second", "2nd");
        linkedHashMap.put("Third", "3rd");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Notice that insertion order is preserved");
        System.out.println();

        // TreeMap - Maintains keys in sorted order
        System.out.println("3. TreeMap Example:");
        Map<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Charlie", 3.0);
        treeMap.put("Alpha", 1.0);
        treeMap.put("Bravo", 2.0);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Notice that keys are automatically sorted");
        System.out.println();

        // Hashtable - Thread-safe version
        System.out.println("4. Hashtable Example:");
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        System.out.println("Hashtable: " + hashtable);
        System.out.println("Note: Hashtable is thread-safe and doesn't allow null keys or values");

        System.out.println("\nKey Points about Map:");
        System.out.println("- Keys must be unique");
        System.out.println("- HashMap: No ordering guarantee, allows null");
        System.out.println("- LinkedHashMap: Maintains insertion order");
        System.out.println("- TreeMap: Maintains sorted key order");
        System.out.println("- Hashtable: Thread-safe, no nulls allowed");
    }
}
