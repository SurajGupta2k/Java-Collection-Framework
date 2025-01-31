package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack: " + stack);

        // Pop element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("After pop: " + stack);

        // Peek at top element
        String top = stack.peek();
        System.out.println("Top element: " + top);
        System.out.println("Stack unchanged after peek: " + stack);

        // Search for element (returns 1-based position from top)
        int position = stack.search("First");
        System.out.println("Position of 'First' from top: " + position);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Size of stack
        System.out.println("Stack size: " + stack.size());

        // Clear the stack
        while (!stack.empty()) {
            System.out.println("Popping: " + stack.pop());
        }
        System.out.println("After clearing: " + stack);
    }
}
