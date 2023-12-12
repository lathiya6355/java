import java.util.*;

public class CollectionSize {
    public static void main(String[] args) {
        // List example
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        // Getting size of the list
        int listSize = numbersList.size();
        System.out.println("Size of List: " + listSize);

        // Set example
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        namesSet.add("Charlie");

        // Getting size of the set
        int setSize = namesSet.size();
        System.out.println("Size of Set: " + setSize);

        // Map example
        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("Alice", 25);
        agesMap.put("Bob", 30);
        agesMap.put("Charlie", 28);
        agesMap.put("Charlie", 28);
        agesMap.put("Charlie", 28);

        // Getting size of the map
        int mapSize = agesMap.size();
        System.out.println("Size of Map: " + mapSize);
    }
}
