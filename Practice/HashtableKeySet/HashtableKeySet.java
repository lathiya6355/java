import java.util.Hashtable;
import java.util.Set;

public class HashtableKeySet {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Retrieving keys using keySet()
        Set<String> keys = hashtable.keySet();

        // Iterating through the keys and displaying them
        System.out.println("Keys in the Hashtable:");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
