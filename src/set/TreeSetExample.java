package set;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements (automatically sorted)
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(3);
        numbers.add(8);
        System.out.println("TreeSet: " + numbers);

        // Get first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Get element less than or equal to given element
        System.out.println("Floor of 9: " + numbers.floor(9));
        System.out.println("Floor of 10: " + numbers.floor(10));

        // Get element greater than or equal to given element
        System.out.println("Ceiling of 9: " + numbers.ceiling(9));
        System.out.println("Ceiling of 10: " + numbers.ceiling(10));

        // Get element strictly less than given element
        System.out.println("Lower than 10: " + numbers.lower(10));

        // Get element strictly greater than given element
        System.out.println("Higher than 10: " + numbers.higher(10));

        // Get and remove first element
        System.out.println("Poll first: " + numbers.pollFirst());
        System.out.println("After poll first: " + numbers);

        // Get and remove last element
        System.out.println("Poll last: " + numbers.pollLast());
        System.out.println("After poll last: " + numbers);

        // Get subset
        NavigableSet<Integer> subset = numbers.subSet(5, true, 10, true);
        System.out.println("Subset [5..10]: " + subset);

        // Get head set (less than element)
        NavigableSet<Integer> headSet = numbers.headSet(8, true);
        System.out.println("Head set (≤ 8): " + headSet);

        // Get tail set (greater than or equal to element)
        NavigableSet<Integer> tailSet = numbers.tailSet(8, true);
        System.out.println("Tail set (≥ 8): " + tailSet);

        // Descending order
        NavigableSet<Integer> descendingSet = numbers.descendingSet();
        System.out.println("Descending order: " + descendingSet);

        // Size
        System.out.println("Size: " + numbers.size());

        // Clear the set
        numbers.clear();
        System.out.println("After clearing: " + numbers);
    }
}
