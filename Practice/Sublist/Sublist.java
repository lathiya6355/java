import java.util.ArrayList;
import java.util.List;

public class Sublist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Finding a sublist from index 1 (inclusive) to index 4 (exclusive)
        List<Integer> subList = numbers.subList(1, 5);

        System.out.println("Original List: " + numbers);
        System.out.println("Sublist from index 1 to 5: " + subList);
    }
}
