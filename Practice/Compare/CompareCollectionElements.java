import java.util.ArrayList;
import java.util.Collections;

public class CompareCollectionElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        // Comparing elements using Collections.max() and Collections.min()
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum element in the collection: " + max);
        System.out.println("Minimum element in the collection: " + min);

        // Comparing elements using equals() method
        int element1 = numbers.get(0);
        int element2 = numbers.get(1);

        if (element1 == element2) {
            System.out.println("Element at index 0 is equal to element at index 1");
        } else {
            System.out.println("Element at index 0 is not equal to element at index 1");
        }

        // Comparing elements using compareTo() method (for objects implementing Comparable)
        String str1 = "apple";
        String str2 = "banana";

        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("Strings are equal");
        } else if (comparisonResult < 0) {
            System.out.println("str1 comes before str2");
        } else {
            System.out.println("str1 comes after str2");
        }
    }
}
