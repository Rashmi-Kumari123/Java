import java.util.*;
 
public class ColorSearch {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        colors.add("white");  
        colors.add("Black");

        colors.add(0, "blue");
        colors.add(5, "Pink");
        // colors.set(3, "Pink");
        // colors.remove(5);
        // colors.remove("green");
        System.out.println(colors.contains("green"));

        System.out.println("New color list:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(i + ": " + colors.get(i));
        }

        // Search for "white"
        // String searchColor = "white";
        // int index = colors.indexOf(searchColor);

        // Check if "white" was found and print the result
        // if (index != -1) {
        //     System.out.println(searchColor + " found at index " + index);
        // } else {
        //     System.out.println(searchColor + " not found in the list");
        // }
        Collections.sort(colors);
        
        System.out.println("\nSorted color list:");
        System.out.println(colors);
        Collections.reverse(colors);
        

        System.out.println("\nReversed color list:");
        System.out.println(colors);
    }
}
