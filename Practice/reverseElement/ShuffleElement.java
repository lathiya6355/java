import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElement {
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

        // Shuffling the list using Collections.shuffle()
        Collections.shuffle(numbers);

        // Displaying shuffled list
        System.out.println("Shuffled List: " + numbers);
    }
}

