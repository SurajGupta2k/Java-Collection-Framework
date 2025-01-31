package map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add entries (thread-safe)
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        System.out.println("Hashtable: " + hashtable);

        // Try to put null (will throw NullPointerException)
        try {
            hashtable.put(null, 1);
        } catch (NullPointerException e) {
            System.out.println("Cannot put null key in Hashtable");
        }

        try {
            hashtable.put("D", null);
        } catch (NullPointerException e) {
            System.out.println("Cannot put null value in Hashtable");
        }

        // Get value
        System.out.println("Value for key 'B': " + hashtable.get("B"));

        // Remove entry
        hashtable.remove("C");
        System.out.println("After removing C: " + hashtable);

        // Check if key exists
        System.out.println("Contains key 'A'? " + hashtable.containsKey("A"));

        // Check if value exists
        System.out.println("Contains value 2? " + hashtable.containsValue(2));

        // Get all keys using Enumeration
        System.out.println("\nKeys using Enumeration:");
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        // Get all elements using Enumeration
        System.out.println("\nElements using Enumeration:");
        Enumeration<Integer> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            System.out.println("Value: " + elements.nextElement());
        }

        // Size
        System.out.println("\nSize: " + hashtable.size());

        // Clear the hashtable
        hashtable.clear();
        System.out.println("After clearing: " + hashtable);
        System.out.println("Is empty? " + hashtable.isEmpty());
    }
}
