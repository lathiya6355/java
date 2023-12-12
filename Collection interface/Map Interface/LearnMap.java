import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("prince", 20);
        numbers.put("Dhruvil", 35);
        numbers.put("Hiren", 21);
        numbers.put("Sahil", 22);
        numbers.put("two", 22);

        // if (!numbers.containsKey("two")) {
        //     numbers.put("two", 22);
        // }

        numbers.remove("Hiren"); // remove a element use in treemap
        // numbers.putIfAbsent("two", 22);
        System.out.println(numbers); // put value in hashmap

// iterator===================

            // for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            //     System.out.println("iterator = " + e);
            //     System.out.println("Key = " + e.getKey());
            //     System.out.println("value = " + e.getValue());
            // }

            // for(String key:numbers.keySet()){
            //     System.out.println("Key = " + key);
            // }
    }
    
}
