import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        // Create a Collection (ArrayList in this case)
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("orange");
        collection.add("grapes");
        collection.add("mango");

        // Convert the Collection to an array
        String[] array = collection.toArray(new String[0]);

        // Display the elements in the array (converted from Collection)
        System.out.println("Elements in the Array (converted from Collection):");
        System.out.println(Arrays.toString(array));
    }
}

