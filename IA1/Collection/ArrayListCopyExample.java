import java.util.*;

public class ArrayListCopyExample {
    public static void main(String[] args) {
       
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        
        List<String> alphabets = new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");  // Extra element to make the size larger
        alphabets.add("E");  // Extra element to make the size larger

        // Print original lists
        System.out.println("Original colors list: " + colors);
        System.out.println("Original alphabets list: " + alphabets);

        // Copy colors list to alphabets list
        
        Collections.copy(alphabets, colors);
        Collections.shuffle(alphabets);
        Collections.swap(colors, 0, 2);
        colors.subList(0, 3);
        System.out.println(colors);
        
        // Print updated lists
        System.out.println("Updated colors list: " + colors);
        System.out.println("Updated alphabets list: " + alphabets);
    }
}
