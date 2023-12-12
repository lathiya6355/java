import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReadOnlyCollection {
    public static void main(String[] args) {
        Collection<String> mutableCollection = new ArrayList<>();
        mutableCollection.add("apple");
        mutableCollection.add("banana");

        // Create an unmodifiable view of the mutable collection
        Collection<String> readOnlyCollection = Collections.unmodifiableCollection(mutableCollection);

        // Trying to modify the read-only collection will throw an exception
        // readOnlyCollection.add("orange"); // This will throw UnsupportedOperationException

        // Displaying elements of the read-only collection
        System.out.println("Elements in the read-only collection:");
        for (String element : readOnlyCollection) {
            System.out.println(element);
        }
    }
}
