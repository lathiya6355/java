import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {
    public static void main(String[] args) {
        // Creating a list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Displaying original list
        System.out.println("Original List: " + numbers);

        // Reversing the list using Collections.reverse()
        Collections.reverse(numbers);

        // Displaying reversed list
        System.out.println("Reversed List: " + numbers);
    }
}
