import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnCollectionClass  {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(45);
        // list.add(56);
        // list.add(5);
        // list.add(7);

        // System.out.println("Print min Numbers = " + Collections.min(list)); // find min number
        // System.out.println("Print max Numbers = " + Collections.max(list)); // find max number
        // System.out.println("Check Frequency = " + Collections.frequency(list,45)); // how many time number is come.

        // Collections.sort(list);
        // System.out.println("Sort List assending oreder = " + list); // sorting assending order

        // Collections.sort(list, Comparator.reverseOrder());
        // System.out.println("Sort List decending order = " + list); // sorting decending order


// sort using number basis and name basis ================================

Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("prince", 20);
        numbers.put("Dhruvil", 35);
        numbers.put("Hiren", 21);
        numbers.put("Sahil", 22);
        numbers.put("two", 22);

        // Convert the map entries to a list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(numbers.entrySet());

        // Sort the list based on values using Comparator
        list.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to preserve the order of sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted map
        System.out.println("Sorted Map by Values:");
        System.out.println(sortedMap);
}
}
