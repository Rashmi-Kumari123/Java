import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        // 1. ArrayList Example
        System.out.println("ArrayList Example:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        arrayList.add("Java");  // Duplicates allowed
        System.out.println("ArrayList: " + arrayList);
        
        // 2. LinkedList Example
        System.out.println("\nLinkedList Example:");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("LinkedList: " + linkedList);
        
        // Common List Operations
        System.out.println("\nCommon List Operations:");
        
        // Adding elements
        arrayList.add(2, "C++");  // Add at specific index
        System.out.println("After adding C++ at index 2: " + arrayList);
        
        // Removing elements
        arrayList.remove("Java");  // Removes first occurrence
        System.out.println("After removing Java: " + arrayList);
        
        // Getting elements
        String element = arrayList.get(1);
        System.out.println("Element at index 1: " + element);
        
        // Checking if element exists
        boolean contains = arrayList.contains("Python");
        System.out.println("Contains Python? " + contains);
        
        // List size
        System.out.println("Size of list: " + arrayList.size());
        
        // Iterating through list
        System.out.println("\nIterating through list:");
        for (String item : arrayList) {
            System.out.println(item);
        }
            
        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Sorting a list
        Collections.sort(arrayList);
        System.out.println("\nSorted list: " + arrayList);
        
        // SubList
        List<String> subList = arrayList.subList(0, 2);
        System.out.println("Sublist (0-2): " + subList);
        
        // Vector Example (Thread-safe)
        System.out.println("\nVector Example:");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Vector: " + vector);
        
        // Stack Example (LIFO)
        System.out.println("\nStack Example:");
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third"); 
        System.out.println("Stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
