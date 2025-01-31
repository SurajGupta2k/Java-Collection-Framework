package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set Interface in Java:
 * - Collection that cannot contain duplicate elements
 * - At most one null element
 * - Different implementations provide different ordering guarantees
 */
public class SetBasics {
    public static void main(String[] args) {
        System.out.println("=== Set Interface Examples ===\n");

        // HashSet - Uses hash table, no ordering guarantee
        System.out.println("1. HashSet Example:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate - will not be added
        System.out.println("HashSet: " + hashSet);
        System.out.println("Added duplicate? " + hashSet.add("Apple")); // Returns false
        System.out.println();

        // LinkedHashSet - Maintains insertion order
        System.out.println("2. LinkedHashSet Example:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("Second"); // Duplicate - will not be added
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Notice that insertion order is preserved");
        System.out.println();

        // TreeSet - Maintains elements in sorted order
        System.out.println("3. TreeSet Example:");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Charlie");
        treeSet.add("Alpha");
        treeSet.add("Bravo");
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Notice that elements are automatically sorted");

        System.out.println("\nKey Points about Set:");
        System.out.println("- No duplicate elements");
        System.out.println("- HashSet: No ordering guarantee, best performance");
        System.out.println("- LinkedHashSet: Maintains insertion order");
        System.out.println("- TreeSet: Maintains sorted order");
    }
}
