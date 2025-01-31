package basics;

/**
 * Overview of Java Collection Framework
 * 
 * 1. List Interface:
 *    - Ordered collection of elements
 *    - Allows duplicates
 *    - Implementations:
 *      * ArrayList: Dynamic array implementation
 *      * LinkedList: Doubly-linked list implementation
 *      * Vector: Thread-safe dynamic array
 *      * Stack: LIFO data structure
 * 
 * 2. Set Interface:
 *    - Collection of unique elements
 *    - No duplicates allowed
 *    - Implementations:
 *      * HashSet: Uses hash table, no order guarantee
 *      * LinkedHashSet: Maintains insertion order
 *      * TreeSet: Maintains sorted order
 * 
 * 3. Queue Interface:
 *    - Designed for holding elements for processing
 *    - Typically FIFO order
 *    - Implementations:
 *      * PriorityQueue: Elements processed by priority
 *      * ArrayDeque: Double-ended queue
 * 
 * 4. Map Interface:
 *    - Key-value pairs
 *    - Keys must be unique
 *    - Implementations:
 *      * HashMap: Basic implementation, no order guarantee
 *      * LinkedHashMap: Maintains insertion order
 *      * TreeMap: Maintains sorted key order
 *      * Hashtable: Thread-safe version
 */
public class CollectionOverview {
    public static void main(String[] args) {
        System.out.println("=== Java Collection Framework Overview ===");
        System.out.println("\nPlease run the following classes for examples:");
        System.out.println("1. ListBasics - For List interface examples");
        System.out.println("2. SetBasics - For Set interface examples");
        System.out.println("3. QueueBasics - For Queue interface examples");
        System.out.println("4. MapBasics - For Map interface examples");
        
        System.out.println("\nCommon characteristics of collections:");
        System.out.println("- Can grow or shrink in size dynamically");
        System.out.println("- Can hold only objects (not primitives)");
        System.out.println("- Generic type support (<T>)");
        System.out.println("- Rich API for adding, removing, and manipulating elements");
    }
}
