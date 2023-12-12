import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEnumeration {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Using keys() method to get Enumeration of keys
        Enumeration<String> keys = hashtable.keys();

        // Iterating through keys and displaying key-value pairs
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // using elements() method to get Enumeration of values
        Enumeration<Integer> values = hashtable.elements();

        // Iterating through values and displaying them
        while (values.hasMoreElements()) {
            Integer value = values.nextElement();
            System.out.println("Value: " + value);
        }
    }
}

