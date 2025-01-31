package map;

import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap (sorted by keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add entries
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        System.out.println("TreeMap: " + treeMap);

        // Get first and last entries
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // Get entry with key less than or equal to given key
        System.out.println("Floor entry of 3: " + treeMap.floorEntry(3));
        System.out.println("Floor entry of 2.5: " + treeMap.floorEntry(2));

        // Get entry with key greater than or equal to given key
        System.out.println("Ceiling entry of 3: " + treeMap.ceilingEntry(3));
        System.out.println("Ceiling entry of 2.5: " + treeMap.ceilingEntry(2));

        // Get entry with key strictly less than given key
        System.out.println("Lower entry of 3: " + treeMap.lowerEntry(3));

        // Get entry with key strictly greater than given key
        System.out.println("Higher entry of 3: " + treeMap.higherEntry(3));

        // Get and remove first entry
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Removed first entry: " + firstEntry);
        System.out.println("After removing first: " + treeMap);

        // Get and remove last entry
        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
        System.out.println("Removed last entry: " + lastEntry);
        System.out.println("After removing last: " + treeMap);

        // Get subset of map
        NavigableMap<Integer, String> subMap = treeMap.subMap(2, true, 4, true);
        System.out.println("SubMap [2..4]: " + subMap);

        // Get head map (less than key)
        NavigableMap<Integer, String> headMap = treeMap.headMap(3, true);
        System.out.println("HeadMap (≤ 3): " + headMap);

        // Get tail map (greater than or equal to key)
        NavigableMap<Integer, String> tailMap = treeMap.tailMap(3, true);
        System.out.println("TailMap (≥ 3): " + tailMap);

        // Descending map
        NavigableMap<Integer, String> descendingMap = treeMap.descendingMap();
        System.out.println("Descending map: " + descendingMap);

        // Size
        System.out.println("Size: " + treeMap.size());

        // Clear the map
        treeMap.clear();
        System.out.println("After clearing: " + treeMap);
        System.out.println("Is empty? " + treeMap.isEmpty());
    }
}
