import java.util.ArrayList;
import java.util.Collection;

public class RemoveElement {
    public static void main(String[] args) {
        // Create a Collection (ArrayList in this case)
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("orange");
        collection.add("banana"); // Adding another "banana"

        // Display the collection before removal
        System.out.println("Collection before removal: " + collection);

        // Remove a specific element from the Collection
        String elementToRemove = "banana";
        // String elementToRemove1 = "apple";
        collection.remove(elementToRemove); // Removes the first occurrence of "banana"
        // collection.remove(elementToRemove1); // Removes the first occurrence of "banana"

        // Display the collection after removal
        System.out.println("Collection after removing \"" + elementToRemove + "\": " + collection);
    }
}
