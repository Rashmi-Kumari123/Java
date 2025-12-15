import java.util.*;
public class HashSetExample1 {
    public static void main(String[] args) {
        // Creating an empty hash set
        Set<String> set = new HashSet<String>();
        
        // Adding elements to HashSet
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");
        set.add("Fifth");
        
        System.out.println("HashSet contents: " + set);
        
        // You can also iterate through the set
        System.out.println("\nIterating through the set:");
        for(String item : set) {
            System.out.println(item);
        }
    }
}
